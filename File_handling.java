

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;


public class File_handling{
    

    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("data.txt");// have the file address
       System.out.println(filePath);
       System.out.println(Path.of("").toAbsolutePath());//get current file location
       System.out.println(filePath.getRoot());
       try{
        System.out.println(Files.readString(filePath));
        System.out.println("Success!!!");
       }
       catch(IOException e){
           System.out.println("we can't able to read the file");
       }
       try{
        Files.writeString(filePath,"heyy");
        System.out.println(Files.readString(filePath));
       }
       catch(IOException e){
           System.out.println("we can't able to write");
       }
    try (InputStream in = Files.newInputStream(Path.of("data.txt"))) {
    int b;
    while ((b = in.read()) != -1) {
        System.out.print((char) b);
    }
}
    }
}

