/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

   What is the 10 001st prime number?
 */
public class q7 {
	public static void main(String[] args) {
		int num=2,count=0,count2=0;
		while(count2!=10001)
		{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count=count+1;
			}
			else
			{
				
			}
		}
		if(count==0)
		{
			count2=count2+1;
		}
		count=0;
		num=num+1;
		}
		num=num-1;
		System.out.println(num);
	}
	
}
//answer=104743
