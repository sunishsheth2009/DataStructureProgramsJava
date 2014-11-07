//to sort a file in ascending order.
import java.io.*;
class FileSort
{
	public static void main(String arsg[])throws Exception
	{
		File f = new File("Integer.txt");
		DataInputStream ob = new DataInputStream(System.in);
		FileWriter w = new FileWriter(f);
		FileReader r = new FileReader(f);
		System.out.print("How many nos. would yu like to store?: ");
		int n = Integer.parseInt(ob.readLine());
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter no.: ");
			a[i]=Integer.parseInt(ob.readLine());
		}
		File s = new File("Sort.txt");
		for(int i=0;i<n;i++)
			w.write(String.valueOf(a[i])+' ');
			
		w.close();	
		FileWriter fw = new FileWriter(s);
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
			
		System.out.println("The nos. in sorted form is: ");
		for(int i=0;i<n;i++)
		{
			fw.write(String.valueOf(a[i])+' ');
			System.out.print(a[i]+" ");
		}
		fw.close();
		r.close();
	}
}