using _14_DEMO_ClsLibrary;

namespace _15DEMO_OOPS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            CMath cmath=new CMath();
            cmath.Add(10, 20);
            Test test = new Test();
            test.TestWrapperMethod();
            
        }

    }
    public class Test:CMath
    {
        public void TestWrapperMethod()
        {
            Add(10, 20);
            Mul(10, 20);
            Square(3);
        }
    }
}
