import org.example.File;
import org.example.Lot;
import org.example.ToyList;
import org.example.Toys;

import java.io.IOException;

public class Play {
    public static void main(String[] args) {
        Toys toy1 = new Toys(1, "Конструктор", 2);
        Toys toy2 = new Toys(2, "Робот", 2);
        Toys toy3 = new Toys(3, "Кукла", 6);

        ToyList toyList = new ToyList();
        toyList.addToQue(toy1);
        toyList.addToQue(toy2);
        toyList.addToQue(toy3);

        Lot lottery = new Lot();
        Toys toy = Lot.win(toyList.toyList);
        System.out.println("Победитель: " + toy);

        File loginToFile = new File();
        try {
            File.writeToFile(toy);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
