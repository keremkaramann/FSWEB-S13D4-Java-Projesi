import com.workinthec.oop.Player;
import com.workinthec.oop.Point;
import com.workinthec.oop.Weapon;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);

        System.out.println("distance()= " + point.distance());
        System.out.println("Player:----------");

        Player firstPlayer = new Player("Kerem", 125, Weapon.AXE);
        System.out.println(firstPlayer);

        Player secondPlayer = new Player("Joe", -50,Weapon.SWORD);
        System.out.println(secondPlayer);

        secondPlayer.restoreHealth(77);
        System.out.println(secondPlayer);

        secondPlayer.loseHealth(10);
        System.out.println(secondPlayer);

        secondPlayer.loseHealth(80);
        System.out.println(secondPlayer);

    }
}