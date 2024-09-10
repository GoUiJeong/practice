package com.example.calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> resultList = new ArrayList<Integer>();
    private int result;


    public void calculate(char operator, int num1, int num2) {
        switch (operator) {
            case '+':
                result = num1 + num2;
                resultList.add(result);
                break;
            case '-':
                result = num1 - num2;
                resultList.add(result);
                break;
            case '*':
                result = num1 * num2;
                resultList.add(result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("분모는 0이 될 수 없습니다. 다시 입력하세요.");
                }
                result = num1 / num2;
                resultList.add(result);
                break;
            default:
                System.out.println("다시 입력해주세요.");
        }
        System.out.println("계산 결과는 : " + result);
        System.out.println("이전 결과 값 : " + resultList.toString());
    }

    //결과 값 저장
    public void getResult() {
        System.out.println(resultList.toString());
    }

    //입력받은 값 삭제
    public void delete(int delnum) {
        if (resultList.contains(delnum)) {
            resultList.remove(Integer.valueOf(delnum));
            System.out.print(delnum + "을 지웠습니다.");
            resultList.toString();
        } else {
            System.out.println(delnum + "해당 값이 없습니다.");
            resultList.toString();
        }
    }

}