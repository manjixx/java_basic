package juc.in.practice.chapter6;

import java.util.concurrent.Executor;

/**
 * Description ：修改Executor 的执行内容很简单，就是实现Executor接口并实现Executor的方法
 * @author： manji
 * 2018/8/2 15:00
 */
public class ThreadPerTaskExecutor implements Executor {
    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}
