// DiscountedItem inherit from Item
public class DiscountedItem extends Item
{
 private double discount;// add an instance variable for the discount

      public DiscountedItem(String name, double price, double d){
     super(name,price);
     d = discount;
      }// Add constructors that call the super constructor

      public void setDiscount(double newDiscount){
      discount = newDiscount;
      }// Add get/set methods for discount
      public double getDiscount()
      {
        return discount; // return discount here instead of 0

}}