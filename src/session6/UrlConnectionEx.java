package session6;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionEx {
    public static void main(String[] args) {
        try{
            int c;
            URL url=new URL("https://www.google.ru/?gws_rd=ssl");
            URLConnection urlc=url.openConnection();
            System.out.println(urlc.getDate());
            System.out.println(urlc.getContentType());
            long l=urlc.getContentLengthLong();
            if(l!=0){
                System.out.println();
                InputStream ins=urlc.getInputStream();
                for(;(c=ins.read())!=-1;){
                    System.out.print((char)c);
                }
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
