import java.io.*;
class OddEvenData
{
    public static void main(String args[])throws FileNotFoundException,IOException
    {
     try
     {
     	File f=new File("Data.txt");
		File f1=new File("Even.txt");
		File f2=new File("Odd.txt");
		FileInputStream fis1 = new FileInputStream(f);
 		FileOutputStream fos1 = new FileOutputStream(f1);
   		FileOutputStream fos2 = new FileOutputStream(f2);
        int b;
            while((b=fis1.read())!=-1)
            {
                if(b%2==0)
				{
					System.out.println((char)b+" --> Added to EVEN.txt");
                	fos1.write((char)b);
				}
				else
				{
					System.out.println((char)b+" --> Added to ODD.txt");
                	fos2.write((char)b);
				}
            }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }

    }
}