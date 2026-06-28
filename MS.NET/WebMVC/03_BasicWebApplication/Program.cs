namespace _03_BasicWebApplication
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            var app = builder.Build();
            //app.MapDefaultControllerRoute();
            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Demo}/{action=Index}/{id?}");

            app.MapControllerRoute(
               name: "name",
               pattern: "{controller=Demo}/{action=Data}/{nm}/{pwd}");

            //app.MapGet("/", () => "Hello World!");

            app.Run();
        }
    }
}
