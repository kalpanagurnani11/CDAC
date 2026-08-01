using Microsoft.EntityFrameworkCore;

namespace WebApplicationEmp.Models
{
    public class EmpDbContext:DbContext
    {
        public DbSet<Employeeee> Emps { get; set; }
        public DbSet <Department> Depts{ get; set; }
        public EmpDbContext(DbContextOptions options):base(options)
        {
            
        }

    }
}
