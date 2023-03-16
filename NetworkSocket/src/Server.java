// A Java program for a Server
import java.net.*;
import java.io.*;
 
public class Server extends Thread
{
    //initialize socket and input stream
    private Socket          socket   = null;
    private ServerSocket    server   = null;
    private DataInputStream in       =  null;
    private BufferedReader ter_in       =  null;
    private DataOutputStream out       =  null;
    private int port;
    // constructor with port
    public Server(int port)
    {
        this.port = port;
    }   
    public void run(){
    // starts server and waits for a connection
        try
        {
            server = new ServerSocket(port);
            System.out.println("Server started");
 
            System.out.println("Waiting for a client ...");
 
            socket = server.accept();
            System.out.println("Client accepted");
 
            // takes input from the client socket
            in = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));
 
            // Sends messages to the client
            out = new DataOutputStream(socket.getOutputStream());

            ////
            ter_in = new BufferedReader(new InputStreamReader(System.in));

            String line = "";
            String rline = "";
            // reads message from client until "Over" is sent
            while (!line.equals("Over"))
            {
                try
                {
                    line = in.readUTF();
                    System.out.println(line);
                    rline = ter_in.readLine();
                    out.writeUTF(rline);
                }
                catch(IOException i)
                {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");
 
            // close connection
            socket.close();
            in.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
 
    public static void main(String args[])
    {
        //Server server = new Server(5000);
        Thread server = new Server(5000);
        server.start();
    }
}