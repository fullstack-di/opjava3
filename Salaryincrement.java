import java.util.*;
class Salaryincrement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			int bp,rate=0,total;		
		System.out.println("enter the basic pay");
		bp=sc.nextInt();
		if(bp==10700)
		{
			
			rate=550;
		}
		else if(bp==12500)
		{
			
			rate=750;
		}
		else if(bp==15000)
		{
			
			rate=1050;
		}
		
			total=(bp)+(rate);
			System.out.println("final salary after increment"+total);
	}
}	