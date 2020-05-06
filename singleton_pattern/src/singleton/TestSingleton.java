package singleton;

import java.time.LocalDate;

public class TestSingleton
{
    public static void main(String[] args)
    {
        //test that we can't instantiate directly
        //DBConnection connection = new DBConnection();

        //test that one object only is ever returned
        DBConnection connection1 = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();

        System.out.println(connection1 == connection2);
    }
}
