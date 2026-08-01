using Microsoft.EntityFrameworkCore;
using ProposalGovernance.Api.Models;

namespace ProposalGovernance.Api.Data
{
    public class GovernanceDbContext : DbContext
    {
        public GovernanceDbContext(DbContextOptions<GovernanceDbContext> options) : base(options)
        {
        }

        public DbSet<User> Users { get; set; } = null!;
        public DbSet<Proposal> Proposals { get; set; } = null!;
        public DbSet<Review> Reviews { get; set; } = null!;
        public DbSet<CapitalAllocation> CapitalAllocations { get; set; } = null!;
        public DbSet<Transaction> Transactions { get; set; } = null!;
        public DbSet<Notification> Notifications { get; set; } = null!;
        public DbSet<Investment> Investments { get; set; } = null!;
        public DbSet<Milestone> Milestones { get; set; } = null!;
        public DbSet<ProgressUpdate> ProgressUpdates { get; set; } = null!;
        public DbSet<DividendPayout> DividendPayouts { get; set; } = null!;

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);

            // Configure cascade deletes or constraints
            modelBuilder.Entity<Proposal>()
                .HasOne(p => p.Submitter)
                .WithMany()
                .HasForeignKey(p => p.SubmitterId)
                .OnDelete(DeleteBehavior.Restrict);

            modelBuilder.Entity<Review>()
                .HasOne(r => r.Proposal)
                .WithMany()
                .HasForeignKey(r => r.ProposalId)
                .OnDelete(DeleteBehavior.Cascade);

            modelBuilder.Entity<Review>()
                .HasOne(r => r.Reviewer)
                .WithMany()
                .HasForeignKey(r => r.ReviewerId)
                .OnDelete(DeleteBehavior.Restrict);

            modelBuilder.Entity<CapitalAllocation>()
                .HasOne(ca => ca.Proposal)
                .WithMany()
                .HasForeignKey(ca => ca.ProposalId)
                .OnDelete(DeleteBehavior.Cascade);

            modelBuilder.Entity<Transaction>()
                .HasOne(t => t.CapitalAllocation)
                .WithMany()
                .HasForeignKey(t => t.CapitalAllocationId)
                .OnDelete(DeleteBehavior.Cascade);

            modelBuilder.Entity<Notification>()
                .HasOne(n => n.User)
                .WithMany()
                .HasForeignKey(n => n.UserId)
                .OnDelete(DeleteBehavior.Cascade);

            modelBuilder.Entity<Milestone>()
                .HasOne(m => m.Proposal)
                .WithMany()
                .HasForeignKey(m => m.ProposalId)
                .OnDelete(DeleteBehavior.Cascade);

            modelBuilder.Entity<ProgressUpdate>()
                .HasOne(p => p.Proposal)
                .WithMany()
                .HasForeignKey(p => p.ProposalId)
                .OnDelete(DeleteBehavior.Cascade);

            modelBuilder.Entity<ProgressUpdate>()
                .HasOne(p => p.Author)
                .WithMany()
                .HasForeignKey(p => p.AuthorId)
                .OnDelete(DeleteBehavior.Restrict);

            modelBuilder.Entity<DividendPayout>()
                .HasOne(d => d.Proposal)
                .WithMany()
                .HasForeignKey(d => d.ProposalId)
                .OnDelete(DeleteBehavior.Cascade);

            modelBuilder.Entity<DividendPayout>()
                .HasOne(d => d.Investor)
                .WithMany()
                .HasForeignKey(d => d.InvestorId)
                .OnDelete(DeleteBehavior.Restrict);

            modelBuilder.Entity<Investment>()
                .HasOne(i => i.Investor)
                .WithMany()
                .HasForeignKey(i => i.InvestorId)
                .OnDelete(DeleteBehavior.Restrict);

            modelBuilder.Entity<Investment>()
                .HasOne(i => i.Proposal)
                .WithMany()
                .HasForeignKey(i => i.ProposalId)
                .OnDelete(DeleteBehavior.Cascade);

            // Seed initial data
            string adminHash = BCrypt.Net.BCrypt.HashPassword("admin123");
            string revHash1 = BCrypt.Net.BCrypt.HashPassword("reviewer123");
            string revHash2 = BCrypt.Net.BCrypt.HashPassword("reviewer123");
            string subHash1 = BCrypt.Net.BCrypt.HashPassword("submitter123");
            string subHash2 = BCrypt.Net.BCrypt.HashPassword("submitter123");

            modelBuilder.Entity<User>().HasData(
                new User { Id = 1, Username = "admin", PasswordHash = adminHash, Role = UserRoles.Admin, FullName = "System Administrator", Email = "admin@governance.com", Department = "Finance" },
                new User { Id = 2, Username = "reviewer1", PasswordHash = revHash1, Role = UserRoles.Reviewer, FullName = "Sarah Jenkins", Email = "sjenkins@governance.com", Department = "Engineering" },
                new User { Id = 3, Username = "reviewer2", PasswordHash = revHash2, Role = UserRoles.Reviewer, FullName = "David Vance", Email = "dvance@governance.com", Department = "Operations" },
                new User { Id = 4, Username = "submitter1", PasswordHash = subHash1, Role = UserRoles.Submitter, FullName = "Alice Cooper", Email = "acooper@governance.com", Department = "R&D" },
                new User { Id = 5, Username = "submitter2", PasswordHash = subHash2, Role = UserRoles.Submitter, FullName = "Bob Martin", Email = "bmartin@governance.com", Department = "Marketing" }
            );

            modelBuilder.Entity<Proposal>().HasData(
                new Proposal
                {
                    Id = 1,
                    Title = "NextGen AI Platform Infrastructure",
                    Description = "Acquisition of specialized GPU cluster assets to support machine learning workloads across corporate products.",
                    Department = "R&D",
                    RequestedAmount = 1200000.00m,
                    Status = ProposalStatuses.Submitted,
                    SubmitterId = 4,
                    StartupName = "NeuralOps Inc.",
                    ProblemStatement = "Current infrastructure cannot handle large-scale ML model training.",
                    ProposedStatement = "Deploy a GPU cluster with 128 A100 cards for distributed training.",
                    EquityOffered = 10.00m,
                    TeamDetails = "Alice Cooper (Lead), 3 ML Engineers, 2 DevOps",
                    Industry = "Technology",
                    Category = "Infrastructure",
                    CreatedAt = DateTime.UtcNow.AddDays(-10),
                    UpdatedAt = DateTime.UtcNow.AddDays(-10)
                },
                new Proposal
                {
                    Id = 2,
                    Title = "Global Marketing Campaign 2026",
                    Description = "Comprehensive rebranding and localized marketing campaign targeting APAC and EMEA regions.",
                    Department = "Marketing",
                    RequestedAmount = 450000.00m,
                    Status = ProposalStatuses.Draft,
                    SubmitterId = 5,
                    StartupName = "BrandWave Studios",
                    ProblemStatement = "Brand awareness in APAC and EMEA markets is below 20%.",
                    ProposedStatement = "Execute a 12-month digital + out-of-home campaign across 8 countries.",
                    EquityOffered = 5.00m,
                    TeamDetails = "Bob Martin (Lead), 2 Campaign Managers, 1 Creative Director",
                    Industry = "Marketing",
                    Category = "Branding",
                    CreatedAt = DateTime.UtcNow.AddDays(-5),
                    UpdatedAt = DateTime.UtcNow.AddDays(-5)
                }
            );

        }
    }
}
