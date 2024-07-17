package exam26.exam.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExam {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        try {

            int[] cards = {4, 2, 5, 6, 7, 1, 3};

            System.out.println("몇번째 카드를 뽑으실건가요!");
            int cardIndex = scan.nextInt();

            System.out.println("뽑은 카드번호는 : " + cards[cardIndex]);

        }catch (Exception e) {
            System.out.println("키 입력이 잘못되었습니다.");
        }finally {
            // 예외가 발생유무와 상관없이무조건 실행
            System.out.println("예외끝");
            scan.close();
        }
    }
}