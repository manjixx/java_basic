package juc.in.practice.chapter6;

import sun.misc.Request;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description ：关闭Web服务器的两种方法，
 * 1. 调用stop
 * 2. 客户端请求形式向web服务器发送http请求
 *
 * @author： manji
 * 2018/8/6 14:40
 */
public class LifeCycleWebServer {
    private final ExecutorService exec = Executors.newCachedThreadPool();

    public void start() throws IOException{
        ServerSocket socket= new ServerSocket(80);
        while(!exec.isShutdown()){
            try {
                final Socket conn = socket.accept();
                exec.execute(new Runnable() {
                    @Override
                    public void run() {
                        handleRequest(conn);
                    }
                });
            } catch (IOException e) {
                if ((!exec.isShutdown())){
                    //打日志
                }
            }
        }// end while
    }

    public void stop(){
        exec.shutdown();
    }

    /**
     * 请求处理
     * @param connection
     */
    void handleRequest(Socket connection) {
        Request req = readRequest(connection);
        // 如果哦是shutdown请求 直接调用stop
        if (isShutdownRequest(req)){
            stop();
        }else {
            //不是shutdown请求,请求分发
            dispatchRequest(req);
        }
    }

    private void dispatchRequest(Request req) {
    }
    private boolean isShutdownRequest(Request req) {
        return true;
    }
    private Request readRequest(Socket connection) {
        return null;
    }

}
