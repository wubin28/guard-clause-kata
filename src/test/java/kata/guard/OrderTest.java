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
        thrown.expectMessage("Address should not be null");
        Takeout takeout = new Takeout(null, null);
        Order order = new Order();
        order.submit(takeout);
    }

    @Test
    public void submit_订单提交前的合法性检查_地址为空字符串() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Address should not be empty");
        Takeout takeout = new Takeout("", null);
        Order order = new Order();
        order.submit(takeout);
    }

    @Test
    public void submit_订单提交前的合法性检查_姓名为null() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Receiver name should not be null");
        Takeout takeout = new Takeout("西湖", null);
        Order order = new Order();
        order.submit(takeout);
    }

    @Test
    public void submit_订单提交前的合法性检查_姓名为空字符串() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Receiver name should not be empty");
        Takeout takeout = new Takeout("西湖", "");
        Order order = new Order();
        order.submit(takeout);
    }

}
