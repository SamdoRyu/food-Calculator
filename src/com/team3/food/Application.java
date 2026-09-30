package com.team3.food;   // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("===== 팀 삼도류 식단 계산기 =====");
            System.out.println("1. 오늘 먹은 칼로리 합계");
            System.out.println("2. 남은 칼로리");
            System.out.println("3. n인분 칼로리 표");
            System.out.println("4. 더치페이 계산");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                case 1: {
                    int breakfast_kcal = 0;
                    int lunch_kcal = 0;
                    int dinner_kcal = 0;
                    PlusCalculator SumKcal = new PlusCalculator();

                    while(true) {
                        System.out.print("아침 칼로리 : ");
                        breakfast_kcal = sc.nextInt();
                        if(breakfast_kcal < 0) {
                            System.out.println("음수는 입력할 수 없습니다. 다시 입력하세요.");
                            break;}
                        System.out.print("점심 칼로리 : ");
                        lunch_kcal = sc.nextInt();
                        if(lunch_kcal < 0) {
                            System.out.println("음수는 입력할 수 없습니다. 다시 입력하세요.");
                            break;}
                        System.out.print("저녁 칼로리 : ");
                        dinner_kcal = sc.nextInt();
                        if(dinner_kcal < 0) {
                            System.out.println("음수는 입력할 수 없습니다. 다시 입력하세요.");
                            break;}
                        System.out.println("오늘 먹은 칼로리는 " + SumKcal.Pluskcal(breakfast_kcal, lunch_kcal, dinner_kcal) + " kcal 입니다.");
                        break;
                    }
                    break;
                }
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
                case 3: {
                    System.out.print("1인분 칼로리 : ");
                    int kcal = sc.nextInt();
                    System.out.print("몇 인분까지 : ");
                    int maxCount = sc.nextInt();

                    MultiplyCalculator mc = new MultiplyCalculator();
                    mc.printTable(kcal, maxCount);
                    break;
                }
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
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }

            System.out.println();

        } while (menu != 0);

    }
}