using System;

namespace Q6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("1. Inheritance");
            Console.WriteLine("2. Collections");
            Console.WriteLine("3. Exceptions");
            Console.WriteLine("4. LINQ");

            Console.Write("Enter Choice: ");
            int ch = Convert.ToInt32(Console.ReadLine());

            switch (ch)
            {
                case 1:
                    Console.WriteLine("Inheritance Selected");
                    break;

                case 2:
                    Console.WriteLine("Collections Selected");
                    break;

                case 3:
                    Console.WriteLine("Exceptions Selected");
                    break;

                case 4:
                    Console.WriteLine("LINQ Selected");
                    break;

                default:
                    Console.WriteLine("Invalid Choice");
                    break;
            }
        }
    }
}