// 3개의 정수 => 총점 , 평균 , 학점
// A B C D F
// A>=90 B>=80 C>=70 D>=60 
// 100~97 A+ 96~93 A0 92~90 A-
import java.util.Scanner;
public class 단일조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\"홍길동\""); // "홍길동"
        Scanner scan=new Scanner(System.in);
        System.out.print("국어 점수:");
        int kor=scan.nextInt();
        
        System.out.print("영어 점수:");
        int eng=scan.nextInt();
        
        System.out.print("수학 점수:");
        int math=scan.nextInt();
        
        // 출력
        System.out.println("국어점수:"+kor);
        System.out.println("영어점수:"+eng);
        System.out.println("수학점수:"+math);
        System.out.println("총점:"+(kor+eng+math));
        double avg=(kor+eng+math)/3.0;
        System.out.printf("평균:%.2f\n",avg);
        // 특수문자 
        /*
         *   \n => new Line => 새로운 줄에 출력 
         *   \t => tab => 일정 간격
         *   \" => ""
         *   
         */
        // 학점 
        /*int temp=(int)avg/10;
        if(temp==10||temp==9)
        	System.out.println("학점:A");
        if(temp==8)
        	System.out.println("학점:B");
        if(temp==7)
        	System.out.println("학점:C");
        if(temp==6)
        	System.out.println("학점:D");
        if(temp<6)
        	System.out.println("학점:F");*/
        char score='A';
        char op=' ';
        if(avg>=90 && avg<=100)
        {
        	score='A';
        	if(avg>=97)
        		op='+';
        	if(avg>=93 && avg<=96)
        		op='0';
        	if(avg>=90 && avg<=92)
        		op='-';
        	
        }
        if(avg>=80 && avg<90)
        {
        	score='B';
        }
        if(avg>=70 && avg<80)
        {
        	score='C';
        }
        if(avg>=60 && avg<70)
        {
        	score='D';
        }
        if(avg<60)
        {
        	score='F';
        }
        System.out.println("학점:"+score+op);
        
	}

}
