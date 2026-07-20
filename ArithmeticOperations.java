import java.util.*;
 class switchDemo {
	public static void main(String[] args) 
	{
		int a,b,result=0;
		char op;
		System.out.println("enter a,b");
		Scanner ob=new Scanner(System.in);
	a=ob.nextInt();
	b=ob.nextInt();
	System.out.println("enter op");
	op=ob.next().charAt(0);
switch(op)
{
	case '+' :result=a+b;
	break;
	
	case '-' :result=a-b;
	break;
	
	case '*' :result=a*b;
	break;
	
	case '/' :result=a/b;
	break;
	case '%' :result=a%b;
	break;
	default: System.out.println("Invalid choice");
}
System.out.println("Result=" +result);
	}
}
