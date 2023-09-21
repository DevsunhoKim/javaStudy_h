/*
 * 주사위 두개를 같은 수가 나올 때 까지 던지고 각각의 눈의 수와,던진 수 출력
 */


package test_project;

public class 주사위문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0; // while 문 밖에 선언
		while(true)
		{
			int a=(int)(Math.random()*6)+1;
			int b=(int)(Math.random()*6)+1;
			count++;  // 주사위 던진 횟수 1씩 증가
			System.out.println(a+":주사위 1"+b+":주사위 2");
			if(a==b)
				
			{
				System.out.println("종료");
				break;
				
			}
			
		}
		System.out.println("count"+count);
	}

}
