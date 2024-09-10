package com.example.calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> intList = new ArrayList<Integer>();
    private int result;

    public void calculate(char operator, int num1, int num2) {

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
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("다시 입력해주세요.");
        }
        System.out.println("계산 결과는 : " + result);

        intList.add(result);
        System.out.println("이전 결과 값 : " + intList.toString());


    }


    public int getResult() {
        return result;
    }
    public void setName(String name) {
        this.result = result;
    }
    /* Getter 메서드 구현 */
    /* Setter 메서드 구현 */
}