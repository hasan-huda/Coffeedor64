import java.util.ArrayList;

public class Order{
  private String name;
  private boolean ready;
  private ArrayList<Item> items;

  public Order(){
    this.name="Guest";
    items = new ArrayList<Item>();
  }
  
  public Order(String name){
    this.name=name;
    items = new ArrayList<Item>();
  }

  public void addItem(Item item){
    items.add(item);
  }

  public String getStatusMessage(){
    String status = ready? "Your order is ready" : "Thank you for waiting. Your order will be ready soon.";
    return status;
  }

  public double getOrderTotal(){
    double sum=0;
    for(Item item: items){
      sum+=item.getPrice();
    }
    return sum;
  }

  public void display(){
    System.out.println("Customer Name: "+name);
    for(Item item: items){
      System.out.println(item.getName()+" - $"+item.getPrice());
    }
    System.out.println("Total: $"+getOrderTotal());

  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name=name;
  }

  public boolean getReady(){
    return ready;
  }

  public void setReady(boolean ready){
    this.ready=ready;
  }

  public ArrayList<Item> getItems(){
    return items;
  }

  public void setItems(ArrayList<Item> items){
    this.items=items;
  }
}