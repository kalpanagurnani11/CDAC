namespace _02_EmptyTemplate
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            //Servicess

            var app = builder.Build();
            //middlewares


            //app.MapGet("/", () => "Hello World!");
            //app.MapPost("/", () => "Hello World from post method");
            //app.MapPut("/", () => "Hello World from Put method");

            //app.MapDelete("/", () => "Hello World from Delete method");

            app.Use(async (HttpContext,next) =>
            {
                await HttpContext.Response.WriteAsync("\nHello");
                await HttpContext.Response.WriteAsync("\n Hiii");
                next(HttpContext);
                await HttpContext.Response.WriteAsync("\n Still geetting output from 1");

            });
            app.Use(async (HttpContext, next) =>
            {
                await HttpContext.Response.WriteAsync("\nabcd-2");
                await HttpContext.Response.WriteAsync("\n1234-2");
                next(HttpContext);
                await HttpContext.Response.WriteAsync("\nStill geetting output from 2");

            });
            app.Run(async (HttpContext) =>
            {
                await HttpContext.Response.WriteAsync("\nthis is web is web form demo-3");
                await HttpContext.Response.WriteAsync("\nString1-3");
                
            });
            



            app.Run();
        }
    }
}
