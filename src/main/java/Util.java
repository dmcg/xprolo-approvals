import com.google.common.base.Charsets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Util {
    public static String readFileToString(Path path) throws IOException {
        return new String(Files.readAllBytes(path), Charsets.UTF_8);
    }
}
