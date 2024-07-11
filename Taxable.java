import java.util.*;
class Taxable
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m,age;
                String name;
		float it,am;
		System.out.println("payer name : ");
		name=sc.next();
		System.out.println("person age :");
		age=sc.nextInt();
		System.out.println("taxble income ammount:");
		m=sc.nextInt();
		if(age<=60)
		{
			if(m<250000)
			{
				it=0;
			}
			else if(m>=250000 && m<=500000)
			{
			 it=((m-160000)*10)/100;
			}
			else if(m>=500000 && m<=1000000)
			{
			it=((m-500000)*20)/100+34000;
			}
			else
			{
			it=((m-1000000)*30)/100+94000;
			}
			System.out.println("income tax"+it);
		}
	else{
		System.out.println("Wrong Category");
}
}
}