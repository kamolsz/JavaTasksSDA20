package tasksOnDay5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PanTadeusz {

    public static void main(String[] args) throws IOException {
 /*       Map<String, Integer> result = countWordsMost(3);
        result.entrySet()
                .stream()
                .sorted((o1,o2) -> o2.getValue()-o1.getValue())
                .limit(5).forEach(System.out::println);*/
        System.out.println();
        System.out.println(countWords("Tadeusz"));
        System.out.println(countWords2("Tadeusz"));

    }

    public static Map<String, Integer> countWordsMost(int charSizeToIgnore) throws IOException {
        List<String> list = filePath();
        Map<String, Integer> wordCounter = new HashMap<>();
        List<String> listWithEachWord = list.stream()
                .map(line -> line.split("[\\s,.!:?\\-«;]+"))
                .flatMap(Arrays::stream)
                .filter(string -> string.length() > charSizeToIgnore)
                .collect(Collectors.toList());
        for (String word : listWithEachWord) {
            if (wordCounter.containsKey(word)) {
                wordCounter.put(word, wordCounter.get(word) + 1);
            } else {
                wordCounter.put(word, 1);
            }
        }
        return wordCounter;
    }

    public static long countWords(String word) throws IOException {
        List<String> listWithPanTadeusz = Files.lines(Paths.get("pan-tadeusz.txt"))
                .collect(Collectors.toList());
        return listWithPanTadeusz.stream()
                .map(line->line.split(" "))
                .flatMap(Arrays::stream)
                .filter(w -> w.toLowerCase().contains(word.toLowerCase()))
                .count();
    }

    public static long countWords2(String word) throws IOException {
        String list= readFilePath();
        return Arrays.stream(list.split("[\\s,.!:?]+"))
                .filter(x-> x.toLowerCase().contains(word.toLowerCase())).count();
    }

    private static List<String> filePath() throws IOException {
        return Files.lines(Paths.get("pan-tadeusz.txt")).collect(Collectors.toList());
    }
    private static String readFilePath() throws IOException {
        return Files.readString(Paths.get("pan-tadeusz.txt"));
    }
}
