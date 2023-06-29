package org.ModdoMarble;

public class Player {
    private String name;
    private int money;
    private int positon;

    // 생성자
    public Player(String name) {
        this.name = name;
    }

    public void move(int diceValue){

    }
    //통행료 지급
    public void payToll(){

    }
    // 구매
    public void purchaseProperty(){

    }

    // 파산인지 확인하기
    public boolean checkBankruptcy(){
        if (money < 0) {
            return true;  // 파산 상태
        } else {
            return false; // 파산 상태가 아님
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getPositon() {
        return positon;
    }

    public void setPositon(int positon) {
        this.positon = positon;
    }
}
