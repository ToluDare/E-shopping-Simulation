import java.util.Scanner;

public class Session {
    private static String input ;
    private static Integer second_input;
    private static String third_input;
    private static Boolean is_users_confirmed = false;

    Session(){
        Scanner scanner;
        String input;
        Integer second_input;
        String third_input;
    }
    Product product = new Product();
    Shopping_Cart cart= new Shopping_Cart();
    Inventory inventory = new Inventory();

    public void session() {
        inventory.load_Inventory();
        inventory.print_inventory();
        System.out.println("Hello, Welcome to The OKStore!\nWhat are you looking for today?");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine().toLowerCase();
        product.search_product(input);

        users_pick(product);

        while (!is_users_confirmed) {
            System.out.println("Are you sure ? \n Y or N?");
            Scanner scan_again = new Scanner(System.in);
            third_input = scan_again.nextLine().toLowerCase();
            switch (third_input) {
                case "y":
                    int session_index = product.get_product_number();
                    cart.add_to_cart(session_index);
                    System.out.println(product.get_product_name_by_product_number(session_index) + " was added to cart");

                    System.out.println("Would you like to view cart(1) or continue shopping(2) ?");
                    second_input = scan_again.nextInt();
                    if (second_input == 1) {
                        /////////////////////////////////////
                        cart.print_cart();

                        System.out.println("Would you like to remove from cart(r) or continue shopping(s) ?");
                        third_input = scan_again.nextLine().toLowerCase();
                        switch (third_input) {
                            case "r":

                                System.out.println("remove which product? (please input product number)");
                                second_input = scan_again.nextInt();
                                cart.remove_from_cart(second_input);
                                System.out.println(product.get_product_name_by_product_number(second_input) + " was removed from cart");
                                break;

                            case "s":
                            session();
                            break;
                        }


                        /////////////////////////////////////

                    } else if (second_input == 2) {

                        session(); // having the whole process repeat itself whilst maintaining the values , recursion!
                    }

                    is_users_confirmed = true;
                    break;

                case "n":
                    users_pick(product);
                    break;
            }
        }
    }
    private static void users_pick (Product product) {
        System.out.println("Which product do you pick?\n Please input number"); // make the please note in light grey
        Scanner scan=new Scanner(System.in);
        second_input= scan.nextInt();
        product.validate_product_index(second_input);

    }
}
