using Microsoft.AspNetCore.Mvc;
using System.Runtime.CompilerServices;

namespace _03_BasicWebApplication.Controllers
{
    public class DemoController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        public string Data(string ?nm, string? pwd)
        {
            return $"hello:{nm},Id:{pwd} ";
        }
        public string DashBoard(int? id,String? nm)
        {
            return $"Welcome {nm} - {id}";
        }
    }
}
