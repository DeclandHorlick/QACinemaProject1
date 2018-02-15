public class TotalPrice
{
    public int returnTotalPrice()
    {
        int standardPrice=0;
        int oApPrice=0;
        int studentPrice=0;
        int childPrice=0;
        int totalPrice=0;

        Tickets buyTickets = new Tickets();
        try {
            standardPrice = buyTickets.StandardTicketAmount(4);
            oApPrice = buyTickets.OAPTicketAmount(1);
            studentPrice = buyTickets.StudentTicketAmount(1);
            childPrice = buyTickets.ChildTicketAmount(1);
            totalPrice = standardPrice + oApPrice + studentPrice + childPrice;
        }
        catch(ArithmeticException e)
        {

        }
        return totalPrice;
    }
}
