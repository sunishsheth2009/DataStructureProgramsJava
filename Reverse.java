import java.io.*;
class Reverse
{
	public static void main(String args[])throws IOException
	{
		DataInputStream dis=new DataInputStream(System.in);
		String sentence;
		System.out.println("enter the sentence to reversed");
		sentence=dis.readLine();
		int ini=0,f;
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)==' '||i==sentence.length()-1)
			{
				f=i+1;
				System.out.print(myrev(sentence.substring(ini,f)));
				ini=i+1;
			}
		}
	}
	static String myrev(String s)
	{
		char n[]=new char[s.length()];
		int i=0;
		for(int j=s.length()-1;j>=0;j--)
		{
			n[i]=s.charAt(j);
			i++;
		}
		String rev=" ";
		for(i=0;i<s.length();i++)
		{
		 	rev=rev+n[i];
		}
		return(rev);
	}
}