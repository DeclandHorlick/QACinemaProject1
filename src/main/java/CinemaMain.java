import javax.swing.*;

public class CinemaMain

{
 public static void main(String[]args)
 {
     TotalPrice myPrice = new TotalPrice();
     int Price = myPrice.returnTotalPrice();
     System.out.println("\nYour current price is : £" + Price);

     CurrentDay cDay = new CurrentDay();
     cDay.getDate();

     //Simple version of Project completed building JFrame to input values
     //Will create a Jframe and action listener to just pass the ticket amount to my totalPrice class
     JFrame cinemaSceen = new JFrame();

 }
}
