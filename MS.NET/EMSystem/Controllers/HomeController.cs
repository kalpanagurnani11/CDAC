using System.Diagnostics;
using EMSystem.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Razor.Compilation;

namespace EMSystem.Controllers
{
    public class HomeController : Controller
    {
        private readonly EmpDbContext _Dbcontext;

        public HomeController(EmpDbContext context)
        {
           _Dbcontext = context;
        }

        public IActionResult Index()
        {
           var emps= _Dbcontext.Emps.ToList();

            return View(emps);
        }

        [HttpGet]
        public IActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Create(Emp emps)
        {
            if(ModelState.IsValid)
            {
                _Dbcontext.Emps.Add(emps);
                _Dbcontext.SaveChanges();
                return RedirectToAction("Index");

            }
            return View();
        }
        [HttpGet]
        public IActionResult Edit(int id)
        {

            var emp = _Dbcontext.Emps.Find(id);
            if (emp == null)
            {
                return NotFound();
            }

            return View(emp);
        }

        [HttpPost]
        public IActionResult Edit(Emp emps)
        {
            if (ModelState.IsValid)
            {
                _Dbcontext.Emps.Update(emps);
                _Dbcontext.SaveChanges();
                return RedirectToAction("Index");

            }
            return View();
        }

        [HttpGet]
        public IActionResult Delete(int id)
        {
            var emp = _Dbcontext.Emps.Find(id);
            if (emp == null)
            {
                return NotFound();
            }

            return View(emp);
        }

        [HttpPost ,ActionName("Delete")]
        public IActionResult DeleteConfirmed (int id)
        {
            var emp = _Dbcontext.Emps.Find(id);
            if (emp == null)
            {
                return NotFound();
            }

           

            _Dbcontext.Emps.Remove(emp);
                _Dbcontext.SaveChanges();
                return RedirectToAction("Index");

            
            
        }
        [HttpGet]
        public IActionResult Details(int id)
        {
            var emp = _Dbcontext.Emps.Find(id);
            if (emp == null)
            {
                return NotFound();
            }

            return View(emp);
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
