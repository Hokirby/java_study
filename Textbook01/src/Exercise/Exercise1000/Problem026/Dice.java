package Exercise.Exercise1000.Problem026;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dice {
    String name;
    int planeNum;
    int resultNum;

    public Dice(String name, int planeNum) {
        this.name = name;
        this.planeNum = planeNum;
    }

    public int roll() {
        resultNum = (int) Math.random() * planeNum + 1;
        return resultNum;
    }

    public boolean isAlive() {
        return  resultNum % 2 == 0;
    }

    public String toString() {
        return "Dice [name = " + name + ", planeNum = " + planeNum + ", resultNum = " + resultNum + "]";
    }

    public static void main(String[] args) {
       List<Dice> dices = new ArrayList<Dice>();

        dices.add(new Dice("쥐", 2));
        dices.add(new Dice("소", 3));
        dices.add(new Dice("호랑이", 4));
        dices.add(new Dice("토끼", 5));
        dices.add(new Dice("용", 6));
        dices.add(new Dice("뱀", 7));
        dices.add(new Dice("말", 8));
        dices.add(new Dice("양", 9));
        dices.add(new Dice("원숭이", 10));
        dices.add(new Dice("닭", 11));
        dices.add(new Dice("개", 12));
        dices.add(new Dice("돼지", 13));

        List<Dice> diceList = dices
                .stream()
                .filter( d -> {
                    d.roll();
                    if (!d.isAlive()) {
                        return false;
                    }
                    return true;
                }).collect(Collectors.toList());

        for (Dice d : diceList) {
            System.out.println(d.toString());
        }
    }

}



