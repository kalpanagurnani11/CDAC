using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace WebApplicationEmp.Models
{
    public class Employeeee
    {
        [Key]   
        public int Id { get; set; }
        [Required(ErrorMessage ="Emp name is required")]
        public string Name { get; set; }
        public int DId { get; set; }
        [ForeignKey("DId")]
        public Department? Department { get; set; }

    }
}
