using System.Runtime.Serialization;

namespace _12_Demo_OOPS
{
    internal class Program
    {
        static void Main(string[] args)
        {
    Demo demo=new Demo();
            demo.WrapperMethod();
            HR hr=new HR();
            hr.Display();

        }
    }

    public class Person
    {
        //public string name
        public virtual string Name { get; set; }
        public virtual void Display()
        {
            Console.WriteLine("Persn:Display");
        }
    }
    public class Employee : Person
    {
        public sealed override string Name { get => base.Name; set => base.Name = value; }

        public sealed override void Display()
        {
            Console.WriteLine("Employee:Display");

        }
    }


        public sealed class HR : Employee
        {
            //    public override string Name { get => base.Name;set => base.Name = value; }
            //    public override void Display() {
            //        Console.WriteLine("Hr:Display");
            //}
            public void EmpData()
            { Console.WriteLine("EMpData:HR"); }
        }

    public class Demo
    {
        public void WrapperMethod()
        {
            HR obj = new HR();
        obj.EmpData();
        }

    }
    }




