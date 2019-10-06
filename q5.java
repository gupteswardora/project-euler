/*
 

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 */
public class q5 {

	public static void main(String[] args) {
		int count=0,num=2;
		while(count!=20)
		{
			count=0;
			for(int i=1;i<=20;i++)
			{
				if(num%i==0)
				{
                    count=count+1;
				}
				else 
				{
					num++;
				}
			}
		
		}
		System.out.println(num);
	}

}
//answer is 232792560