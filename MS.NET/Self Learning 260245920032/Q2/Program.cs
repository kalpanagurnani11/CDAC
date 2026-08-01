using System;
using System.Collections.Generic;

namespace Q2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Employee> list = new List<Employee>()
            {
                new Employee { Id = 1, Name = "John" },
                new Employee { Id = 2, Name = "Rohan" }
            };

            foreach (Employee e in list)
            {
                Console.WriteLine($"{e.Id} {e.Name}");
            }
        }
    }

    class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
    }
}