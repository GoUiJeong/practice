package com.example.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean checking = true;
        int num1 = 0;
        int num2 = 0;

        while (checking) {  //checking으로 반복문 제어
            System.out.print("첫 번째 숫자를 입력하세요: ");
            try {
                num1 = sc.nextInt();
                if (num1 < 0) {
                    System.out.println("제대로된 숫자를 입력해주세요");  //음수를 입력받았을때
                    checking = false;  //checking에 false을 넣어서 반복문 종료
                }
            } catch (Exception e) {
                System.out.println("제대로된 숫자를 입력해주세요");  //숫자가 아닌 값을 입력 받았을 때
                checking = false;
            }

            System.out.print("사칙연산(+,-,*,/) 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = 0;
            try {
                num2 = sc.nextInt();
                if (num2 < 0) {
                    System.out.println("제대로된 숫자를 입력해주세요");   //음수를 입력받았을때
                    checking = false;
                }
            } catch (Exception e) {
                System.out.println("제대로된 숫자를 입력해주세요");   //숫자가 아닌 값을 입력 받았을 때
                checking = false;
            }


            calculator.calculate(operator, num1, num2);       // 계산

            System.out.println("(1.종료) (2.삭제) (3.계산) 선택하십시오.");   //종료,삭제,계산 선택
            String check = sc.next();
            switch (check) {
                case "1":   //1 입력시 checking에 false을 넣고 break로 스위치와 반복문 종료
                    checking = false;
                    break;

                case "2":   //2 입력시 결과값 배열 보여주고 삭제 할 값 입력시 한개만 삭제
                    System.out.print("삭제할 값을 입력하세요.");
                    calculator.getResult();
                    int delnum = Integer.parseInt(sc.next());
                    calculator.delete(delnum);
                    calculator.getResult();
                    System.out.println("(1.종료) (2.삭제) (3.계산) 선택하십시오.");
                    check = sc.next();  //종료할지 삭제할지 계산할지 선택 할 수 있게 함.

                case "3": //3 입력시 계속 반복문 실행
                    continue;
            }

        }
    }
}

