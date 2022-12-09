import model.Item;
import model.Order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //listing out the items avialabel
        Item i1=new Item("t1","1111","b1",1000);
        Item i2=new Item("t2","1112","b2",1050);
        Item i3=new Item("t3","1113","b1",1010);
        Item i4=new Item("t4","1114","b1",1150);
        Item i5=new Item("t5","1115","b2",1500);

        //creating an arraylist to store the items ordered by the user.
        ArrayList<Item> items_u1=new ArrayList<>();

        items_u1.add(i1);
        items_u1.add(i2);

        //creating an arraylist to store the items ordered by the second user.

        ArrayList<Item> items_u2=new ArrayList<>();
        items_u2.add(i3);
        items_u2.add(i4);

        //creating an arraylist to store the number of orders of an user.
        ArrayList<Order> orders_u1=new ArrayList<>();
        Order u1_o1=new Order("u1",items_u1);
        Order u1_o2=new Order("u1",items_u1);

        orders_u1.add(u1_o1);
        orders_u1.add(u1_o2);

        //creating an arraylist to store the number of orders of second user.
        ArrayList<Order> orders_u2=new ArrayList<>();
        Order u2_o1=new Order("u2",items_u2);
        Order u2_o2=new Order("u2",items_u2);

        orders_u1.add(u2_o1);
        orders_u1.add(u2_o2);

        i1.display();

    }
}
