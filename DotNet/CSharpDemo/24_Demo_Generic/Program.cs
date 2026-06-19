namespace _24_Demo_Generic
{
    public delegate void MyDelegate<T>(T para);
    internal class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Hello, World!");
            Demo demo = new Demo();
            bool result = demo.Try1<int, string, bool, double>(11, "abcd", true, 123.45);
            Console.WriteLine(result);

            MyClass obj=new MyClass();
            MyDelegate<string>del=new MyDelegate<string>(obj.Show);
            del("abcd");
        }
    }
    public class Demo

    {
        public R Try1<P,Q,R,S>(P p1,Q p2,R p3,S p4)
        {

            Console.WriteLine($"{p1},{p2},{p3},{p4}");
            return p3;
        }
    }
    public class MyClass
    {
        public void Show<T>(T obj)
        {
            Console.WriteLine($"{obj},type:{obj.GetType().ToString()}");
        }
        public void Display(double sal)
        {
            Console.WriteLine($"{sal}");

        }
    }


}
