import java.util.Scanner;

class Main
{
//boolean , byte , char , short , int , long , float and double
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        System.out.println(sc.nextLine());
        sc.close();
    }
}