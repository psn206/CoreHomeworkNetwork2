import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("Server started");
        int port = 8089;
        ServerSocket serverSocket = new ServerSocket(port);
        while (true){
            Socket clientSocet = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocet.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocet.getInputStream()));
            out.println("Write your name?");
             String name = in.readLine();
            out.println("Are you child? (yes/no)");
             String answer = in.readLine();
            if (answer.equals("yes")){
                out.println(String.format("Welcome to the kids area,"+name+ "! Let's play!  ", clientSocet.getPort()));
            } else {
                out.println(String.format("Welcome to the adult zone, " +name+ "! Have a good rest, or a good working day!", name, clientSocet.getPort()));
            }

        }
    }
}
