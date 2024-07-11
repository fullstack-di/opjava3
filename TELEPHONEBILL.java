import java.util.*;
class BIMONTHCALLS
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
 	int calls;
	float amount;
	System.out.println("enter the calls");
	calls=sc.nextInt();
 	if(calls>=0 && calls<=120)
	amount=760;
	else if(calls>120 && calls<=220)
	amount=760+(calls-120)*1;
	else {
        amount=380+(100)+(calls-220)*1.25f;
	}

System.out.println("amount"+amount);
}
}

