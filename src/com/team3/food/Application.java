package com.team3.food;   // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("===== [팀 이름] 식단 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("4. 더치페이 계산");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 4: {
                    System.out.print("음식값 : ");
                    int price = sc.nextInt();
                    System.out.print("인원 수 : ");
                    int people = sc.nextInt();

                    if (people == 0) {
                        System.out.println("인원은 1명 이상이어야 합니다.");
                        break;
                    }

                    System.out.print("배달비 (없으면 0) : ");
                    int deliveryFee = sc.nextInt();

                    DivideCalculator divideCalculator = new DivideCalculator();
                    if (deliveryFee == 0) {
                        double result = divideCalculator.divide(price, people);
                        System.out.printf("1인당 %.0f원%n", result);
                    } else {
                        double result = divideCalculator.divideWithDelivery(price, deliveryFee, people);
                        System.out.printf("배달비 포함 1인당 %.0f원%n", result);
                    }
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