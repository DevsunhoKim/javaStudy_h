package test_project;

import java.util.Scanner;
public class test_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 :");
		a=scan.nextInt();
		
		if(a>0)
		{
			System.out.println("은(는) 양수입니다");
			
		}
		else
		{
			System.out.println("은(는) 음수입니다");
		}

	}

}
