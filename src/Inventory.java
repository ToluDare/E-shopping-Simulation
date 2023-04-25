import java.awt.*;
import javax.swing.*;

public class Inventory  {

    Product product = new Product();


//    // Code Credit: Mr Artymn
//
//    private ArrayList<String> load_string_list (String filename, ArrayList<String> temp){
//      temp = new ArrayList<String>();
//        try {
//            BufferedReader file = new BufferedReader(new FileReader(filename));
//            while (file.ready()) {
//                temp.add(file.readLine());
//            }//end while
//            file.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//
//        return temp;
//    }
//    private ArrayList<Double> load_double_list (String filename){
//        ArrayList<Double> temp = new ArrayList<Double>();
//        try {
//            BufferedReader file = new BufferedReader(new FileReader(filename));
//            while (file.ready()) {
//                temp.add(Double.valueOf(file.readLine()));
//            }//end while
//            file.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//
//        return temp;
//    }

    //////////////////////

    public void load_Inventory (){
       product.set_product("Water",3.99);
       product.set_product("Alcohol", 25.50);
        product.set_product("Pet Chicken Harness and Leash",15.00);
        product.set_product("Dehydrated-water",0.99);
        product.set_product("A sense of humour",30.98);
        product.set_product("Grandma's Diabetic Piss : Beer",5.00);
        product.set_product("Mischif Red Boots Rubber Shoes",50.00);
        product.set_product("Dry Eye Drops",11.50);
        product.set_product("Fruit Punch with Banana syrup",12.00);
        product.set_product("Virtual Girlfriend powered by ChatGPT",120.00);
        product.set_product("Red Jeans perfume by Versace",54.00);
        product.set_product("Java Shopping Cart Application please discuss with owner",150.00);


    }

    public void print_inventory(){
        JFrame inventory = new JFrame("Inventory");

        inventory.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        inventory.setSize(400,450);

        JLabel [] products = new JLabel[product.get_products_name().size()];
         int size = product.get_products_name().size();
        JPanel panel = new JPanel(new GridLayout(size, 2)); // rows, coloumns

        for (int i = 0; i < product.get_products_name().size() ; i++) {

            String price =  product.get_products_price().get(i).toString();
            products[i] = new JLabel(product.get_products_name().get(i) + " $" +price + "\n");
            panel.add(products[i]);
        }
        inventory.add(panel);
        inventory.setVisible(true);
}}
