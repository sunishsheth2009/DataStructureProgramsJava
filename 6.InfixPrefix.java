/*program for  infix to prefix conversion:
Input: valid infix expression having single
       digit numbers and valid operators*/
/*Output: Prefix expression*/
import java.io.*;
class InfixPrefix
{
	char infix[],infix1[],prefix[],stack[];
	int n,top,i,j;
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	InfixPrefix()throws IOException
	{
		System.out.println("ENTER ARRAY SIZE");
		n=Integer.parseInt(input.readLine());
		infix=new char[n];
		infix1=new char[n];
		prefix=new char[n];
		stack=new char[n];
		top=-1;
		i=-1;
		j=n;
	}
	void readinfix()throws IOException
	{
		char p;
		int x,y;
		System.out.println("ENTER INFIX STRING");
		do
		{
			p=(char)input.read();
			i++;
			infix1[i]=p;
		}
		while(p!='\n');
		infix1[i]='\0';
		for(x=i-1,y=0;x>=0;x--,y++)
			infix[y]=infix1[x];
	}
	void compute()
	{
		for(i=0;infix[i]!='\0';i++)
		{
			if (isoperand(infix[i]))
			{
				j=j-1;
				prefix[j]=infix[i];
			}
			else
				if(top==-1)
				{
					top=top+1;
					stack[top]=infix[i];
				}
				else
					if(infix[i]=='(')
					{
						while(stack[top]!=')')
						{
							j=j-1;
							prefix[j]=stack[top];
							top=top-1;
						}
						top=top-1;
					}
					else
						if(priority(infix[i])>priority(stack[top]))
						{
							top=top+1;
							stack[top]=infix[i];
						}
						else
						{
							while((priority(infix[i])<=priority(stack[top]))&&top!=-1&&stack[top]!=')'&&infix[i]!=')')
							{
								j=j-1;
								prefix[j]=stack[top];
								top=top-1;
								if(top==-1)
									break;
							}
							top=top+1;
							stack[top]=infix[i];
						}
		}
		while(top!=-1)
		{
			j=j-1;
			prefix[j]=stack[top];
			top=top-1;
		}
	}
	boolean isoperand(char x)
	{
		if((x>='a'&&x<='z'))
			return true;
		else
			return false;
	}
	int priority(char ch)
	{
		if(ch==')')
			return 4;
		if((ch=='*')||(ch=='/'))
			return 3;
		if((ch=='+')||(ch=='-'))
			return 2;
		if((ch=='<')||(ch=='>'))
			return 1;
		return 0;
	}
	void display()
	{
		System.out.println("PREFIX EXPRESSION");
		for(i=j;i<n;i++)
		{
			System.out.print(prefix[i]);
		}
	}
	public static void main(String args[])throws IOException
	{
		InfixPrefix ip= new InfixPrefix();
		ip.readinfix();
		ip.compute();
		ip.display();
	}
}