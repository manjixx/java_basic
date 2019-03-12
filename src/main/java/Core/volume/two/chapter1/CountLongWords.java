package Core.volume.two.chapter1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *  todo 拿不到文件!!!!
 *
 * @author manji
 * @date 2019-03-12 10:33
 */
public class CountLongWords {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("../resource/alice30.txt");
        System.out.println(path);
        String contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        List<String> words = Arrays.asList(contents.split("\\PL+"));
        // iteration 方式
        long count = 0;
        for (String w : words) {
            if (w.length() > 12) count++;
        }
        System.out.println(count);

        // stream 方式
        count = words.stream().filter(w -> w.length() > 12).count();
        System.err.println(count);

        count = words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(count);

    }

    private static String getPath(){
        return CountLongWords.class.getResource("").toString();
    }

}
