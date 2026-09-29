package com.team3.food;   // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("===== [팀 이름] 식단 계산기 =====");
            System.out.println("2. 남은 칼로리");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                case 2: {
                    int goalk=0;
                    int eatk=0;
                    System.out.print("목표 칼로리: ");
                    goalk=sc.nextInt();
                    System.out.print("먹은 칼로리: ");
                    eatk=sc.nextInt();
                    MinusCalculator minus01 = new MinusCalculator();
                    System.out.println(minus01.judge(goalk, eatk));
                    break;
                }

                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();

        } while (menu != 0);

    }
}