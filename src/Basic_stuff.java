/**
 * Created by dbuka on 23.05.2017.
 */
public class Basic_stuff {

    //ПРИМЕР №1
    //автоупаковка и распаковка с оператором сравнения
    //
    public static void box_unbox()
    {
        Integer in = new Integer(25);
        if (in < 35)
            System.out.println("Value of int = " + in);
    }

    public static void main(String[] args)
    {
        box_unbox();

    }
}


