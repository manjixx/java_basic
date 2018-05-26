package juc.artofconcurrent.chapter4.minutiaOne;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.List;

/**
 * C4 - 1
 * Created by manji on 2018/5/26.
 */
public class MultiThread  {

    public static void main(String[] args) {

        /**
         * 获取Java 线程管理MXBean
         */
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        /**
         * 仅仅获取线程和线程堆栈信息 不需要同步 monitor 和 Synchronize 信息
         */
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(Boolean.FALSE, Boolean.FALSE);
        /**
         * 数组转集合
         */
        List<ThreadInfo> threadInfoList = Arrays.asList(threadInfos);

        threadInfoList.forEach(
                threadInfo -> System.out.println("[" + threadInfo.getThreadId() + "] : " + threadInfo.getThreadName())
        );

    }

}




























