// A Java program for a Client
import java.io.*;
import java.net.*;
 
public class Client {
    // initialize socket and input output streams
    private Socket socket = null;
    private BufferedReader input = null;
    private DataOutputStream out = null;
    private DataInputStream in = null;
 
    // constructor to put ip address and port
    public Client(String address, int port)
    {
        // establish a connection
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");
 
            // takes input from terminal
            //input = new DataInputStream(System.in);
            input = new BufferedReader(new InputStreamReader(System.in));
 
            // sends output to the socket
            out = new DataOutputStream(
                socket.getOutputStream());

            in = new DataInputStream(new BufferedInputStream(socket.getInputStream())); 
            
        }
        catch (UnknownHostException u) {
            System.out.println(u);
            return;
        }
        catch (IOException i) {
            System.out.println(i);
            return;
        }
        
        // string to read message from input
        String line = "";
        String rline = "";

        // keep reading until "Over" is input
        while (!line.equals("Over")) {
            try {
                line = input.readLine();
                out.writeUTF(line);
                rline = in.readUTF();
                System.out.println(rline);
            }
            catch (IOException i) {
                System.out.println(i);
            }
        }
 
        // close the connection
        try {
            input.close();
            out.close();
            socket.close();
        }
        catch (IOException i) {
            System.out.println(i);
        }
    }
 
    public static void main(String args[])
    {
        Client client = new Client("localhost", 5000);
    }
}