/*
 

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

 */
public class q4 {

	public static void main(String[] args) {
		int bef,aft,x = 0,y=0;
		for(int i=100;i<=999;i++)
		{
			for(int j=100;j<=999;j++)
			{
				bef=i*j;
				aft=0;
				while(bef!=0)
				{
					aft=aft*10+(bef%10);
					bef=bef/10;
				}
				if((i*j)==aft)
				{
                    if(x<(i*j))
                    {
                    	x=i*j;
                    }
				}
		}
		}
		System.out.println(x);
	}
}
//answer is 906609


