import java.util.*;
class Students
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e,total,per;
		System.out.println("enter the marks");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		total=a+b+c+d+e;
		per=(total/500)*100;
		System.out.println("percentage"+per);
	}
}
 		
