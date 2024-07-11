import java.util.*;
class Salary
{
	public static void main(String args[])	
	{
		Scanner sc = new Scanner(System.in);
			int sal;
			float ins,ina;
			System.out.println("enter the sal");
			sal=sc.nextInt();
			if(sal<8000)
				ins=0f;
			else if(sal>=8000 && sal<9000)
				ins=0.2f;
			else if(sal>=9000 && sal<10000)
				ins=0.3f;
			else{
				ins=0.4f;
			}
				
				ina=sal*ins;
				System.out.println("income amount : "+ina);
	}
}