package juc.in.practice.chapter6;

import com.sun.scenario.effect.impl.prism.PrImage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Description ：基于线程池的Web服务
 * @author： manji
 * 2018/8/2 14:40
 */
public class TaskExecutionWebServer {
    private static final int NTHREADS = 100;
    private static final Executor executor = Executors.newFixedThreadPool(NTHREADS);

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
                }
            };
            executor.execute(task);
        }
    }
}
