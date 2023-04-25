import java.util.ArrayList;
public class Product  { // not sure if i am to be adding this static
    private static String product_name;
    private static Double product_price;
    private static int final_index;

    private String search_product_name;
    private static Double search_product_price;
    private static Boolean is_found;
    private static ArrayList<String> products_name = new ArrayList<>();
    private static ArrayList<Double> products_price = new ArrayList<>();
    private static ArrayList<Integer> search_result_index = new ArrayList<>(); // index of products in the product arraylist, that have selected as a result of the search

    Product() {
        String product_name;
        Double product_price;
    }

    public void set_product(String product_name, Double product_price) {

        products_name.add(product_name.toLowerCase());
        products_price.add(product_price);
    }// creating products

    public void search_product(String input) {
        System.out.println("Results");
        int numbering = 0;
        for (int i = 0; i < products_name.size(); i++) {
            if (products_name.get(i).contains(input)) { // how do i get a containsIgnoreCase function
                numbering++;
                search_result_index.add(i);
                search_product_name = products_name.get(i);
                search_product_price = products_price.get(i);
                System.out.println(numbering + " " + search_product_name + "  $" + search_product_price + "\n");
                is_found=true;
            }
        }
    } // searching for products based off user input
    public int  validate_product_index(Integer input) {
        int computer_numbering_format = (input - 1);

//      flag -->  System.out.println("this is the computer_numbering_format : " + computer_numbering_format);

        for (int i = 0 ; i < search_result_index.size(); i++){
            if (i == computer_numbering_format) {
                final_index = search_result_index.get(computer_numbering_format); // final index is now the actual index of the product, ie product number
                System.out.println(products_name.get(final_index) + " " + products_price.get(final_index));
            }
        }

    return final_index; } // retieving users desired product from product arraylist ie inventory
    public int get_product_number(){
        return final_index;} // getting the index of the product in the inventory

    public String get_product_name_by_product_number(int index){
        String returned_name = products_name.get(index);
        return returned_name;
    } // accessing product name

    public Double get_product_price_by_product_number(int index){
        Double returned_price = products_price.get(index);
        return returned_price;
    } // accessing product price

    public ArrayList<String> get_products_name(){
        return products_name;
    }
    public ArrayList<Double> get_products_price(){
        return products_price;
    }
}


