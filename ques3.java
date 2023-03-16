import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ques3
{
    //Ques 3):  Write a program to count number of
    // occurrences of a word in a file.
    // The file name and word should be supplied through commandline.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the file name");
        String filename = "src/"+sc.nextLine();
        String line;
        int count=0;
        try
        {
            FileReader fi = new FileReader(filename);
            BufferedReader br =new BufferedReader(fi);
            while((line=br.readLine())!=null)
            {
                String words[]= line.split(" ");
                for(String w:words){
                    if(w.equals(words))
                    {
                        count++;
                    }
                }
            }
            fi.close();
            System.out.println("count:"+count);
        }
        catch (IOException e)
        {
            System.out.println("file not found error");
        }
    }

}
