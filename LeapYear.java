import java.util.*;
class LeapYear
{
	public static void main (String[]args)
    {
		int a;
	  	Scanner sc=new Scanner (System.in);
		System.out.println("Enter the year");
		a=sc.nextInt();
		boolean flag = false ; 
		if(a % 400 == 0 && a % 4 == 0)// check wheather divisible by 400 and 4 , then a leap year  
		{
			flag = true;
		}
		else if ( a % 100 == 0)// here with 100 (beacause of centuary)
		{
			flag = false;
		}
		if(flag)
		{
		 	System.out.println("the "+a+" is a leap year");
		} 
		else 
		{
		System.out.println("not a leap year");	
		} 
	}
}