import java.util.Scanner;

public class Calendar2 {

    private static final int[] MAX_DAYS ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int getmaxDaysOfmonth(int month) { //재사용하려고 함수화
        return MAX_DAYS[month -1]; //int month로 입력받아, int MAX_DAYS로 되돌려줌
    }

    public void PrintSampleCalendar() {
        System.out.println(" 일 월 화 수 목 금 토");
        System.out.println("-------------------");
        System.out.println("1  2  3  4  5  6  7");
        System.out.println("8  9  10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");

    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Calendar2 cal = new Calendar2();
        System.out.println("달을 입력하세요");
        int month = scanner.nextInt();

        System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getmaxDaysOfmonth(month)); //배열은 0부터
        cal.PrintSampleCalendar();

        scanner.close();

    }
}
