// // import java.io.FileReader;
// // import java.io.BufferedReader;
// // import java.io.IOException;
import java.io.*;

public class filereading{
public static void main(String[] args) {
    String filepath = "fileinput.txt";
    try{

        FileReader fread = new FileReader(filepath);
        BufferedReader bread = new BufferedReader(fread);

        String word;
        while((word=bread.readLine())!=null){
            System.out.println(word);
        }
        fread.close();
    }
    catch(IOException g)
    {
        g.printStackTrace();
        System.out.println("Error");
    }
}
}