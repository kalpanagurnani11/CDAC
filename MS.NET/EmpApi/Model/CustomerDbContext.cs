using Microsoft.EntityFrameworkCore;

namespace EmpApi.Model
{
    public class CustomerDbContext:DbContext
    {
        public DbSet<customer> Customers { get; set; }
        public CustomerDbContext(DbContextOptions options):base(options)
        {
            
        }
    }
}
