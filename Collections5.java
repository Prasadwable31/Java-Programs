// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
import java.util.*;

class Collections5
{
    public static void main(String arg[])
    {
        ArrayList <Float>aobj = new ArrayList<Float>();

        aobj.add(10.6f);
        aobj.add(20.6f);
        aobj.add(30.6f);
        aobj.add(40.6f);
        aobj.add(50.6f);

        aobj.add(2,1.60f);

        aobj.remove(1);

        Iterator iobj = aobj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        aobj.clear();

    }

}