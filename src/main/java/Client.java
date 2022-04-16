import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8089;
        Scanner scanner = new Scanner(System.in);
        try (Socket clientSocket = new Socket(host, port)) {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String readServer = in.readLine();
            System.out.println(readServer);
            String readUser = scanner.nextLine();
            out.println(readUser);
            readServer = in.readLine();
            System.out.println(readServer);
            readUser = scanner.nextLine();
            out.println(readUser);
            readServer = in.readLine();
            System.out.println(readServer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}