class ArmstrongRange1
{
	public static void main(String args[])
	{
		Test obj = new Test();
		int n=1000;
		for(int i=1;i<=n;i++)
		{
			if(obj.armst(i)==i)
			{
				System.out.println(i+" is an armstrong number");
			}
		}

	}
}
class Test
{	
	int armst(int i)
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
		return sum;
	}
}