public class Main {

    public static void main(String[] args) {
        //Задача 1. Работа со String.
        String strOne;
        String strTwo;
        strOne = " Vlad!";
        strTwo = " How are u?";
        System.out.println(strOne.length());
        System.out.println(strOne.concat(strTwo)); //Канкатинация строк.

        //Задача 2. Продемонстировать явное и неявное приведение типов.
        int a = 7;
        short b = 17;


        b = (short) a; //Явное приведение.
        a = b; //Неявное приведение.
        System.out.println(a);
        System.out.println(b);

        //Задача 3. Показать переполнение.
        byte b = 120;
        b += 19;
        System.out.println(b);

        int l = (int)b; // Пробую byte привести к int - не понимаю почему не полчаеться.
        System.out.println(l);

        //Задача 4. Показать работу с методами и классами.
        int m = 7;
        int n = 170;

        Second.Process();
        Second.ProcessWithArg(m, n);
        System.out.println(Second.Function());
        System.out.println(Second.FunctionWithArg(m, n));
        System.out.println(Second.FunctionStr());
        System.out.println(Second.FunctionStrWithArg(strOne, strTwo));

    }
}