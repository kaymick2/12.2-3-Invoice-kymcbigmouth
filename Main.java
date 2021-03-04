/**
   This program demonstrates the invoice classes by printing
   a sample invoice.
*/
public class Main
{  
   public static void main(String[] args)
   {  
      Address samsAddress 
            = new Address("Appliance Direct",
               "488 FL-436 Suit 1340", "Altamonte Springs", "FL", "32714");

      Invoice samsInvoice = new Invoice(samsAddress);
      samsInvoice.add(new Product("Whirlpool 33-inch Side-By-Side Refrigerator, Model WRS321SDHZ", 1397.77), 1);
      samsInvoice.add(new Product("Whirlpool 1.9 cu-ft Microwave, Model WMH32519HZ", 297.77), 1);
      samsInvoice.add(new Product("Toaster + Knife set", 19.99), 1);
      samsInvoice.add(new Product("Square D 20 Amp Single-Pole Plug-On Neutral Dual Function Circuit Breaker", 48), 1);

      System.out.println(samsInvoice.format());           
   }
}

