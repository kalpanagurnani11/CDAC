using Microsoft.EntityFrameworkCore;
using Student.Models;

namespace Student.DAL
{
    public class StudentDbContext:DbContext

    {
        public StudentDbContext(DbContextOptions<StudentDbContext> options):base(options)
        {
            
        }
        public DbSet<Students> Student { get; set; }
    }
}
