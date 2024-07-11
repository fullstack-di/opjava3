import java.util.*;
class ThreeINTEGERES
{
	 public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,sum,avg,dif;
		System.out.println("enter the values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
 		sum=a+b+c;
		avg=sum/3;
		dif=sum-avg;
		System.out.println("difference value:"+dif);
	}
}
  		