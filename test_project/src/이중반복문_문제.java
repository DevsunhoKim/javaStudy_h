
public class 이중반복문_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


/*
 * *****
   *****   를 출력하는 코드
   *****
   *****
   *****

 * 
 * 
 * 
 * 	
 */
	
	/*	
	for(int i =1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		*/
		
		for(int i =1;i<=5;i++)
		{
			
			for(int j=1;j<=6-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	
	}

}
