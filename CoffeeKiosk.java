import java.util.ArrayList;
public class CoffeeKiosk{
  private ArrayList<Item> menu;
  private ArrayList<Order> orders;

  public CoffeeKiosk(){
    menu = new ArrayList<Item>();
    orders = new ArrayList<Order>();
  }

  public void addMenuItem(String name, double price){
    Item item = new Item(name, price);
    menu.add(item);
    item.setIndex(menu.indexOf(item));
  }

  public void displayMenu(){
    for(Item item: menu){
      System.out.println(""+item.getIndex()+" " + item.getName() +" -- $" +item.getPrice());
    }
  }

  public void newOrder(){
    System.out.println("Please enter customer name for new order: ");
    String name = System.console().readLine();
    Order order = new Order(name);
    displayMenu();
    System.out.println("Please enter a menu item index or q to quit: ");
    String itemNumber = System.console().readLine();
    int intNumber;
    while(!itemNumber.equals("q")) {
      order.addItem(menu.get(Integer.parseInt(itemNumber)));
      System.out.println("Please enter a menu item index or q to quit: ");
      itemNumber = System.console().readLine();
    }
    order.display();
  }
}