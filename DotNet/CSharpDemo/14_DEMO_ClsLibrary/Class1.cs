namespace _14_DEMO_ClsLibrary
{
    public class CMath
    {
        public void Add(int x, int y)
        {
            Console.WriteLine($"Add = {x + y}");

        }
        private void Sub(int x, int y)
        {
            Console.WriteLine($"Sub = {x - y}");

        }
        protected void Mul(int x, int y)
        {
            Console.WriteLine($"mul = {x * y}");

        }
        internal void Div(int x, int y)
        {
            Console.WriteLine($"mul = {x / y}");

        }
        protected internal void Square(int x)
        {
            Console.WriteLine($"sq = {x * x}");

        }
    }
    public class Demo
    {
        public void WrapperMethod()
        {
            CMath obj = new CMath();
            obj.Add(1, 2);
            obj.Div(5, 2);
            obj.Square(2);

        }
    }
    public class MyClass : CMath { 
        public void WrapperMethod()
        {
            Mul(1, 2);
            Add(2, 3);
            Div(2, 3);
            Square(1);
        }


    }

}
