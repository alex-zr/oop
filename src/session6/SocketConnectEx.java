package session6;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketConnectEx {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 20000)) {
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println("GET / HTTP/1.1");
            //pw.println("Host:google.ru/?gws_rd=ssl");
            pw.println("");
            pw.flush();
            InputStream s = socket.getInputStream();
            int r;
            for (; (r = s.read()) != -1; ) {
                System.out.print((char) r);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
