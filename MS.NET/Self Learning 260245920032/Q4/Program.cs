using System;
using System.Collections.Generic;
using System.Linq;

namespace Q4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> numbers = new List<int> { 10, 20, 30, 40, 50 };

            Console.WriteLine("Where:");
            foreach (var i in numbers.Where(x => x > 20))
                Console.WriteLine(i);

            Console.WriteLine("OrderByDescending:");
            foreach (var i in numbers.OrderByDescending(x => x))
                Console.WriteLine(i);

            Console.WriteLine("Sum = " + numbers.Sum());
            Console.WriteLine("Max = " + numbers.Max());
            Console.WriteLine("Count = " + numbers.Count());
        }
    }
}