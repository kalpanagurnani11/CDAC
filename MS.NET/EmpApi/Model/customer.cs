using System.ComponentModel.DataAnnotations;

namespace EmpApi.Model
{
    public class customer
    {
        [Key]
        public int Id { get; set; }
        public string Name { get; set; }    
    }
}
