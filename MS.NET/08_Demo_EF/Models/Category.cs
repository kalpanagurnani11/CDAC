using System.ComponentModel.DataAnnotations;

namespace _08_Demo_EF.Models
{
    public class Category
    {
        [Key]
        public int CId { get; set; }
        public string  CategoryName { get; set; }
        public List<Product> AllProducts { get; set; }

    }
}
