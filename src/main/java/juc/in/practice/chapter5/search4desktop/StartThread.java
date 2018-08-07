package juc.in.practice.chapter5.search4desktop;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Description ：启动生产者消费者线程
 * @author： manji
 * 2018/8/1 15:24
 */
public class StartThread {

    public static void main(File[] roots) {
        BlockingQueue<File> queue = new LinkedBlockingQueue<>(1024);
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return true;
            }
        };
        for (File root: roots){
            new Thread(new FileCrawler(queue,fileFilter,root)).start();
        }
        for (int i = 0; i<10 ; i++){
            new Thread(new Indexer(queue)).start();
        }

    }
}
