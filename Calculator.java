package epam.maven;
import java.util.Scanner;
public class Calculator extends Cal
	{
		public static void main(String args[])
		{
		Scanner scan = new Scanner(System.in);
		Cal calci = new Cal();
		boolean n = true;
		while(n)
		{
			System.out.print("Enter first value:");
			int num1 = scan.nextInt();
			System.out.print("Enter operation(+,-,*,/):");
			char opr = scan.next().charAt(0);
			System.out.print("Enter second value:");
			int num2 = scan.nextInt();
			switch(opr)
			{
				case '+':
					calci.add(num1,num2);
					break;
				case '-':
					calci.sub(num1,num2);
					break;
				case '*':
					calci.mul(num1,num2);
					break;
				case '/':
					calci.div(num1,num2);
					break;
				default:
					System.out.println("Enter only +,*,/,-");
			}
			System.out.print("Do you want to continue(Y/N):");
			char ch=scan.next().charAt(0);
			if(ch == 'y' || ch == 'Y')
				n = true;
			else 	
				n = false;
		}
		scan.close();
	}
		
	}


