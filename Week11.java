/* */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Week11
{
    public static void main(String[] args) throws IOException
	{
		try
                {
                    int i;
                    FileReader fr=new FileReader("input1.txt");
                    FileWriter fw=new FileWriter("output.txt");
                    while((i=fr.read())!=-1)
                        fw.write(i);
                    System.out.println("Writing is successful");
                    fw.close();
                }
                catch(IOException e)
                {
                    System.out.print(e);
                }
        }       
}
