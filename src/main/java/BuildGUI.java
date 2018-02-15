
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuildGUI {
    public void buildWindow()
    {
        JFrame cinemaScreen = new JFrame();
        cinemaScreen.setSize(400,400);

        Panel p1 = new Panel(new FlowLayout());
        Panel p2 = new Panel(new FlowLayout());
        Panel p3 = new Panel(new FlowLayout());
        Panel p4 = new Panel(new FlowLayout());

        Label studentL = new Label("Enter Student Ticket Amount");
        Label standardL = new Label("Enter Standard Ticket Amount");
        Label oapL = new Label("Enter OAP Ticket Amount");
        Label childL = new Label("Enter Child Ticket Amount");

        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        JSplitPane split2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);



        final TextField stdTicketAmnt = new TextField("0",2);
        final TextField oAPTicketAmnt = new TextField("0",2);
        final TextField studentTicketAmnt = new TextField("0",2);
        final TextField childTicketAmnt = new TextField("0",2);

        Button enter = new Button("Send Order");


        p1.add(standardL);
        p2.add(studentL);
        p3.add(oapL);
        p4.add(childL);

        p1.add(stdTicketAmnt);
        p2.add(studentTicketAmnt);
        p3.add(oAPTicketAmnt);
        p4.add(childTicketAmnt);

        split.setTopComponent(p1);
        split.setBottomComponent(p2);
        split.setDividerLocation(0.8);


        split2.setTopComponent(p3);
        split2.setBottomComponent(p4);
        split2.setDividerLocation(0.4);

        cinemaScreen.add(split,BorderLayout.NORTH);
        cinemaScreen.add(split2);
        cinemaScreen.add(enter,BorderLayout.SOUTH);
        cinemaScreen.setVisible(true);

        enter.addActionListener(new ActionListener()
        {


            public void actionPerformed(ActionEvent sendPurchase)
            {
                try
                {
                    int A = Integer.parseInt(stdTicketAmnt.getText());
                    int B = Integer.parseInt(oAPTicketAmnt.getText());
                    int C = Integer.parseInt(studentTicketAmnt.getText());
                    int D = Integer.parseInt(childTicketAmnt.getText());
                    System.out.println(A +""+B);
                    TotalPrice myPrice = new TotalPrice();
                    CinemaMain.Price = myPrice.returnTotalPrice(A,B,C,D);
                    System.out.println("\nYour current price is : £" + CinemaMain.Price);

                }
                catch(Exception e)
                {
                    System.out.println("Please enter a number value in all columns");
                }


            }

        });
    }

}
