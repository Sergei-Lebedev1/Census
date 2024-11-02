import org.Census.Resident;
import org.Census.ResidentsOfHouse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class findOldestManTest {
    @Test
    public void findOldestManTest1() {
        List<Resident> residents = List.of(
                new Resident(99, 0),
                new Resident(35, 0),
                new Resident(50, 1),
                new Resident(60, 1)
        );

        int oldMan = ResidentsOfHouse.findOldestMan(residents);

        Assertions.assertEquals(4, oldMan);
    }
    @Test
    public void findOldestManTest2() {
        List<Resident> residents = List.of(
                new Resident(99, 0),
                new Resident(35, 0),
                new Resident(50, 0),
                new Resident(60, 0)
        );

        int oldMan = ResidentsOfHouse.findOldestMan(residents);

        Assertions.assertEquals(-1, oldMan);
    }
}
