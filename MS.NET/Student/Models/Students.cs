using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Student.Models
{
    [Table("Students")]
    public class Students
    {
        [Key]
        public int Sid { get; set; }
        public string Sname { get; set; }
        public DateOnly SDate { get; set; }
    }
}
