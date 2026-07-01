using System.Diagnostics;
using _06_Demo_ViewBag_Viewdata_TempData.Models;
using Microsoft.AspNetCore.Mvc;
using _06_Demo_ViewBag_Viewdata_TempData.IETDbViewModels;

namespace _06_Demo_ViewBag_Viewdata_TempData.Controllers
{
    public class HomeController : Controller
    {
        List<Emp> emps = new List<Emp>()
            {
                new Emp(){ EId= 1, EName ="Ganesh", Address="Pune"},
                 new Emp(){ EId= 2, EName ="Prathmesh", Address="Panji"},
                new Emp(){ EId= 3, EName ="Mitesh", Address="Patna"},
        
            };

        List<Customer> custs = new List<Customer>() {
            new Customer(){ CId = 11, CName = "Peter"},
            new Customer(){ CId = 12, CName = "Jean"},
            new Customer(){ CId = 13, CName = "Olivia"}
        };

        public IActionResult Index()
        {
            int id = 4567;
            return View(id);
        }
        public IActionResult GetData()
        {
            IETDbViewModel viewmodelObj = new IETDbViewModel(){
                allEmps = emps,
                    allCustomers = custs};
            return View(viewmodelObj);

        }

        public IActionResult GetEmpData()
        {
            return View(emps);
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
