package session6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketEx {
    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(20000);
            Socket incoming = s.accept();
            try {
                Scanner sc = new Scanner(incoming.getInputStream());
                PrintWriter out = new PrintWriter(incoming.getOutputStream(), true);
                boolean exit = true;
                for (; exit; ) {
                    String line = sc.nextLine();
                    out.println("Ответ сервера " + line);
                    if (line.compareTo("exit") == 0) {
                        exit = false;
                    }
                }
            } finally {
                incoming.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("END");
    }
}
