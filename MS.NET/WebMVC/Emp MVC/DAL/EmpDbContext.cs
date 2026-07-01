using Microsoft.EntityFrameworkCore;

namespace Emp_MVC.DAL
{
    public class EmpDbContext:DbContext

    {
        public DbSet<Emp_MVC.Models.Employee> Employee { get; set; } = default!;
        public EmpDbContext(DbContextOptions<EmpDbContext> options)
           : base(options)
        {
        }
    }
}
