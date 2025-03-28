interface Animalfun
{
   void fun();
}

interface Animalgun 
{
   void gun();
}

class Demo implements Animalfun, Animalgun 
{
   public void fun() 
   {
      System.out.println("fun method");
   }

   public void gun() 
   {
      System.out.println("gun method");
   }

}

public class multipleinterface 
{
   public static void main(String args[]) 
   {
      Demo a = new Demo();
      a.fun();
      a.gun();
   }
}