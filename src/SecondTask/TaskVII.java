package SecondTask;

import java.util.ArrayList;
import java.util.Objects;

public class TaskVII {
    static class CommodityExpert {
        String name;
        ArrayList<Order> sales;

        ArrayList<Buyer> blackList;

        public CommodityExpert(String name) {
            this.name = name;
            this.sales = new ArrayList<>();
            this.blackList = new ArrayList<>();
        }

        public void addToBlackList(Buyer buyer){
            this.blackList.add(buyer);
        }

        public void addToSales(Order order){
            this.sales.add(order);
        }
        public void setTitleOfProduct(Product product, String title){
            product.setTitle(title);
        }
    }

    static class Buyer {
        String nick;
        ArrayList<Order> purchases;

        public Buyer(String nick) {
            this.nick = nick;
            this.purchases = new ArrayList<>();
        }
        public void payForOrder(Order order){
            order.pay();
        }
        public void addToPurchases(Order order){
            this.purchases.add(order);
        }
        public void addToOrder(Product product, Order order){
            order.addProduct(product);
        }
    }
    static class Product{
        String title;
        public void setTitle(String s){
            this.title = s;
        }
    }
    static class Order{
        boolean isPaid;
        ArrayList<Product> productList;

        public Order() {
            this.isPaid = false;
            this.productList = new ArrayList<>();
        }

        public void addProduct(Product product){
            this.productList.add(product);
        }
        public void pay(){
            this.isPaid = true;
        }

    }

    public static void checkOrder(Order order, Buyer buyer, CommodityExpert commodityExpert){
        if(order.isPaid){
            buyer.addToPurchases(order);
            commodityExpert.addToSales(order);
        } else {
            commodityExpert.addToBlackList(buyer);
        }
    }

    public static void start(){
        CommodityExpert Max = new CommodityExpert("Max");
        Buyer Alex = new Buyer("Alex");
        Buyer Oleg = new Buyer("Oleg");
        Product mobile = new Product();
        Product laptop = new Product();

        Max.setTitleOfProduct(mobile, "Smartphone");
        Max.setTitleOfProduct(laptop, "Laptop");

        Order order = new Order();
        Alex.addToOrder(mobile,order);
        Alex.payForOrder(order);
        TaskVII.checkOrder(order, Alex, Max);

        Order order1 = new Order();
        Oleg.addToOrder(mobile, order1);
        Oleg.addToOrder(laptop, order1);
        TaskVII.checkOrder(order1,Oleg, Max);
    }
}
