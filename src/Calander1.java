import java.util.Scanner;

public class Calander1 {
    public static void main(String[] args) {
        System.out.println(" 일 월 화 수 목 금 토");
        System.out.println("-------------------");
        System.out.println("1  2  3  4  5  6  7");
        System.out.println("8  9  10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");


        int a,b; // primitive 타입
        System.out.println("두 수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 =sc.next(); //스캐너의 next는 키보드로 입력받은 것을 string변수에 넣는 것이므로 int변수에 넣으면 안된다.
        s2 =sc.next();
        a =Integer.parseInt(s1);//정수형 클래스
        b =Integer.parseInt(s2);
        int c = a+b;
        System.out.println("두 수의 합은 " +c+ "입니다.");
        System.out.println("두 수의 합은 "+ (a+b)+ "입니다.");
        System.out.printf("%d와 %d의 합은 %d입니다.",a, b, a+b);
        sc.close(); //열었던 것은 작업을 끝내야 한다.


        }
    }
