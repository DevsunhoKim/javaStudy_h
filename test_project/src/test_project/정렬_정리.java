package test_project;

import java.util.*;
public class 정렬_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        int[] arr=new int[5];
        // 초기화 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1; //랜덤 변수를 배열에 저장
        }
        System.out.println("===== 정렬전 =====");
        System.out.println(Arrays.toString(arr)); // 배열 출력
        System.out.println("===== 정렬후 =====");
        for(int i=0;i<arr.length-1;i++) 
        {
        	for(int j=0;j<arr.length-1-i;j++)
        	{
        		if(arr[j]>arr[j+1])  // 인덱스 번호 앞뒤로 교환
        		{
        			int temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }
        System.out.println(Arrays.toString(arr));

	}

}
