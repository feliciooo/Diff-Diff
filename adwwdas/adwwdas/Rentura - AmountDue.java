public class AmountDue {
   //double itemPrice;
   //double itemQuantity;
   //double discountAmount;
   double taxRate = 0.12;
   double amountDue;

   public void computeAmountDue(double price) {
       amountDue = price * (1 + taxRate);
   }

   public void computeAmountDue(double price, double quantity) {
       amountDue = (price * quantity) * (1 + taxRate);
   }

   public void computeAmountDue(double price, double quantity, double discount) {
       amountDue = ((price * quantity) - discount) * (1 + taxRate);
   }

   public double getAmountDue() {
       return amountDue;
   }
}