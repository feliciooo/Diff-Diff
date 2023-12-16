import java.util.Scanner;

public class RunAmountDue {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       AmountDue due = new AmountDue();

       System.out.println("Press any of the following then enter values separated by spaces: ");
       System.out.println("1 - Price only");
       System.out.println("2 - Price and Quantity");
       System.out.println("3 - Price, Quantity, and Discount Amount");

       int choice = sc.nextInt();
       sc.nextLine();

       if (choice == 1) {
           
           double price = sc.nextDouble();
           due.computeAmountDue(price);
           
           System.out.println("Amount due is " + due.getAmountDue());
           
       } else if (choice == 2) {
           
           double price = sc.nextDouble();
           double quantity = sc.nextDouble();
           due.computeAmountDue(price, quantity);
           
           System.out.println("Amount due is " + due.getAmountDue());
           
       } else if (choice == 3) {
           
           double price = sc.nextDouble();
           double quantity = sc.nextDouble();
           double discount = sc.nextDouble();
           due.computeAmountDue(price, quantity, discount);
           
           System.out.println("Amount due is " + due.getAmountDue());
           
       }
   }
}
