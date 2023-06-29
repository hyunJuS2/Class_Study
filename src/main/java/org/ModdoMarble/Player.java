public class Player {
    public Player(String name, int money) {
        this.name = name;
        this.money = money;
        this.position = 0;
    }
   public String getName() {
       return getName();
   }
   public int getMoney() {
        return getMoney();
   }
   public int getPosition() {
        return getPosition();
   }
   String name;
    int money = 5000;
    int position = 0;
    int turnCount;
    String player;
    int diceValue = (int) (Math.random() * 6 + 1);

    void Move(int diceValue) {
        // position += diceValue
        position += diceValue;
        System.out.println(player + "의 위치 : " + player);
        if (position > 10) {
            int steps = position % 10;
            position += steps;
        }
    }

    void payToll(int toll) {
        money -= toll;

        while (money > 0 || turnCount < 30) {
            if (position > 0) {
                if (money > 0) {
                    money -= 600;
                    System.out.println("통행료를 지불했습니다.");
                } else {
                    System.out.println("통행료를 지불할 수 없어 게임을 종료합니다.");
                    break;
                }
            }
            if (money > 0) {
                int diceValue = (int) (Math.random() * 6 + 1);
                System.out.println("주사위 결과: " + diceValue);
            } else {
                System.out.println("돈이 없어서 게임을 종료합니다.");
            }
        }
    }
}



