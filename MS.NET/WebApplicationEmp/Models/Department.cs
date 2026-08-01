using System.ComponentModel.DataAnnotations;

namespace WebApplicationEmp.Models
{
    public class Department
    {
        [Key]
        public int DId { get; set; }
        [Required(ErrorMessage ="Dept nam is required")]
        [StringLength(100)]
        public string DName { get; set; }
        public List<Employeeee>? Employees { get; set; }
    }
}
