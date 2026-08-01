using System;
using System.Collections.Generic;
using System.Linq;

namespace Q5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<string> names = new List<string>
            {
                "John",
                "Rohan",
                "Aryan",
                "Aisha"
            };

            // Where
            var result = names.Where(x => x.StartsWith("A"));

            Console.WriteLine("Names starting with A:");
            foreach (var name in result)
            {
                Console.WriteLine(name);
            }

            // OrderBy
            Console.WriteLine("\nSorted:");
            foreach (var name in names.OrderBy(x => x))
            {
                Console.WriteLine(name);
            }

            // Count
            Console.WriteLine("\nCount = " + names.Count());
        }
    }
}
