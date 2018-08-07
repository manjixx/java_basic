package juc.in.practice.chapter5.search4desktop;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;

/**
 * Description ：桌面搜索应用程序中的生产者任务和消费者任务
 *
 * @author： manji
 * 2018/8/1 15:01
 */
public class FileCrawler implements Runnable {
    private final BlockingQueue<File> fileQueue;
    private final FileFilter fileFilter;
    private final File root;
    public FileCrawler(BlockingQueue<File> fileQueue, FileFilter fileFilter, File root) {
        this.fileQueue = fileQueue;
        this.fileFilter = fileFilter;
        this.root = root;
    }

    @Override
    public void run() {
        try {
            crawler(root);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    private void crawler(File root) throws InterruptedException {
        File[] entries = root.listFiles(fileFilter);
        if (entries != null) {
            for (File entry : entries) {
                if (entry.isDirectory()) {
                    crawler(entry);
                } else if (!alreadyIndexed(entry)) {
                    fileQueue.put(entry);
                }
            }
        }
    }

    private boolean alreadyIndexed(File entry) {
        return true;
    }
}
