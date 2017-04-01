import java.util.Arrays;
import java.util.List;

/**
 * Created by Arthur on 01/04/2017.
 */
public class Switcher {

    public static void switchOn(List<Electricity> list) {
        System.out.println("Свитчер включен");
        list.stream().forEach((subject)->subject.switchOn());
    }

    public static void switchOn(Electricity electricity) {
        System.out.println("Свитчер включен");
        electricity.switchOn();
    }

}
