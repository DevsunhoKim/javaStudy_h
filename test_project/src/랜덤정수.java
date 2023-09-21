/*
 *  랜덤 정수 (1~10) 10개를 출력하고 숫자의 평균을 구하라
 */
public class 랜덤정수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		int b=1;
		while(b<=10)
		{
			int a=(int)(Math.random()*10)+1;
			System.out.print(" "+a);
			b++;
			sum+=a;
			
			
		}
		System.out.println("\n 평균 :"+ sum/10.0);
	}

}
