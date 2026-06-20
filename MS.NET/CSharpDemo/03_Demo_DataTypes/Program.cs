namespace _03_Demo_DataTypes
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a = 5;
            Console.WriteLine(a.GetType());

            bool b = true;
            Console.WriteLine(b.GetType());

            string c = "hello";
            Console.WriteLine(c.GetType());

            Console.WriteLine("Enter a Num");

            string d = Console.ReadLine();
            int num=Convert.ToInt32(d);
            Console.WriteLine(num);
            Console.WriteLine("enter a num");
            int f=Console.Read()-'0';
            Console.WriteLine(f);

            Console.ReadKey();




        }
    }
}
