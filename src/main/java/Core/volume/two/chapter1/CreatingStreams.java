package Core.volume.two.chapter1;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author manji
 * @date 2019-03-12 11:35
 */
public class CreatingStreams {

    public static <T> void show(String title, Stream<T> stream) {

        final int SIZE = 10;

        // todo explain collect 把stream收集到集合中
        List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());

        System.out.println(title + ":");

        for (int i = 0; i < firstElements.size(); i++) {
            if (i > 0) System.out.println("，");
            if (i < SIZE) System.out.println(firstElements.get(i));
            else System.out.println(" ... ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("../resource/alice30.txt");
        String contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        //static <T> Stream<T> of(T ... values)
        // 产生一个元素为给定值的流
        Stream<String> words = Stream.of(contents.split("\\PL+"));
        show("words", words);
        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        show("song", song);

        //static <T> Stream<T> empty()
        // 产生一个不包含任何元素的 Stream
        Stream<String> silence = Stream.empty();
        show("silence", silence);

        //static <T> Stream<T> generate(Supplier<T> s)
        //产生一个无限Stream，其值通过反复调用函数s 构建而成
        Stream<String> echos = Stream.generate(() -> "Echo");
        show("echos", echos);

        Stream<Double> randoms = Stream.generate(Math::random);
        show("randoms", randoms);

        // static <T> Stream<T> iterate(T seed , UnaryOperator<T> f)
        // 产生一个无限流，元素包含种子、在种子上调用 f 产生的值，在前一个元素上调用f产生的值
        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE,
                n -> n.add(BigInteger.ONE));
        show("integers", integers);

        // java.util.regex.Pattern
        // Stream<String> splitAsStream(final CharSequence input)
        Stream<String> wordsAnotherWay = Pattern.compile("\\PL+").splitAsStream(contents);
        show("wordsAnotherWay", wordsAnotherWay);

        // java.nio.file.Files
        //static Stream<String> lines(Path path, Charset cs)
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            show("lines", lines);
        }

        // java.util.Arrays
        // static <T> Stream<T> stream(T[] array, int startInclusive, int endExclusive)



    }

}
