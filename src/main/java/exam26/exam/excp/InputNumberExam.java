package exam26.exam.excp;

import java.util.Scanner;

public class InputNumberExam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int val = 0;

        while(true) {

            try{

                System.out.println("숫자 입력(범위: 1 ~ 50) : ");
                val = scan.nextInt();

                if(val == -1) {
                    System.out.println("종료!");
                    break;
                } else if(val > 50 || val < 1) {
                    throw new Exception("숫자의 허용범위가 아닙니다.");
                }

            } catch (Exception e) {
                scan.nextLine(); // 입력받기전에 이전 내용 flush
                System.out.println(e.getMessage() == null ? "입력에 문제발생!" : e.getMessage());
            }
        }

        scan.close();
    }
}