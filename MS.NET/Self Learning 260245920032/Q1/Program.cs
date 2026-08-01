namespace Q1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee e = new Employee();
            e.Display();
        }
    }
    class Person
    {
        public virtual void Display()
        {
            Console.WriteLine("Person");
        }
    }

    class Employee : Person
    {
        public override void Display()
        {
            Console.WriteLine("Employee");
        }
    }
}
