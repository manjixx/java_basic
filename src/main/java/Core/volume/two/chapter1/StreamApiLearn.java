package Core.volume.two.chapter1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 流相关API 学习
 *
 * @author manji
 * @date 2019-03-15 14:39
 */
public class StreamApiLearn {

    /**
     * 字符串转成流
     *
     * @param var1
     * @return
     */
    public static Stream<String> letters(String var1) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < var1.length(); i++)
            result.add(var1.substring(i, i + 1));

        return result.stream();
    }

    public static void main(String[] args) throws IOException, Exception {

//        Path path = Paths.get("../resource/alice30.txt");
//        String contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
//
//        // 执行带方法引用的map
//        Stream<String> lowerCaseWords = Stream.of(contents.split("\\PL+")).map(String::toLowerCase);
//        // 通过lambda表达式代替方法执行
//        Stream<String> firstLetters = Stream.of(contents.split("\\PL+")).map(s -> s.substring(0, 1));
//
//        //汇总流
//        Stream<String> flatMapWords = Stream.of(contents.split("\\PL+")).flatMap(s -> Stream.of(s.split("ll")));
//
//        //抽取子流
//        Stream<Double> limit = Stream.generate(Math::random).limit(100L);
//        Stream<String> skip = Stream.of(contents.split("\\PL+")).skip(1);
//
//        // 连接流
//        Stream<String> concat = Stream.concat(letters("hello"), letters("java"));
//
//
//        // 去重和排序
//        Stream<String> letters =
//                Stream.of("good", "may", "good", "god", "ok", "may")
//                        .distinct()
//                        .sorted(Comparator.comparing(String::length)
//                                .reversed());
//        letters.forEach(System.err::println);

//        // 去重
//        Stream<String> distinct1 = Stream.of("good", "may", "good", "god", "ok", "may").distinct();
//        distinct1.forEach(System.out::println);
//        /* It's funny; we cannot consumer stream again. */
//        System.out.println(distinct1.count());

        // Result : GOOD  good  MAY  may  GOD  god  OK  ok
        // 注意结果的顺序 是一个一个消费 不是全部消费了然后执行后面的 线程不安全的！！
        Stream<String> sourceStream = Stream.of("good", "may", "good", "god", "ok", "may").distinct();
        Stream<String> peek = sourceStream.peek(s -> System.out.println(s.toUpperCase()));
        Thread.sleep(10000L);
        peek.forEach(System.err::println);
        System.out.println(111);



    }


}
