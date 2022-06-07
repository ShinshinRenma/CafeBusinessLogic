import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal() {
        int goal = 0;

        for (int i = 0; i < 11; i++){
            goal += i;
        }

        return goal;
    }

    public double getOrderTotal(double[] prices) {
        double priceSum = 0;

        for (double price : prices) {
            priceSum += price;
        }

        return priceSum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%o %s\n", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("\nHello, there are %o people in front of you: \n", customers.size());
        customers.add(userName);
        for(String customer : customers) {
            System.out.println(customer);
        }
    }
}

// Ninja Bonus: printPriceChart(String product, double price, int maxQuantity)
// Create a method that prints the cost for buying 1, then 2, etc. up to max

// Sensei Bonus: Format prices as currency.
// Hint: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

// Senpai Bonus: Take $0.50 more off of the original price every time the quantity increases. 
// Example: Given a $2.00 price and 4 max, where the prices would normally be $2, $4, $6 and $8, 
// the discount would yield $2, $3.50, $5, and $6.50, progressively taking off $0.50, then $1, then $1.50 
// from the group tag price:

// boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices)
// Let's overload the display menu! Given 2 arrays, an ArrayList of menu items (strings), and an ArrayList 
// of prices (doubles) print a menu! 
// However, first check:  if the arrays are not the same size, immediately return false.
// To print the menu, iterate from 0 to the last index. Each time through, print on the same line:
// a.) The index, b.) The menu item at that index, and c.) The price at that index. 
// Finally, return true.

// Sensei Bonus! Make a method addCustomers where a barista can enter multiple customers. 
// Hint: You can use a while loop and ask the user to type "q" when they are finished entering names.