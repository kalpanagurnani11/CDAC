using System.Collections;
namespace _22_Demo_Collections
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] nums = new int[3];
            nums[0] = 10;
            nums[1] = 20;
            nums[2] = 30;

            for (int i = 0; i < nums.Length; i++)
            {
                Console.WriteLine(nums[i].ToString());

            }
            string[] days = new string[3];
            days[0] = "Mon";
            days[1] = "Tue";
            days[2] = "Wed";

            for (int i = 0; i < days.Length; i++)
            {
                Console.WriteLine(days[i]);
            }

            Emp emp1 = new Emp();
            emp1.Id = 1;
            emp1.Name = "Hugh";
            emp1.Address = "NYC";

            Emp emp2 = new Emp();
            emp2.Id = 2;
            emp2.Name = "John ";
            emp2.Address = "USA";

            Emp emp3 = new Emp();
            emp3.Id = 3;
            emp3.Name = "Tom ";
            emp3.Address = "London";

            Book book = new Book();
            book.BookName = "Let us C++";
            book.AuthorName = "Yashwant ";

            Emp[] emps = new Emp[3];
            emps[0] = emp1;
            emps[1] = emp2;
            emps[2] = emp3;

            for (int i = 0; i < emps.Length; i++)
            {
                emps[i].GetEmpDetails();
            }


            Object [] arr = new Object[3];
            arr[0] = 100;
            arr[1] = "Something";
            arr[2] = true;
            arr[3]= emp1;
            arr[4] = 23.34;

        }
    }
    public class Emp
    {
        private int _Id;
        private string _Name;
        private string _Address;

        public int Id
        {
            get { return _Id; }
            set { _Id = value; }
        }
        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }
        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }

        public void GetEmpDetails()
        {
            Console.WriteLine($"Id: {Id}, Name: {Name}, Address: {Address}");
        }
    }

    public class Book
    {
        private string _BookName;
        private string _AuthorName;

        public string AuthorName
        {
            get { return _AuthorName; }
            set { _AuthorName = value; }
        }
        public string BookName
        {
            get { return _BookName; }
            set { _BookName = value; }
        }
    }
}


