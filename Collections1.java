// https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html#method_summary
import java.util.*;

class Collections1
{
    public static void main(String arg[])
    {
        LinkedList <Integer>lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);
        lobj.add(111);

        System.out.println("Elements of linked list are : "+lobj);

        lobj.addFirst(1);
        System.out.println("Elements of linked list are : "+lobj);
        
        lobj.addLast(121);
        System.out.println("Elements of linked list are : "+lobj);

        Iterator iobj = lobj.iterator();                        // Iterator = class       iterator = inbuilt method
        System.out.println("Data using iterator is : ");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        if(lobj.contains(121))
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
        
        lobj.set(1,500);
        System.out.println("Elements of linked list are : "+lobj);

        lobj.clear();
        System.out.println("Elements of linked list are : "+lobj);
    
    
    }
}