package test_project;
import java.util.Scanner;

public class 제어문_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 입력:");
		int a = scan.nextInt();
		
		if(a>=90) {
			System.out.println(a+"점은 A 입니다.");
		}
		else if(a>=80) {
			System.out.println(a+"점은 B 입니다.");
		}
		else if(a>=70) {
			System.out.println(a+"점은 C 입니다.");
		}
		else if(a>=60) {
			System.out.println(a+"점은 D 입니다.");
		}
		else if(a<60) {
			System.out.println(a+"점은 F 입니다.");
		}
		

	}

}
