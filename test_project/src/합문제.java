/*
 * 1~100 짝수의 합만 출력하는 프로그램
 * 
 */
public class 합문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0) 
			{
				sum+=i; // 짝수의 합을 반복
			}
			
		}
			System.out.println("짝수의 합 :"+sum);
	}

}
