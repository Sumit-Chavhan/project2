package Day3;

class A
{
    static int i = 1111;
 
    static
    {
        i = i-- - --i;
//      i = 1111 - 1109
        System.out.println("1st i from static of A :"+i);
    }
 
    { 
        i = i++ + ++i;
//      i = 2   + 4
        System.out.println("1st i from non-static of A :"+i);
    }
}
 
class B extends A
{
    static
    {
        i = --i - i--;
        //  1 - 1
        System.out.println("2nd i from static of B :"+i);
    }
 
    {
        i = ++i + i++;
        System.out.println("2nd i from nonstatic of B :"+i);
    }
}
public class Example5
{
    public static void main(String[] args)
    {
        B b = new B();
 
//       =0   - -1 
        System.out.println(b.i);
    }
}
