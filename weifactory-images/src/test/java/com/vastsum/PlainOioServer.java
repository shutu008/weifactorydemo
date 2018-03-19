package com.vastsum;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @author ssj
 * @create 2017-11-05 12:39
 */
public class PlainOioServer {

    public void server(int port) throws Exception{
        final ServerSocket serverSocket = new ServerSocket(port);

        try {
            while (true){
                //accept connection
                final Socket clientSocket = serverSocket.accept();
                System.out.println("Accepted connection from " + clientSocket);
                //create new thread to handle connection

               new Thread( new Runnable(){
                    OutputStream out;
                    @Override
                    public void run() {

                        try {
                            out = clientSocket.getOutputStream();
                            out.write("HI!\r\n".getBytes(Charset.forName("UTF-8")));
                            out.flush();
                            clientSocket.close();
                        } catch (IOException e) {

                            try {
                                clientSocket.close();
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                }).start();


            }
        } catch (Exception ex){
            ex.printStackTrace();
            serverSocket.close();
        }
    }
}
