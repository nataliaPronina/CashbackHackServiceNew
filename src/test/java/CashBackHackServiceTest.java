import org.junit.Assert;
import org.junit.Test;
import ru.netology.CashBackHackService;

import static org.junit.Assert.assertEquals;

public class CashBackHackServiceTest {

    @Test

    public void CashBackIf980() {
            CashBackHackService service = new CashBackHackService();
            int amount = 980;
            int actual = service.remain(amount);
            int expected = 20;

        assertEquals (expected, actual);
    }

//    @Test
//    public void CashBackIf1000() {
//        CashBackHackService service = new CashBackHackService();
//        int amount = 1000;
//        int actual = service.remain(amount);
//        int expected = 0;
//
//        assertEquals (expected, actual);
//    }

    @Test
    public void CashBackIf1200() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals (expected, actual);
    }
}

//
//