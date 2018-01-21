package sample.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.stream.Collectors;

public class StreamSample {
    public static void main(String[] args) {
        String p = new File(".").getAbsoluteFile().getParent();
        System.out.println(p);
        Path path = Paths.get("./modernStyle/src/main/resources/input.txt");

        try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            reader.lines().map(s -> s.split(" ")[0]).collect(Collectors.toList()).forEach(System.out::println);
        } catch (IOException e){
            System.err.println(e);
        }
    }
}
