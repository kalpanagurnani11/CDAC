namespace _27_Demo_Exception_Handling
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x = 40;
            int y = 0;
            try
            {
                int div = x / y;
                Console.WriteLine($"Div res={div}");

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

        }
    }
}

