import java.util.Scanner;

public class 메소드연습_3 {
    static int userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력: "); // 입력 메시지를 출력하도록 수정
        int a = scan.nextInt();
        return a;
    }

    static int loop(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        return sum;
    }

    static int process(int input) {
        int sum = loop(input);
        return sum;
        int userInput = userInput(); // 사용자로부터 입력을 받음
        int sum = process(userInput); // 사용자 입력을 process 메소드로 전달
        System.out.println("결과: " + sum);
        
    }

    public static void main(String[] args) {
        int userInputValue = userInput(); // 사용자로부터 입력을 받음
        int result = process(userInputValue); // 사용자 입력을 process 메소드로 전달
        System.out.println("결과: " + result);
    }
}
