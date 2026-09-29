package com.team3.food;   // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("===== 팀 삼도류 식단 계산기 =====");
            System.out.println("1. 오늘 먹은 칼로리 합계");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                case 1:
                    int breakfast_kcal = 0;
                    int lunch_kcal = 0;
                    int dinner_kcal = 0;
                    PlusCalculator SumKcal = new PlusCalculator();

                    System.out.print("아침 칼로리 : ");
                    breakfast_kcal = sc.nextInt();
                    System.out.print("점심 칼로리 : ");
                    lunch_kcal = sc.nextInt();
                    System.out.print("저녁 칼로리 : ");
                    dinner_kcal = sc.nextInt();
                    System.out.println("오늘 먹은 칼로리는 " + SumKcal.Pluskcal(breakfast_kcal, lunch_kcal, dinner_kcal) + " kcal 입니다.");
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();

        } while (menu != 0);

    }
}