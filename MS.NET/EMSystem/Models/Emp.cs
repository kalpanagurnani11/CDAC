using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EMSystem.Models
{
    [Table("Employeee")]
    public class Emp
    {
        [Key]
        public int Id { get; set; }
        public string Name { get; set; }

    }
}
