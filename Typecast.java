
class Typecast
{
    public static void main(String arr[])
    {
        int a = 10;
        long l = a;
        double d = l;

        System.out.println("Typecasting in Int : "+a);
        System.out.println("Typecasting in Long : "+l);
        System.out.println("Typecasting in Double : "+d);

        double D = 2.55;
        long L = (long) D;
        int A = (int) L;

        System.out.println("\n\nTypecasting in Double : "+D);
        System.out.println("Typecasting in Long : "+L);
        System.out.println("Typecasting in Int : "+A);
    }
}