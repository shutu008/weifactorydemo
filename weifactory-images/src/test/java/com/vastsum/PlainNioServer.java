package com.vastsum;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @author ssj
 * @create 2017-11-05 12:58
 */
public class PlainNioServer {

    public void server(int port) throws Exception{
        System.out.println("Listening for connection on port"+port);
        //open Selector that handles channels
        Selector selector = Selector.open();
        //open ServerSocketChannel
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        //get ServerSocket
        ServerSocket serverSocket = serverChannel.socket();
        //bind server to port
        serverSocket.bind(new InetSocketAddress(port));
        //set to no-blocking
        serverChannel.configureBlocking(false);
        //register ServerSocket to seletctor and specify that it is interested in new accepted clients
        final ByteBuffer msg = ByteBuffer.wrap("HI\r\n".getBytes());
        while (true){
            int n = selector.select();
            if (n>0){
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()){
                    SelectionKey key = iterator.next();
                    iterator.remove();
                    try {
                        //Check if evnet was because new Client ready to get accepted
                        if (key.isAcceptable()){
                            ServerSocketChannel server = (ServerSocketChannel) key.channel();
                            SocketChannel client = server.accept();
                            System.out.println("accept connecton form"+client);
                            client.configureBlocking(false);
                            client.register(selector,SelectionKey.OP_WRITE, msg.duplicate());
                        }
                        if (key.isWritable()){
                            SocketChannel client = (SocketChannel) key.channel();
                            ByteBuffer buff = (ByteBuffer) key.attachment();
                            //write data to connection client
                            while (buff.hasRemaining()){
                                if (client.write(buff) == 0){
                                    break;
                                }
                            }
                            client.close();
                        }
                    }catch (Exception ex){
                        key.cancel();
                        key.channel().close();
                    }
                }
            }
        }

    }
}
