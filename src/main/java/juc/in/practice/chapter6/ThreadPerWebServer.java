package juc.in.practice.chapter6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * Description ：
 * @author： manji
 * 2018/8/2 10:30
 */
public class ThreadPerWebServer {

    public static void main(String[] args) throws IOException{
        ServerSocket socket = new ServerSocket(80);
        while (true){
            final Socket connection = socket.accept();
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    handleRequest(connection);
                }
                private void handleRequest(Socket connection) {
                    System.out.println(connection);
                }
            };
            new Thread(task).start();
        }
    }
}
