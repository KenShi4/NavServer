/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navserver;

import java.net.Socket;
import java.util.ArrayList;
import javax.swing.Box;

/**
 *
 * @author informatica
 */
public class ServerGame {
    private Socket socket;
    private String sName;
    public ServerGame(Socket socket, String sName) 
    {
        this.socket = socket;
        this.sName = sName;
    }
    
    
}
