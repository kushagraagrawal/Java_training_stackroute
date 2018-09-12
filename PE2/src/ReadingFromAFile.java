import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class ReadingFromAFile {
    public static int ReadAndCapitalise(String filename) throws Exception{

        File file = new File(filename);
        FileReader fr = new FileReader(file);
        int count = 0;
        int i = fr.read();
        StringBuilder tobeWritten1 = new StringBuilder("");
        while(i!=-1){
            char tobeWritten = (char)i;
            tobeWritten1.append(Character.toUpperCase(tobeWritten));
            i = fr.read();
            count++;
        }
        fr.close();

        FileWriter wr = new FileWriter(file);
        String answer = tobeWritten1.toString();
        wr.write(answer);
        wr.close();
        return count;
    }
    public static void main(String[] args) throws IOException {
        try{
            int count = ReadAndCapitalise("TextFile.txt");
            System.out.println(count);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
