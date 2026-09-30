package com.team3.food;
public class MinusCalculator {
    //판단 메소드(빼기 메소드의 결과를 받아서 판단한다)
    public String judge(int goalk, int eatk) {
        int result = minus(goalk, eatk);
        if (result>=0) {
            return result + "kcal 더 먹을 수 있습니다.";
        } else {
            return Math.abs(result) + "kcal 초과했습니다.";
        }


    }

    //빼기 메소드(목표 칼로리 - 먹은 칼로리)
    public int minus(int goalk, int eatk) {
        return (goalk-eatk);

    }

}
