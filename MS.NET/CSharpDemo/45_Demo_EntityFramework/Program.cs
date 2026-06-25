using _45_Demo_EntityFramework.DAL;
using _45_Demo_EntityFramework.Models;

namespace _45_Demo_EntityFramework
{
    internal class Program
    {
        static void Main(string[] args)
        {

            IETDBContext _dbContext = new IETDBContext();
            var result=_dbContext.emps.ToList();
            foreach (Emp emp in result)
            {
                Console.WriteLine($"Name:{emp.Name},Id:{emp.Id},Address:{emp.Address}");
            }

            #region Insert
            //Console.WriteLine("enter name to be entered");
            //string name = Console.ReadLine();
            //Console.WriteLine("enter address to be entered");
            //string add = Console.ReadLine();

            //Emp empToBeInserted = new Emp { Name = name, Address = add };
            //_dbContext.emps.Add(empToBeInserted);
            //_dbContext.SaveChanges(); 
            #endregion

            #region Update
            //Console.WriteLine("Enter id");
            //int id = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("enter name to be updated");
            //string name = Console.ReadLine();
            //Console.WriteLine("enter address to be updated");
            //string add = Console.ReadLine();


            //Emp empToBeUpdated = _dbContext.emps.Find(id);
            //empToBeUpdated.Name = name;
            //empToBeUpdated.Address = add;
            //_dbContext.SaveChanges();

            #endregion

            Console.WriteLine("Enter id");
            int id = Convert.ToInt32(Console.ReadLine());



            Emp empToBeDeleted = _dbContext.emps.Find(id);
                _dbContext.emps.Remove(empToBeDeleted); 

            _dbContext.SaveChanges();









            //Console.WriteLine("Hello, World!");
        }
    }
}
