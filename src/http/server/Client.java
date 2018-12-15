package http.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {
    private Socket soc;
    private String ansv;
    private Thread thread;

    public Client(Socket soc, String ansv) {
        super();
        this.soc = soc;
        this.ansv = ansv;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        try (InputStream is = soc.getInputStream();
             OutputStream os = soc.getOutputStream();
             PrintWriter pw = new PrintWriter(os)) {
            byte[] rec1 = new byte[is.available()];
            is.read(rec1);
            String response = "HTTP/1.1 200 OK\r\n" +
                    "Server: My_Server\r\n" +
                    "Content-Type: " +
                    "text/html\r\n" +
                    "Content-Length: " + "\r\n" +
                    "Connection: close\r\n\r\n";
            pw.print(response + ansv);
            pw.flush();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
