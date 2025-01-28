/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.breaze.tcpdemoserver;

import com.breaze.tcpdemoserver.networklayer.TCPServer;

/**
 *
 * @author breaze
 */
public class TCPDemoServer {

    public static void main(String[] args) {
        TCPServer server = new TCPServer(9090);
        server.start();
    }
}
