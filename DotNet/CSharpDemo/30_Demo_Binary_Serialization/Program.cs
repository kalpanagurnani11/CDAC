using System;
using System.Collections.Generic;
using System.Diagnostics.Eventing.Reader;
using System.IO;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Text;
using System.Threading.Tasks;

namespace _30_Demo_Binary_Serialization
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region BinaryFormatter :Serialization
            //Emp emp1=new Emp();
            //emp1.Eid = 1;
            //emp1.Name = "test1";
            //emp1.Address = "test1";
            //string filepath = @"D:\CDAC\DotNet\CSharpDemo\30_Demo_Binary_Serialization\Data\empdata2.txt";
            //FileStream fs = null;

            //if (File.Exists(filepath))
            //{ fs = new FileStream(filepath, FileMode.Append, FileAccess.Write); }

            //else {
            //    fs = new FileStream(filepath, FileMode.OpenOrCreate, FileAccess.Write);
            //}


            //BinaryFormatter bf=new BinaryFormatter();
            //bf.Serialize(fs, emp1);
            //fs.Close(); 
            #endregion


            #region Deserialize
            string filepath = @"D:\CDAC\DotNet\CSharpDemo\30_Demo_Binary_Serialization\Data\empdata2.txt";
            FileStream fs = null;

            if (File.Exists(filepath))
            { fs = new FileStream(filepath, FileMode.Open, FileAccess.Read); }

            else
            {
                Console.WriteLine("File not found");
            }


            BinaryFormatter bf = new BinaryFormatter();
            Emp emp = bf.Deserialize(fs) as Emp;
            emp.GetEmpDetails();

            fs.Close(); 
            #endregion





        }
    }
    [Serializable]
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
