using System.ComponentModel.DataAnnotations.Schema;

namespace Emp_MVC.Models
{
 
    public class Employee
    {

        public int Id { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }
    }
}
