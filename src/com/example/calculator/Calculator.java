package com.example.calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("계산을 시작하려면 아무키나 누르세요. 그만하려면 'exit'를 입력하세요.");
            String input = sc.next();

            if (input.equals("exit")) {
                System.out.println("계산기가 종료되었습니다.");
                break;
            }


            int result = 0;
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산(+,-,*,/) 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("분모는 0이 될 수 없습니다. 다시 입력하세요.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
            }
            System.out.println("계산 결과는 : " + result);

        }
    }
}

