import java.util.*;
class Prize
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int ta;
		float pa;
                char grade;
		System.out.println("enter the test average");
		ta=sc.nextInt();
		if(ta>=80)
		{
			grade='a';
			pa=100000.0f;
		}
		else if(ta<80 && ta>=65)
		{
			grade='B';
			pa=50000.0f;
		}

		else if(ta<65 && ta>=40)
		{
			grade='c';
			pa=25000.0f;
		}
		else{
			grade='d';
			pa=10000.0f;
		}
		System.out.println("grade : "+grade);
		System.out.println("prize amount"+pa);
	}
}

		