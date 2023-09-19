package test_project;
/*
 *  문제 10) 짝수합,홀수합 출력하는 프로그램
 *  
 *  문제 11) 1~100 3의 배수이고 5의배수를 출력하는 프로그램
 *  
 *  문제 12) 1~1000 7의배수의 합,9의 배수의 합
 *  
 *  문제 13) 10~99 까지 정수중에 같은 자리의 정수를 출력
 */
public class 반복문_문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				
				System.out.println("======= 문제 10 =========");
				int a=0,b=0;
				for(int i=1;i<=30;i++)
				{
					if(i%2==0)
						a+=i;
					else
						b+=i;
				}
				System.out.println("1~30 짝수합:"+a);
				System.out.println("1~30 홀수합:"+b);
				
				System.out.println("======= 문제 11 =========");
				for(int i=1;i<=100;i++)
				{
					if(i%3==0 && i%5==0)
					{
						System.out.print(i+" ");
					}
				}
				System.out.println("\n======= 문제 12 =========");
				a=b=0;
				for(int i=1;i<=1000;i++)
				{
					if(i%7==0)
						a+=i;
					if(i%9==0)
						b+=i;
				}
				System.out.println("7의 배수의 합:"+a);
				System.out.println("9의 배수의 합:"+b);
				System.out.println("7의 배수+9의 배수:"+(a+b));
				
				System.out.println("======= 문제 13 =========");
				for(int i=10;i<=99;i++)
				{
					if(i%11==0)
						System.out.print(i+" ");
				}
	}

}
