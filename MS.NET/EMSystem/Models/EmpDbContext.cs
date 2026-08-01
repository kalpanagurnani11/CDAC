using Microsoft.EntityFrameworkCore;


namespace EMSystem.Models
{
    public class EmpDbContext:DbContext
    {
        public DbSet<Emp> Emps { get; set; }
        public EmpDbContext(DbContextOptions<EmpDbContext> options):base(options)
        { 
        }
       
    }
}
