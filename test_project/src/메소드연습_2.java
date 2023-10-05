// 1~10까지 합을 구하는 메소드 구현
// ---------------- 사용자 요청하는 값은 없다 (매개변수(X))
// 메소드 자체에서 출력 => 결과값 => main()
// 리턴형 
public class 메소드연습_2 {
	static void sum()
	{
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			
			sum+=i;
		}
		System.out.println("1~10 의 합 :"+sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
	}

}
