using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Student.DAL;
using Student.Models;

namespace Student.Controllers
{
    public class HomeController : Controller
    {
        private readonly StudentDbContext dbcontext;

        public HomeController(StudentDbContext context)
        {
            dbcontext = context;
        }

        public IActionResult Index()
        {
           
            return View(dbcontext.Student.ToList());
        }
        [HttpGet]
        public IActionResult Create()
        {
            return View();



        }
        [HttpPost]
        public IActionResult Create(Students s)
        {
            dbcontext.Student.Add(s);
            dbcontext.SaveChanges();

            return View("Index");


        }
        [HttpGet]
        public IActionResult Update(int id)
        {
            Students s=dbcontext.Student.Find(id);
            return View(s);


        }
        [HttpPost]
        public IActionResult Update(Students s )
        {
            dbcontext.Student.Update(s);
            dbcontext.SaveChanges();
            return View("Index");
               


        }
        [HttpGet]
        public IActionResult Delete(int id)
        {
            Students s = dbcontext.Student.Find(id);
            return View(s);


        }
        [HttpPost]
        public IActionResult Delete(Students s)

        {
            dbcontext.Student.Remove(s);
            return View("Index");

        }
       
        public IActionResult Details(int id)
        {
            var s = dbcontext.Student.Find(id);
            return View(s);


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
