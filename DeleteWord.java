import java.io.*;
class DeleteWord
{
	public static void main(String args[])throws IOException
	{
		String delete;
		DataInputStream dis=new DataInputStream(System.in);
		String sentence;
		System.out.println("enter the sentence");
		sentence=dis.readLine();
		System.out.println("enter the word to delete");
		delete=dis.readLine();
		delete=delete+" ";
		String s[]=new String[100];
		int ini=0,f,j=0,count=0;
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)==' '||i==sentence.length()-1)
			{
				f=i+1;
				s[j]=sentence.substring(ini,f);
				j++;
				count++;
				ini=i+1;
			}
		}
		for(j=0;j<count;j++)
		{
			if(s[j].equalsIgnoreCase(delete))
				continue;
				else
					System.out.print(s[j]);
		}
	}
}