package juc.in.practice.chapter5.search4desktop;

import java.io.File;
import java.util.concurrent.BlockingQueue;

/**
 * Description ：对标FileCrawler
 * @author： manji
 * 2018/8/1 15:11
 */
public class Indexer implements Runnable {
    private final BlockingQueue<File> queue;
    public Indexer(BlockingQueue<File> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while (Boolean.TRUE){
            try {
                indexFile(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void indexFile(File take) {
    }

}
