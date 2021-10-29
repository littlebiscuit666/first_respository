package homework;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Scanner;

public class sevenquestions {
	public static boolean isrun(int year)
	{
		boolean isrun=false;
		if (year%400==0||(year%4==0 && year%100!=0))
		{
			isrun=true;
		}
		return isrun;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入题号，以回车结束");
		Scanner in=new Scanner(System.in);
		int timu=in.nextInt();
		switch(timu)
		{
			case 1:
				System.out.println("输入两个数，间隔空格，结束回车");
				int a1=in.nextInt();
				int b1=in.nextInt();
				System.out.print(a1+b1);
				break;
			case 2:
				System.out.println("输入三角形的三条边，间隔空格，结束回车");
				int a=in.nextInt();
				int b=in.nextInt();
				int c=in.nextInt();
				Boolean jieguo2=false;
				if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a)
				{
					jieguo2=true;
				}
				float p=(a+b+c)/2;
				double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
				System.out.print(a+b+c+" ");
				System.out.print((float)(s)+" ");
				System.out.print(jieguo2);
				break;
			case 3:
				System.out.println("输入一个年份");
				int year=in.nextInt();
				Boolean jieguo3=false;
				if (year%400==0||(year%4==0 && year%100!=0))
				{
					jieguo3=true;
				}
				System.out.print(jieguo3);
				break;
			case 4:
				Boolean jieguo4=true;
				System.out.print("输入要判断的数字"+": ");
				int a4=in.nextInt();
				int b4=2;
				while (b4<a4)
				{
					if (a4%b4==0)
					{
						jieguo4=false;
						break;
					}
					else
						b4=b4+1;
				}
				System.out.print(jieguo4);	
			case 5:
				System.out.println("输入数字和位数，间隔逗号，结尾回车");
				int a5=in.nextInt();
				int n5=in.nextInt();
				int i5=1;
				int sum=0;
				while (i5<=n5)
				{
					int zhizi=0;
					int j5=i5;
					while(j5>=1)
					{
						zhizi=(int)(Math.pow(10, j5-1));
						j5=j5-1;
						sum=sum+zhizi;
					}
					i5=i5+1;
				}
				System.out.println(sum*a5);
				break;
			case 6:
				System.out.println("所有的水仙花数");
				for(int i=100;i<=999;i++)
				{
					 int ge=i%10;
					 int shi=(int)(i/10)%10;
					 int bai=(int)(i/100);
					 if (Math.pow(ge, 3)+Math.pow(shi, 3)+Math.pow(bai, 3)==i)
					 {
						System.out.print(i+","); 
					 }
				}
			case 7:
				System.out.println("英文格式输入日期");
				String str=in.next();
//				System.out.println(str);
				String[] spl=str.split(".");
				System.out.println(Arrays.toString(spl));
				
		}
	}

}
