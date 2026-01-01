import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Chatgpt {
    public static void main(String[] args) {
        Path p=Path.of("example.txt");
        try{
   String content= Files.readString(p);
   System.out.println(content);
        }
    catch(IOException e){
        System.out.println("not found file");
    }
      try{
   Files.writeString(p,"updated",StandardOpenOption.APPEND);
   String content= Files.readString(p);
   System.out.println(content);
        }
    catch(IOException e){
        System.out.println("not found file");
    }
    try{
Files.writeString(Path.of("two.txt"),"vanakam",StandardOpenOption.CREATE_NEW);
    }
    catch(IOException e){
         System.out.println("file already exixts");
    }
    }
}
