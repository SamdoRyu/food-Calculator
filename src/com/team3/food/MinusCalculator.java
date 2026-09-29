public class MinusCalculator {
    public String judge(int goalk, int eatk) {
        int result = minus(goalk, eatk);
        if (result>=0) {
            return result + "kcal 더 먹을 수 있습니다.";
        } else {
            return Math.abs(result) + "kcal 초과했습니다.";
        }


    }

    public int minus(int goalk, int eatk) {
        return goalk-eatk;

    }

}
