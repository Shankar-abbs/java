class ArmstrongRange
{
	public static void main(String args[])
	{
		Test obj = new Test();
		obj.armst();

	}
}
class Test
{
	int n=1000;
	void armst()
	{
		for(int i=1;i<=n;i++)
		{
			int count=0,temp=i,sum=0;
			for(;temp>0;temp/=10)	
			{
				count++;
			}
			temp=i;
			for(;temp>0;temp/=10)
			{
				int rem=temp%10;
				int pow = (int)Math.pow(rem,count);
				sum+=pow;
			}
			if(sum==i)
				System.out.println(i+" armstrong number");	
		}	
	}
}