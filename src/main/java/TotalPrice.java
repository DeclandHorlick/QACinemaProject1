public class TotalPrice
{
    public int returnTotalPrice(int stdATickets,int stuATickets,int oapATickets,int childATickets)
    {

        int standardTickets = stdATickets;
        int studentTickets = stuATickets;
        int oapTickets = oapATickets;
        int childTickets = childATickets;

        int standardPrice=0;
        int oApPrice=0;
        int studentPrice=0;
        int childPrice=0;
        int totalPrice=0;

        Tickets buyTickets = new Tickets();
        try {
            standardPrice = buyTickets.StandardTicketAmount(standardTickets);
            oApPrice = buyTickets.OAPTicketAmount(studentTickets);
            studentPrice = buyTickets.StudentTicketAmount(oapTickets);
            childPrice = buyTickets.ChildTicketAmount(childTickets);
            totalPrice = standardPrice + oApPrice + studentPrice + childPrice;
        }
        catch(ArithmeticException e)
        {

        }
        return totalPrice;
    }
}
