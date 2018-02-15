public class Tickets
{
    CurrentDay isItWednesday = new CurrentDay();

    public int StandardTicketAmount(int amount)
    {


        if(isItWednesday.getDate() == true)
        {
            System.out.println("It is Wednesday you get a two pound discount on each ticket");
            System.out.println("\nYou have ordered " + amount + " Standard Tickets");
            int standardTickPrice = amount * 6;
            System.out.println("Standard Ticket SubTotal : £" + standardTickPrice);
            return standardTickPrice;
        }
        else
        {
            System.out.println("Unfortunately it is not Wednesday");
            System.out.println("\nYou have ordered " + amount + " Standard Tickets");
            int standardTickPrice = amount * 8;
            System.out.println("Standard Ticket SubTotal : £" + standardTickPrice );
            return standardTickPrice;
        }
    }
    public int OAPTicketAmount(int amount)
    {
        System.out.println("\nYou have ordered " + amount + " OAP Tickets");

        if(isItWednesday.getDate() == true)
        {

            int oAPTickPrice = amount * 4;
            System.out.println("OAP Ticket SubTotal : £" + oAPTickPrice );
            return oAPTickPrice;
        }

        else
        {
            int oAPTickPrice = amount * 6;
            System.out.println("OAP Ticket SubTotal : £" + oAPTickPrice );
            return oAPTickPrice;
        }

    }
    public int StudentTicketAmount(int amount)
    {
        System.out.println("\nYou have ordered " + amount + " Student Tickets");
        if(isItWednesday.getDate() == true)
        {

            int studentTickPrice = amount * 4;
            System.out.println("Student Ticket SubTotal : £" + studentTickPrice );
            return studentTickPrice;
        }
        else
        {
            int studentTickPrice = amount * 6;
            System.out.println("Student Ticket SubTotal : £" + studentTickPrice );
            return studentTickPrice;
        }
    }
    public int ChildTicketAmount(int amount)
    {
        System.out.println("\nYou have ordered " + amount + " Child Tickets");
        if(isItWednesday.getDate() == true)
        {

            int childTickPrice = amount * 2;
            System.out.println("Child Ticket SubTotal : £" + childTickPrice );
            return childTickPrice;
        }
        else
        {
            int childTickPrice = amount * 4;
            System.out.println("Child Ticket SubTotal : £" + childTickPrice );
            return childTickPrice;
        }
    }
}
