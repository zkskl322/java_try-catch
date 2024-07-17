package exam26.exam.excp;

public class NonTryExam {
    public static void main(String[] args) {

        int num = 15;
        int result = num / 0;

        System.out.println("결과 : " + result);

        System.out.println("프로그램 종료");
    }
}