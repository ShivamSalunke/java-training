import java.util.Scanner;
class Triangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the theree angles");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a+b+c==180)
		{
			if(a<90 && b<90 && c<90)
				System.out.println("Acute angled triangle");
			else if(a>90 || b>90 || c>90)
				System.out.println("Obtuse angled triangle");
			else
				System.out.println("Right angled triangle");
		}
		else
		System.out.println("Cannot form a triangle");
	}
}