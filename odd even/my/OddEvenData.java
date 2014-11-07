import java.io.*;
class OddEvenData
{
    public static void main(String args[])throws FileNotFoundException,IOException
    {
     try
     {
     DataInputStream dis=new DataInputStream(System.in);
     int i;
	int t;
	int a[]=new int[10];
	File f=new File("Data.txt");
	File f1=new File("Even.txt");
	File f2=new File("Odd.txt");
	FileInputStream fis1= new FileInputStream(f);
 	FileOutputStream fis2 = new FileOutputStream(f);
    FileOutputStream fos1 = new FileOutputStream(f1);
    FileOutputStream fos2 = new FileOutputStream(f2);
	for(i=0;i<10;i++)
	fis2.write(a[i]);
            int b;
            while((b=fis1.read())!=-1)
            {
                if(b%2==0)
				{
					System.out.print(b+" --> Added to EVEN.txt");
                	fos1.write(b);
				}
				else
				{
					System.out.print(b+" --> Added to ODD.txt");
                	fos2.write(b);
				}
            }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
 
    }
}