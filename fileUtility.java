import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

public class fileUtility {
    public static String[] toStringArray(
    String path,
    String del //Delimiter pattern

    ) throws IOException{
        return Files.lines(Paths.get(path))
        .flatMap(line -> Stream.of(line.split(del)))
        .filter(word -> !word.isEmpty())
        .map(word -> word.toLowerCase())
        .toArray(String[]::new);

    }
    String[] works = toStringArray("Shakespearsworks", "['^a-zA-z']");  
}
