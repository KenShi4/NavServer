/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author informatica
 */
public class NavServer {

    /**
     * @param args the command line arguments
     */

    static ServerSocket serverSocket;
    static Socket socket;
    static int nPlayer = 0;
    static String[] playerName = new String[10];
    static DataOutputStream toClient;
    static DataInputStream fromClient;

  public static void main(String[] args) throws IOException 
    {

        try {
            NavServer.serverSocket = new ServerSocket(4444);
            System.out.println("BattleShip Server is running ...");

            while (true) {
                NavServer.socket = serverSocket.accept();
                nPlayer++;
                fromClient = new DataInputStream(NavServer.socket.getInputStream());
                toClient = new DataOutputStream(socket.getOutputStream());

                //get username from client side
                try {
                    System.out.println(nPlayer + " accepted");
                    toClient.writeInt(nPlayer);
                } catch (IOException ex) {
                }
            }
        } catch (IOException ioEx) {
            System.err.println(ioEx);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
        
}
