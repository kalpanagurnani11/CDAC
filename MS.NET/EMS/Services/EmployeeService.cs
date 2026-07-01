using EMS.DAL;
using EMS.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EMS.Services
{
   
        public class EmployeeService
        {
            AppDbContext db = new AppDbContext();

            public void AddEmployee()
            {
                Employee emp = new Employee();

                Console.Write("Name : ");
                emp.Name = Console.ReadLine();

                Console.Write("Department : ");
                emp.Department = Console.ReadLine();

                Console.Write("Salary : ");
                emp.Salary = decimal.Parse(Console.ReadLine());

                db.Employees.Add(emp);
                db.SaveChanges();

                Console.WriteLine("Employee Added");
            }

            public void DisplayEmployees()
            {
                var list = db.Employees.ToList();

                foreach (var e in list)
                {
                    Console.WriteLine($"{e.Id} {e.Name} {e.Department} {e.Salary}");
                }
            }

            public void UpdateEmployee()
            {
                Console.Write("Enter Employee Id : ");

                int id = int.Parse(Console.ReadLine());

                var emp = db.Employees.Find(id);

                if (emp != null)
                {
                    Console.Write("New Salary : ");

                    emp.Salary = decimal.Parse(Console.ReadLine());

                    db.SaveChanges();

                    Console.WriteLine("Updated");
                }
            }

            public void DeleteEmployee()
            {
                Console.Write("Enter Id : ");

                int id = int.Parse(Console.ReadLine());

                var emp = db.Employees.Find(id);

                if (emp != null)
                {
                    db.Employees.Remove(emp);

                    db.SaveChanges();

                    Console.WriteLine("Deleted");
                }
            }
        }
    }
}
}
