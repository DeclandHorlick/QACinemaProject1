

public class CinemaMain

{static int Price;
 public static void main(String[]args)
 {

     CurrentDay cDay = new CurrentDay();
     cDay.getDate();

     BuildGUI myGUI = new BuildGUI();
     myGUI.buildWindow();

 }
}
