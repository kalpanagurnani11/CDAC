
namespace _18_DEMO_Delegate
{

     public delegate int MyDelegate2(int p, int q);
     public delegate int MyDelegate3(int x);

    internal class Program
    {
        public delegate void ShowPointer();
        public delegate void MyDelegate(String nm);

        static void Main(string[] args)
        {

            ShowPointer ptr= new ShowPointer(show);
            ptr.Invoke();
            MyDelegate del=new MyDelegate(Greet);
            del.Invoke("abcd");


            CMath cmath = new CMath();

            MyDelegate2 adddel = new MyDelegate2(cmath.Add);
            int addResult = adddel(2, 3);
            Console.WriteLine($"Add = {addResult}");

            MyDelegate2 subdel = new MyDelegate2(cmath.Sub);
            Console.WriteLine($"Sub = {subdel(33, 3)}");

            MyDelegate3 squaredel = new MyDelegate3(cmath.Square);
            Console.WriteLine($"Square = {squaredel(3)}");

        }

        static void show()
        {
            Console.WriteLine("Show");

        }
        static void Display()
        {
            Console.WriteLine("Display");

        }
        static void Greet(string name)
        {
            Console.WriteLine($"hello{name}");


        }

    }
    public class CMath
    {
        public int Add(int x, int y)
        {
            return x + y;
        }
        public int Sub(int x, int y)
        {
            return x - y;
        }
        public int Square(int x)
        {
            return x * x;
        }
    }

}

