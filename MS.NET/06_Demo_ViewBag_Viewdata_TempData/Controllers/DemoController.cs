using Microsoft.AspNetCore.Mvc;

namespace _06_Demo_ViewBag_Viewdata_TempData.Controllers
{
    public class DemoController : Controller
    {
        public IActionResult Index()
        {

            ViewBag.Title = "Index";
            ViewBag.Number = 123456;


            ViewData["name"] = "peter";


            string[] names = new string[] { "Peter", "Walter", "Olivia" };

            ViewBag.Names = names;

            int[] numbers = { 11, 12, 13, 14, 15 };

            ViewData["Numbers"] = numbers;

            TempData["Dev_Name"] = "Peter";

            return View();


        }
        public IActionResult About()
        {
            return View();
        }
        public IActionResult Contact()
        {
            return View();
        }
    }
}
