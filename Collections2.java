// https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html#method_summary
import java.util.*;

class Collections2
{
    public static void main(String arg[])
    {
        LinkedList <String>lobj = new LinkedList<String>();

        lobj.add("Kapil");
        lobj.add("Aditya");
        lobj.add("Rohan");
        lobj.add("Rutik");
        lobj.add("Tejas");

        System.out.println("Elements of linked list are : "+lobj);

        lobj.addFirst("Pooja");
        System.out.println("Elements of linked list are : "+lobj);
        
        lobj.addLast("Sneha");
        System.out.println("Elements of linked list are : "+lobj);

        Iterator iobj = lobj.iterator();             // Iterator = class       iterator = inbuilt method of linkedlist class
        System.out.println("Data using iterator is : ");
        while(iobj.hasNext())                         //  hasNext = of Iterator class
        {
            System.out.println(iobj.next());
        }

        if(lobj.contains("Rohan"))
        {
            System.out.println("121 is present in LL");
        }
        else
        {
            System.out.println("121 is not present in LL");
        }

        lobj.remove();
        System.out.println("Elements of linked list are : "+lobj);

        lobj.remove(0);
        System.out.println("Elements of linked list are : "+lobj);

        lobj.removeLast();
        System.out.println("Elements of linked list are : "+lobj);

        System.out.println("Numbers of Elements are : "+lobj.size());
        
        lobj.set(1,"Dipak");
        System.out.println("Elements of linked list are : "+lobj);

        lobj.clear();
        System.out.println("Elements of linked list are : "+lobj);
    
    
    }
}