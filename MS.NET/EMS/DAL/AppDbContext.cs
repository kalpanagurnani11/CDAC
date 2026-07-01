using EMS.Model;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EMS.DAL
{
    public class AppDbContext : DbContext
    {
        public DbSet<Employee> Employees { get; set; }

        public DbSet<Login> Logins { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            IConfiguration config = new ConfigurationBuilder()
                .SetBasePath(Directory.GetCurrentDirectory())
                .AddJsonFile("appsettings.json")
                .Build();

            string con = config.GetConnectionString("DefaultConnection");

            optionsBuilder.UseSqlServer(con);
        }
    }
}
