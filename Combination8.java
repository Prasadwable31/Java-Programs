
     // Case 8
//   Allowed
  

interface Demo
{
    void fun();
}
interface Hello extends Demo            // dont use 2 interface here
{
    void gun();
}

class Marvellous implements Hello               // in hello there are both fun, gun by inheritance
{
    void fun()
    {}
    void gun()
    {}
}