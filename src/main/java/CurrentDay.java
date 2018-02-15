

import java.util.Calendar;


public class  CurrentDay
{
    public boolean getDate()
        {
        boolean isItWednesday = false;
        Calendar currentDay = Calendar.getInstance();
        //System.out.println(currentDay.get(Calendar.DAY_OF_WEEK));

        if(currentDay.get(Calendar.DAY_OF_WEEK)==4)
        {
            isItWednesday = true;
        }
        else
        {
            isItWednesday = false;
        }
        return isItWednesday;

        }
}
