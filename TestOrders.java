import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha",1.08);
        Item item2 = new Item("latte",2.17);
        Item item3 = new Item("drip coffee",1.62);
        Item item4 = new Item("cappuccino",2.55);
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 =new Order("Bob");
        Order order4 =new Order("Bobbers");
        Order order5 =new Order("John");
        // Application Simulations
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item2);
        order4.addItem(item3);
        order4.addItem(item4);
        order5.addItem(item1);
        order5.addItem(item2);
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
        // Use this example code to test various orders' updates
    }
}
