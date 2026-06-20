namespace _25_Demo_Generic_Collections
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region List<int>
            // List<int> nums = new List<int>();
            //    nums.Add(1);
            //    nums.Add(2);
            //    nums.Add(3);
            //    nums.Add(4);
            //    for (int i = 0; i < nums.Count; i++)
            //    {
            //        Console.WriteLine(nums[i]);
            //    }
            //} 
            #endregion

            #region Stack<int>
            //Stack<int> stack = new Stack<int>();
            //stack.Push(1);
            //stack.Push(2);
            //stack.Push(3);
            //stack.Push(4);
            //int s = stack.Count;
            //for (int i = 0; i < s; i++)
            //{
            //    Console.WriteLine(stack.Pop());

            //} 
            #endregion

            #region List<Emp>
            //Emp emp1 = new Emp();
            //emp1.Id = 1;
            //emp1.Name = "Test";
            //emp1.Address = "test";

            //Emp emp2 = new Emp();
            //emp2.Id = 2;
            //emp2.Name = "Test2";
            //emp2.Address = "test2";

            //Emp emp3 = new Emp();
            //emp3.Id = 3;
            //emp3.Name = "Test3";
            //emp3.Address = "test3";

            //List<Emp> allemps = new List<Emp>();
            //allemps.Add(emp1);
            //allemps.Add(emp2);
            //allemps.Add(emp3);

            //for (int i = 0; i < allemps.Count; i++)
            //{
            //    Emp emp = allemps[i];
            //    Console.WriteLine($"Id:{allemps[i].Id},name:{allemps[i].Name},add:{allemps[i].Address}");
            //} 
            #endregion

            Emp emp1 = new Emp();
            emp1.Id = 1;
            emp1.Name = "Test";
            emp1.Address = "test";

            Emp emp2 = new Emp();
            emp2.Id = 2;
            emp2.Name = "Test2";
            emp2.Address = "test2";

            Emp emp3 = new Emp();
            emp3.Id = 3;
            emp3.Name = "Test3";
            emp3.Address = "test3";
            Dictionary<int, Emp> map = new Dictionary<int, Emp>();
            map.Add(1, emp1);
            map.Add(2, emp2);
            map.Add(3, emp3);

            foreach (Emp emp in map.Values)
            {
                Console.WriteLine($"Id: {emp.Id} name:{emp.Name},add:{emp.Address}");

            }
            foreach (int key in map.Keys)
            {
                Console.WriteLine($"Key:{key} value:{map[key].Name}");

            }
        }
    }
        public class Emp 
    
    { 
    
        private int _id;
        private string _name;
        private string _address;

                                                            

        public int Id
        {
            get { return _id; }
            set { _id = value; }
        }
        public string Name
            { get { return _name; } set { _name = value; } }    
        public string Address { 
            get { return _address; } 
            set { _address = value; }

                }



    }

    
        
    }

