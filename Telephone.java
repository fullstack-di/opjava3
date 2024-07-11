`import java.util.*;
class Telephone
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int msg,customerno;
float amount;
System.out.println("enter the customerno");
customerno=sc.nextInt();
System.out.println(" enter the message unit");
msg=sc.nextInt();
if(msg>=0 && msg<=80){
amount=250;
}
else if(msg>80 && msg<=140){
amount=250+(60)*0.6f;
}
else if(msg>140 && msg<=200){
amount=250+(60)*0.6f+(60)*0.6f;
}
else {
amount=250+(60)*0.6f+(60)*0.5f+(24)*0.4f;
System.out.println("amount:"+amount);
}
}
}
