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
    // 미
    // 구매
    public void purchaseProperty(City city){
        if(money >= city.getPurchaseCost()){
            if(city.getOwner() == null){
                money -= 300;
                city.setOwner(this);
            }else{
                System.out.println("이미 소유주가 있는 도시입니다!");
            }
        }else{
            System.out.println("구입 비용이 부족합니다!");
        }
    }

    // 파산인지 확인하기
    public boolean checkBankruptcy(){
        return money <= 0;
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
