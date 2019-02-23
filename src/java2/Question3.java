package java2;

// 3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
public class Question3 {
    public static void main(String[] args)

    {

        try

        {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        }catch (ClassNotFoundException e)

        {

            e.printStackTrace();

        }

    }

}
