namespace _08_Demo_EF.Models
{
    public class ProductViewModel
    {
        public Product Product { get; set; }

        public List<Category>? Categories { get; set; }
        public int SelectedCategoryId { get; set; }

    }
}
