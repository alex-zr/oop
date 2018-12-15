package session4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorEx {
    public static void main(String[] args) {
        System.out.println(calculateFolderSize("."));
    }

    public static Long calculateFolderSize(String folderAdress) {
        File file = new File(folderAdress);
        File[] fileArray = file.listFiles();
        ExecutorService exSer = Executors.newFixedThreadPool(3);
        List<Callable<Long>> tasks = new ArrayList<>();
        for (File fileElement : fileArray) {
            tasks.add(new FileLengtCounter(fileElement.getAbsolutePath()));
        }
        List<Future<Long>> result = null;
        try {
            result = exSer.invokeAll(tasks);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        Long totalSize = 0L;
        for (Future<Long> future : result) {
            try {
                totalSize += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        exSer.shutdown();
        return totalSize;
    }
}
