import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arthur on 01/04/2017.
 */
public class Main {

    public static void main(String[] args) {

        List<Electricity> list = new ArrayList<>();
        list.add(new Lamp());
        list.add(new Radio());

        list.add(
                () -> System.out.println("Пожар")
        );

        Switcher.switchOn(list);





    }
}
