/*
 

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */
public class q3 {

	public static void main(String[] args) 
	{
		long x=600851475143L;
	int i;
	for(i=2;x>1;i++)
	{
		while(x%i==0)
	
	{
		x=x/i;

	}
	}
	System.out.println(i-1);
	
	}

}
//answer=6857