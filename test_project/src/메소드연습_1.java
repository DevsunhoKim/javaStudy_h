// 1~10까지 출력하는 메소드 구현 :  리턴형 / 매개변수 
/*
 *    리턴형 메소드명(매개변수...)
 *    {           ----------- 가변 매개변수 
 *      => 자체에서 void (결과값 없는 상태)
 *    }
 *    메소드 : 기능처리 (연산자+제어문)
 *           = 다른 클래스 연결 
 *           = 재사용 (호출)
 */
public class 메소드연습_1 {
	static void ran()
	{
		int a=(int)(Math.random()*10)+1;
		System.out.println(a);
;	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ran();
	}

}
