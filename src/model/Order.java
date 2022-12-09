package model;
import java.util.ArrayList;

public class Order {
    String user_name;
ArrayList<Item> items;

    public Order(String user_name, ArrayList<Item> items) {
        this.user_name = user_name;
        this.items = items;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
