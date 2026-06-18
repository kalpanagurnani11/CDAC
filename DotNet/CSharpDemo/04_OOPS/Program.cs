namespace _04_OOPS
{
    public class Program
    {
        static void Main(string[] args)
        {
            #region Hello
            //Console.WriteLine("Hello, World!");
            #endregion

            #region Person Class
            //Person person=new Person();
            //person.PID = 14;
            //person.PName = "John";
            //person.City = "MH";
            //person.GetDetails(); 
            #endregion

            #region Inheritance

            //CMath cMath = new CMath();
            //cMath.add(10, 20);
            //Console.WriteLine(cMath.subtract(100, 20));

            //Console.WriteLine(cMath.multiply(10, 20));

            //AdvMath admath=new AdvMath();

            //Console.WriteLine(admath.add(10, 20));
            //Console.WriteLine(admath.subtract(100, 20));
            //Console.WriteLine(admath.multiply(10, 20));
            //Console.WriteLine(admath.square(10)); 
            #endregion

            CMath cmath=new AdvMath();
            Console.WriteLine(cmath.add(10,70));
            Console.WriteLine(cmath.subtract(10, 70));

        }


    }
    public class Person
    {
        public int PID;
        public string PName;
        public string City;

        public Person()
        {
            Console.WriteLine("Person Ctor");
        }
        public void GetDetails()
        {
            Console.WriteLine($"Id={PID},Name={PName},City={City}");
        }

    }


    {
        public  int add(int x, int y)
        {
            return x + y;
        }
        public virtual int subtract(int x, int y) { return x - y; }
        public int multiply(int x, int y)
        {
            return x * y;
        }





    }

    public class AdvMath:CMath
    {

        public new int add(int x, int y)
        {
            return x + y + 100;
        }
        public override int subtract(int x,int y)
        {
            return x - y+200;
        }
        public int square(int x)
        {
            return x * x;

        }
    }

}

