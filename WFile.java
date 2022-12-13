import java.io.IOException;
import java.io.FileWriter;
class WFile
{
public static void main(String[] args) throws IOException
{
String Str="Hello ... I am Vinay"+" aka Gigachad";
FileWriter fw=new FileWriter("Output.txt");
for(int i=0;i<Str.length();i++)
fw.write(Str.charAt(i));
System.out.println("Writing Successful...");
fw.close();
int ch;
FileReader fr=null;
try
{
fr=new FileReader("Output.txt");
}
catch(FileNotFoundException fe)
{
System.out.print("\tFile Not Found!!!!");
}
while((ch=fr.read())!=-1)
System.out.print((char)ch);
fr.close();
}
}

