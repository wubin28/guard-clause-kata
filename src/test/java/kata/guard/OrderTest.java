package kata.guard;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OrderTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void submit_订单提交前的合法性检查_地址为null() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Address");
        Takeout takeout = new Takeout(null);
        Order order = new Order();
        order.submit(takeout);
    }
}
