package http.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
// https://github.com/alex-zr/oop
public class Main {
    public static void main(String[] args) {
        String answer = getContent();
        try (ServerSocket soc = new ServerSocket(8080)) {
            for (;;) {
                Socket clientSocket = soc.accept();
                new Client(clientSocket, answer);
            }
        } catch (IOException e) {
            System.out.println("Error to server Socket Open!!!");
        }
    }

    private static String getContent() {
        String ansver = "";
        Group gr = new Group("PN121");
        gr.addStudent(new Student("Ivanov", "Ivan", 3));
        gr.addStudent(new Student("Petrov", "Petr", 4));
        gr.addStudent(new Student("Sidorov", "Sidr", 5));
        gr.addStudent(new Student("Garbuzov", "Grbuz", 1));
        ansver += "<html><head><title>Student</title> <meta charset='utf-8'></head><body><p>Список студентов группы: "
                + gr.getName() + "</p><br>";
        ansver += "<table border='2' cellpadding='5' ><tr><th>Фамилия</th><th>Имя</th><th>Курс</th></tr>";
        Student[] starr = gr.getGroup();
        for (int i = 0; i < starr.length; i++) {
            ansver += "<tr>";
            ansver += "<td>" + starr[i].getName() + "</td>";
            ansver += "<td>" + starr[i].getLastname() + "</td>";
            ansver += "<td>" + starr[i].getCourse() + "</td>";
            ansver += "</tr>";
        }
        ansver += "<a href='/details'>Click me!</a>";
        ansver += "</table></body></html>";
        return ansver;
    }
}
