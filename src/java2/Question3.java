package java2;

// 3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
/*the below program will throw ClassNotFoundException if the mentioned class “oracle.jdbc.driver.OracleDriver”
is not found in the classpath.*/
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
