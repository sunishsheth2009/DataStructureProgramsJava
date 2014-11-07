
import java.io.*;
class Stack
{
	int n;
	int top;
	char items[];
	Stack(int s)
	{
		top=-1;
		n=s;
		items=new char[n];
	}
	void push (char item)
	{
		if (top==n)
			System.out.println("Stack overflow");
		else
			items[++top]=item;

	}
	boolean isempty()
	{
		if (top==-1)
			return true;
		else
			return false;
	}

	void pop()
	{
		if (isempty()==true)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			--top;
		}
	}
}
class Palindrome
{
	public static void main(String args[])throws IOException
	{
		int i=0;
		DataInputStream dis=new DataInputStream(System.in);
		String sentence;
		System.out.println("enter the sentence");
		sentence=dis.readLine();
		Stack s=new Stack(sentence.length());
		int	n=sentence.length();
		for(i=0;i<sentence.length()/2;i++)
			s.push(sentence.charAt(i));
		if(sentence.length()%2==0)
		{
			for(i=n/2;i<n;i++)
			if(s.items[s.top]==(sentence.charAt(i)))
			s.pop();
		}
		else
		{
			for(i=n/2+1;i<n;i++)
			if(s.items[s.top]==(sentence.charAt(i)))
			s.pop();
		}
		if(s.isempty())
			System.out.print("palindrome");
		else
			System.out.print("not a palindrome");
	}
}
	

