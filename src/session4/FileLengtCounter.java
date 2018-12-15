package session4;

import java.io.File;
import java.util.concurrent.Callable;

public class FileLengtCounter implements Callable<Long> {
    private String fileAdress;

    public FileLengtCounter(String fileAdress) {
        super();
        this.fileAdress = fileAdress;
    }

    @Override
    public Long call() throws Exception {
        File file = new File(fileAdress);
        if (!file.exists() || !file.isFile()) {
            return 0L;
        }
        long length = file.length();
        System.out.println(file.getAbsoluteFile() + "  " + length);
        return length;
    }
}
