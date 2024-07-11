import java.util.*;
class Salesman
{
	public static void main(String args[])	
	{
		Scanner sc = new Scanner(System.in);
			int sales;
			float com=0,comvalue;
			System.out.println("enter the sales");
			sales=sc.nextInt();
			if(sales>=1 && sales<=999)
				com=0.03f;
			else if(sales>=1000 && sales<=9999)
				com=0.05f;
			else if(sales>=10000 && sales<=99999){
				com=0.1f;
			}
			
				
				comvalue=sales*com;
				System.out.println("commision value : "+comvalue);
	}
}