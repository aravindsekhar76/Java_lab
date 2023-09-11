import java.io.*;

public class filewriting{
    public static void main(String[] args) {
        String filepath ="fileoutput.txt";

        try
        {
            FileWriter fwrite = new FileWriter(filepath,true);
            // BufferedWriter Bwrite = new  BufferedWriter(fwrite);
            String word="hello world";
            fwrite.write(word);
            fwrite.close();
            // String s;
            // FileReader fread = new FileReader(filepath);
            // BufferedReader bread = new BufferedReader(fread);
            // while((s=bread.readLine())!=null){
            //     System.out.println(s);
            // }
            // fread.close();
            // bread.close();
        }
        catch(IOException e){

            e.setStackTrace(null);

        }
    }
}