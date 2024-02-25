package exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static consts.Consts.FILE_WRITE_OPTIONS;

public class FileProcessor {
    public List<String> readFile(String filename) throws FileProcessingException {
        try {
            Path filePath = Path.of(filename);
                return Files.readAllLines(filePath);
        }catch (IOException| InvalidPathException e){
            throw new FileProcessingException(e.getMessage(),e);
        }
    }
public void writeFile (String filename,String content) throws FileProcessingException {
        try {
            Path filePath = Path.of(filename);
            Path path = Files.writeString(filePath, content, FILE_WRITE_OPTIONS);

        }catch (IOException  e){
            throw new FileProcessingException(e.getMessage(),e);
        }
}
}
