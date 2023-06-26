package org.ModdoMarble;

public class City {
    private String name; // 도시 이름
    private final int purchaseCost = 300; // 구매 비용
    private final int toll = 600; // 통행료
    private Player owner; // 도시 주인

    public City(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public int getPurchaseCost() {
        return purchaseCost;
    }


    public int getToll() {
        return toll;
    }


    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
