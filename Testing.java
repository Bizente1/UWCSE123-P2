import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class Testing {


    @Test
    @DisplayName("STUDENT TEST - Case #1")
    public void firstTestCase() {
        List<Region> result = new ArrayList<>();
        Allocation test = new Allocation();
        result.add(new Region("1", 30, 300));
        result.add(new Region("2", 60, 600));
        result.add(new Region("3", 40, 400));
        result.add(new Region("4", 80, 800));
        test = test.withRegion(new Region("1", 30, 300));
        test = test.withRegion(new Region("2", 60, 600));
        test = test.withRegion(new Region("3", 40, 400));
        test = test.withRegion(new Region("4", 80, 800));

        assertEquals(test, Client.allocateRelief(2100, result));
    }

    @Test
    @DisplayName("STUDENT TEST - Case #2")
    public void secondTestCase() {
        List<Region> result = new ArrayList<>();
        result.add(new Region("1", 30, 300));
        result.add(new Region("2", 60, 600));
        result.add(new Region("3", 40, 400));
        result.add(new Region("4", 80, 800));

        assertEquals(new Allocation(), Client.allocateRelief(0, result));
    }

    @Test
    @DisplayName("STUDENT TEST - Case #3")
    public void thirdTestCase() {
        List<Region> result = new ArrayList<>();
        Allocation test = new Allocation();
        result.add(new Region("1", 30, 300));
        result.add(new Region("2", 60, 600));
        result.add(new Region("3", 40, 400));
        result.add(new Region("4", 80, 800));
        test = test.withRegion(new Region("3", 40, 400));
        test = test.withRegion(new Region("4", 80, 800));
        
        assertEquals(120, Client.allocateRelief(1200, result).totalPeople());
    }
}
