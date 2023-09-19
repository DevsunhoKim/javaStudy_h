/*
 *  문제 7) 1~10 사이의 숫자중 3의 배수를 제외하고 출력 (continue 사용)
 *  
 *  문제 8) 100~999 7의 배수의 갯수와 합을 출력하는 프로그램 작성
 *  
 *  문제 9) 100~999 4의 배수가 아닌 수의 개수, 합을 출력하는 프로그램 작성
 * 
 */

package test_project;

public class 반복문_문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("======== 문제 7 =======");
	        for(int i=1;i<=10;i++)
	        {
	        	if(i%3==0)
	        		continue; // i++ 이동 (증가식으로 이동)
	        	System.out.print(i+" ");
	        }
	        System.out.println("\n======= 문제 8 ========");
	        int sum=0,count=0;
	        for(int i=100;i<=999;i++)
	        {
	        	if(i%7==0)
	        	{
	        		sum+=i;
	        		count++;
	        	}
	        }// i는 여기까지 사용 => 자동으로 소멸 
	        System.out.println("7의 배수의 갯수:"+count);
	        System.out.println("7의 배수의 합:"+sum);
	        
	        System.out.println("======= 문제 9 ========");
	        sum=count=0;
	        
	        for(int i=100;i<=999;i++)
	        {
	        	if(i%4!=0)
	        	{
	        		sum+=i;
	        		count++;
	        	}
	        }
	        System.out.println("4의배수가 아닌 수의 갯수:"+count);
	        System.out.println("4의배수가 아닌 수의 합:"+sum);
	}

}
