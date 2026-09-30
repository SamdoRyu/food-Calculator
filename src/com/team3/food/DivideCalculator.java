package com.team3.food;

public class DivideCalculator {

    // 음식값을 인원 수로 나눈 1인당 금액
    public double divide(int price, int people) {
        return (double) price / people;
    }

    // 음식값과 배달비를 합친 금액을 인원 수로 나눈 1인당 금액
    public double divideWithDelivery(int price, int deliveryFee, int people) {
        return (double) (price + deliveryFee) / people;
    }
}
