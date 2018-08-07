package juc.in.practice.chapter6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description ：串行Web服务器
 * @author： manji
 * 2018/8/2 10:19
 */
public class SingleThreadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(80);
        while (true){
            Socket connection = socket.accept();
            handleRequest(connection);
        }
    }
    private static void handleRequest(Socket connection) {
    }
}
