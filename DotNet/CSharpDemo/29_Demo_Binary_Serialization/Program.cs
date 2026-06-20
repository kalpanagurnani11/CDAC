using System.Runtime.Serialization.Formatters.Binary;
using System.Text.Json;
using System.Xml.Serialization;

namespace _29_Demo_Binary_Serialization
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Emp emp1 = new Emp();
            emp1.Eid = 1;
            emp1.Name = "test1";
            emp1.Address = "test1";

            string filepath = @"D:\CDAC\DotNet\CSharpDemo\29_Demo_Binary_Serialization\Data\data1.json";

            #region BinaryFormatter :Serialization
            //Emp emp1 = new Emp();
            //emp1.Eid = 1;
            //emp1.Name = "test1";
            //emp1.Address = "test1";

            //FileStream fs = null;

            //if (File.Exists(filepath))
            //{ fs = new FileStream(filepath, FileMode.Append, FileAccess.Write); }

            //else
            //{
            //    fs = new FileStream(filepath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //Type empType = emp1.GetType();
            //XmlSerializer xr= new XmlSerializer(empType);
            //xr.Serialize(fs, emp1);







            #endregion


            #region Deserialize

            //FileStream fs = null;

            //if (File.Exists(filepath))
            //{ fs = new FileStream(filepath, FileMode.Open, FileAccess.Read); }

            //else
            //{
            //    Console.WriteLine("File not found");
            //}
            //XmlSerializer serializer = new XmlSerializer(typeof(Emp));
            //Emp emp=serializer.Deserialize(fs) as Emp;
            //emp.GetEmpDetails();



            #endregion


            FileStream fs = null;
            if (File.Exists(filepath))
            {
                fs = new FileStream(filepath, FileMode.Open, FileAccess.Read);
            }
            else
            {
                fs = new FileStream(filepath, FileMode.OpenOrCreate, FileAccess.Write);
            }
            // JsonSerializer.Serialize(fs,emp1);
            //fs.Close();

            Emp emp=JsonSerializer.Deserialize<Emp>(fs);
            emp.GetEmpDetails();



        }
    }

    public class Emp
    {
        private int _Eid;
        private string _Name;
        private string _Address;

        public int Eid
        {
            get
            {
                return _Eid;
            }
            set
            {
                _Eid = value;
            }
        }
        public string Name
        {
            get
            {
                return _Name;
            }
            set
            {
                _Name = value;
            }
        }
        public string Address
        {
            get
            {
                return _Address;
            }
            set
            {
                _Address = value;
            }
        }
        public void GetEmpDetails()
        {
            Console.WriteLine($"Eid:{Eid}, Name:{Name}, Address:{Address}");
        }
    }
}


