import java.util.*;
class Product
{
	 public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,prod,d,e,f;
  		System.out.println("enter the value:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
                d=a%10;
		e=b%10;
		f=c%10;
		prod=d*e*f;
		System.out.println("product of last three digits nubers:"+prod);
	}
}