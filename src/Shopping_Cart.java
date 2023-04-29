import java.util.ArrayList;

public class Shopping_Cart {
    private  Double total_checkout = 0.00;
    public  ArrayList<Integer> index_of_picked_products = new ArrayList<>();

    Product product= new Product();
    Shopping_Cart(){
        Double total_checkout;
        ArrayList<Integer> index_of_picked_products;
    }

    public void add_to_cart(int index){
        index_of_picked_products.add(index);
    }
    public double total_price(){

        for (int i:
                index_of_picked_products) {
            total_checkout += product.get_product_price_by_product_number(i);
        }
        return total_checkout;
    }

    public void print_cart(){
        System.out.print("\t\t\tCART\n");
        for(int i: index_of_picked_products){
           System.out.println(product.get_product_name_by_product_number(i) + " $" + product.get_product_price_by_product_number(i));
        }
        total_price();
        System.out.println("\t\tTotal: $" + total_checkout);
    }


    public Double get_total_checkout() {
        return total_checkout;
    }
    public void remove_from_cart(int index){
        index_of_picked_products.remove(index);
    }




}
