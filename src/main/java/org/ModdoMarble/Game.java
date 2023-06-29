package org.ModdoMarble;

import java.util.*;

public class Game {
    // 모든 플레이어들 리스트
    private List<Player> players = new ArrayList<Player>();
    // 모든 도시 리스트
    private List<City> cities = new ArrayList<City>();


    // 게임 시작
    public void startGame(){
        List<String> allCitiyNames = new ArrayList<>();
        // Create City
        allCitiyNames.add("서울");
        allCitiyNames.add("부산");
        allCitiyNames.add("대구");
        allCitiyNames.add("광주");
        allCitiyNames.add("공주");
        allCitiyNames.add("김천");
        allCitiyNames.add("김해");
        allCitiyNames.add("여수");
        allCitiyNames.add("포항");
        allCitiyNames.add("경주");
        allCitiyNames.add("문경");
        allCitiyNames.add("구리");
        allCitiyNames.add("일산");
        allCitiyNames.add("과천");
        allCitiyNames.add("경산");
        allCitiyNames.add("구미");
        allCitiyNames.add("청주");
        allCitiyNames.add("춘천");
        allCitiyNames.add("성주");
        allCitiyNames.add("해남");


        //10개만 추리기
        Collections.shuffle(allCitiyNames); //섞고
        List<String> selectedCityNames = allCitiyNames.subList(0,10); //10개만

        for(String name : selectedCityNames){
            City city = new City(name);
            cities.add(city);
        }

        //플레이어 입력하기
        Scanner sc = new Scanner(System.in);
        int playerNum = 2; //두명만 해야하니까
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("Player %d의 이름을 입력하세요 : ", playerNum + 1 );
            String name = sc.nextLine();
            Player player = new Player(name);
            players.add(player);
        }

        //이제 게임을 시작합니다!
        System.out.println("Game Started!");

        playTurn(); // 한턴씩 진행하는 메서드 호출

    }

    // 플레이어가 한 턴씩 진행하도록 하는 메서드
    public void playTurn(){

    }

    // 게임의 종료 조건을 확인하는 메서드
    public void checkGameStatus(){

    }
}
