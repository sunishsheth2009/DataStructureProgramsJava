import java.io.*;
class Validity
{
	char stack[];
	int i,a;
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	Validity()
	{
		stack=new char[20];
		a=0;
		i=-1;
	}
	void read()throws IOException
	{
		char p;
		int x,y;
		System.out.println("ENTER STRING");
		do
		{
			p=(char)input.read();
			i++;
			stack[i]=p;
		}
		while(p!='\n');
		stack[i]='\0';
	}
	void compute()
	{
		for(i=0;stack[i]!='\0';i++)
		{
			if(stack[i]=='(')
			{
				a++;
			}
			if(stack[i]==')')
			{
				a--;
			}
		}
		if(a==0)
			System.out.println("VALID");
		else
			System.out.println("INVALID");
	}
	public static void main(String args[])throws IOException
	{
		Validity v= new Validity();
		v.read();
		v.compute();

	}
}