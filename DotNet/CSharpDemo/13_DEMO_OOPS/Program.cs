namespace _13_DEMO_OOPS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee emp = new Employee();
            emp.EID = 1;
            Console.WriteLine(emp.EID);
            emp.EName = "John";
            Console.WriteLine(emp.EName);


            HR obj= new HR();
            obj.HRName = "Tony";
            emp.HREmp = obj;

            Console.WriteLine($"HR:{emp.HREmp.HRName}");


        }
    }
    public class Employee
    {
        private int _Eid;
        private string _EName;
        private bool _isActive;
        private HR _HREmp;

        public int EID
        { get { return _Eid; } set { _Eid = value; } }

        public string EName { get { return _EName; } set { _EName = value; } }
        public bool isActive { get { return _isActive; } set { _isActive = value; } }
        public HR HREmp
        {
            get { return _HREmp;  }set { _HREmp = value; }
            //public void set_Eid(int id)
            //{
            //    this._Eid = id;
            //}

        }

    }

    public class HR
    {
        private String _HRName;
        public string HRName { get { return _HRName; } set { _HRName = value; } }


    }

}
