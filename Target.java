import java.util.*;
class Target
{
	public static void main(String args[])
		{
			double target,east,west,north,south;
			 target=Double.parseDouble(args[0]);
				east=(target*15)/100;
				west=(target*25)/100;
				north=(target*30)/100;
				south=(target*30)/100;
			System.out.println(+east);
			System.out.println(+west);
			System.out.println(+north);
			System.out.println(+south);
		}
}