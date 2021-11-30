import java.io.FileReader;
public class ImplExample implements Hello
{
    public void printMsg()
    {
        try 
        {
            FileReader fr = new FileReader("impfile.txt");
            int i;
            while((i=fr.read())!=-1)  
                System.out.print((char)i);    
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
}