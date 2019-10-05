public class q2 {
      public static void main(String[] args) {
		
		int a=1,b=2,c=0,sum=0;
		for(int i=0;sum<4000000;i++)
		{
			if(a%2==0)
			{
				sum=sum+a;
			}
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("The sum of even numbers are "+sum);
	}
