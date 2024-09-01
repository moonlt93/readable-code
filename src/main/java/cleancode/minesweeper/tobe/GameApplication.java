package cleancode.minesweeper.tobe;

//객체별 책임
// 게임 실행에 대한 책임.
// 비지니스로직과 출력로직의 분리
// Board 책임이 너무 많음.
public class GameApplication {

    public static void main(String[] args) {

        Minesweeper minesweeper = new Minesweeper();
        minesweeper.run();

    }


}
