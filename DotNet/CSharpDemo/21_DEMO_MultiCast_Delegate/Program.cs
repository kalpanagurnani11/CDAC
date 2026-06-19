namespace _21_DEMO_MultiCast_Delegate
{ 
    public delegate void MyEventHandler();

    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("is special guest is here?");
            bool isHere = true;

            AnnualFunction obj=new AnnualFunction();

            MyEventHandler handler = new MyEventHandler(obj.Welcome);
            handler += new MyEventHandler(obj.HostSpeech);
            handler += obj.GuestSpeech;
            if (isHere)
            {
                handler += obj.SpecialGuestSpeech;
            }
            else
            {
                handler -= obj.SpecialGuestSpeech;
            }
                handler += obj.Dance;
            handler += obj.Dinner;
            handler += obj.GoodBye;
            handler += obj.PackUp;

            handler();

        }
    }
    public class AnnualFunction()
    {
        public void Welcome()
        {
            Console.WriteLine("Welcome"); 
    }
    public void HostSpeech()
        {
            Console.WriteLine("HostSpeech");
        }

        public void GuestSpeech()
        {
            Console.WriteLine("GuestSpeech");
        }
        public void SpecialGuestSpeech()
        {
            Console.WriteLine("SpecialGuestSpeech");
        }
        public void Dance()
        {
            Console.WriteLine("Dance");
        }
        public void Dinner()
        {
            Console.WriteLine("Dinner");
        }
        public void GoodBye()
        {
            Console.WriteLine("GoodBye");
        }
        public void PackUp()
        {
            Console.WriteLine("PackUp");
        }
    }

    }
