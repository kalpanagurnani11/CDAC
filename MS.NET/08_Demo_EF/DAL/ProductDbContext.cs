using _08_Demo_EF.Models;
using Microsoft.EntityFrameworkCore;

namespace _08_Demo_EF.DAL
{
    public class ProductDbContext:DbContext
    {
        public DbSet<Product> products { get; set; }
        public DbSet<Category> catgories { get; set; }

        public ProductDbContext(DbContextOptions options):base(options)

        {
            
        }
       

    }
}
