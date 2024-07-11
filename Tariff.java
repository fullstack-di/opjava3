import java.util.*;
class Tariff
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n,am;
                         float a;
			System.out.println("enter the n value");
			n=sc.nextInt();
                        am=sc.nextInt();
			if(n>=180)
			{
			a=am+(n*5.5f)/100;
			}
			else if(n>181 && n<=364)
			{
			a=am+(n*7.5f)/100;
			}
			else if(n==365)
			{
			a=am+(n*9.0f)/100;
			}
			else 
			{
			a=am+(n*8.5f)/100;
			}
			System.out.println("amount"+a);
		}
}

