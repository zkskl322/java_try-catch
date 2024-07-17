package exam26.exam.excp;

public class TryCatchExam {
    public static void main(String[] args) {

        try {
            int num = 15;
            int result = num / 10;

            System.out.println("결과 : " + result);

            Integer a = null;

            System.out.println(a / 10);

        }catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace(); // 내부에서 에러난 내용전체 출력
            System.out.println(e.getMessage()); // 에러 메시지만 출력
        }catch (NullPointerException e) {
            System.out.println("사용하려는 객체가 존재하지 않습니다.");
        }
        System.out.println("프로그램 종료");
    }
}