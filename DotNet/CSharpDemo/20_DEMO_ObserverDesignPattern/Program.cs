using System.Collections.Specialized;

namespace _20_DEMO_ObserverDesignPattern


{
    public delegate void MyHandler();
    internal class Program
    {
        static void Main(string[] args)
        {
            Publisher publisher = new Publisher();
            Subscriber subsA = new Subscriber();
            Subscriber subsB = new Subscriber();
            publisher.NotifyChange += new MyHandler(subsA.SMSService);
            publisher.NotifyChange += new MyHandler(subsB.EmailService);

            WeatherStation obj = new WeatherStation();
            if (obj.Alert())
            {
                publisher.RaiseNotification();
            }

            publisher.NotifyChange -= new MyHandler(subsB.EmailService);
            publisher.NotifyChange += new MyHandler(subsB.WpService);

            if (obj.Alert())
            {
                publisher.RaiseNotification();
            }







        }
    }
    public class WeatherStation
    {
        public bool Alert()
        {
            return true;
        }
    }
    public class Publisher
    {
        public event MyHandler NotifyChange;
        public void RaiseNotification()
        {
            NotifyChange(); ;
        }
    }
    public class Subscriber
    {
        public void SMSService()
        {
            Console.WriteLine("Sms sent becoz of change in data");
        }
        public void EmailService()
        {
            Console.WriteLine("Email sent becoz of change in data");
        }
        public void WpService()
        {
            Console.WriteLine("Wp msg sent becoz of change in data");
        }

    }


}
