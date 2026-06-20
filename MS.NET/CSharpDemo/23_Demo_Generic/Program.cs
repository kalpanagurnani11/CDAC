
namespace _23_Demo_Generic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Generic Swap & Dynamic Add
            //CMath cMath = new CMath();
            //int p = 10, q = 20;
            //cMath.swap(ref p, ref q);
            //Console.WriteLine($"after swapping P={p},Q={q}");
            //String s1 = "hello", s2 = "hii";
            //cMath.swap(ref s1,ref s2);
            //Console.WriteLine($"after swapping s1={s1},s2={s2}");

            //cMath.Add(10, 20);
            //cMath.Add(s1, s2); 
            #endregion


            #region out 
            //CMath cmath = new CMath();  
            //double r = 5;
            //double a = 0;
            //double c = 0;
            //cmath.calculate(r, out a, out c);

            //Console.WriteLine($"area:{a},c:{c}"); 
            #endregion


            #region Tuples
            //MyClass obj=new MyClass();
            //(int _id, string _nm) = obj.Demo(22, "ron");
            //Console.WriteLine($"{ _id},{ _nm}");
            //var elements= obj.Demo(12, "ronak");
            //Console.WriteLine($"{elements.id},{elements.nm}");

            #endregion

            #region  Optional/ Keyword / Positional Arguments
            //MyClass obj=new MyClass();
            //obj.Func(50, "Ron", "Ind");
            //obj.Func(40);
            //obj.Func(30, lm:"john", fnm: "peter"); 
            #endregion

            MyClass obj = new MyClass();
            obj.GreetPlayer(10, "Jim", "Tom");
            Console.WriteLine("{0},{1},{2}","lisa", "stuard","tom");






        }
    }
    public class CMath
    {

        public void swap<T>(ref T x, ref T y)
        {
            T temp;
            temp = x;
            x = y;
            y = temp;
        }

        public void Add<T>(T x, T y)
        {
            dynamic x1 = x;
            dynamic y1 = y;
            T result = x1 + y1;
            Console.WriteLine($"add={result}");



        }
        public void calculate(double r, out double a, out double c)
        {
            a = 3.14 * r * r;
            c = 2 * 3.14 * r;
        }
    }

    public class MyClass
    {
        public (int id, string nm) Demo(int id, string nm)
        {
            int Eid = id;
            string name = nm;
            return (Eid, name);
        }
        public void Func(int age, string fnm = "jo", string lm = "jack")
        {
            Console.WriteLine($"fn={fnm},ln={lm},age={age}");
        }

        public void GreetPlayer(int pn, params string[] playerNames)
        {
            for (int i = 0; i < playerNames.Length; i++)
            {
                Console.WriteLine($"Welcome,{playerNames[i]}");
            }
            Console.WriteLine(pn);

        }


    }
}

