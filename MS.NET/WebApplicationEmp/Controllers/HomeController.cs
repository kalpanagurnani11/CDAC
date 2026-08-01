using System.Diagnostics;
using System.Diagnostics.Eventing.Reader;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using WebApplicationEmp.Models;

namespace WebApplicationEmp.Controllers
{
    public class HomeController : Controller
    {
        private readonly EmpDbContext _dbcontext;

        public HomeController(EmpDbContext context)
        {
            _dbcontext = context;
        }
        public IActionResult Index()
        {
            var emps=_dbcontext.Emps.ToList();
            return View(emps);
        }

        [HttpGet]
        public IActionResult Create()
        {
            ViewBag.Depts = new SelectList(
                _dbcontext.Depts, "DId",
                "DName"
                );
            return View();
        }
        [HttpPost]
        public IActionResult Create(Employeeee emps)
        {
            if (ModelState.IsValid)
            {
                _dbcontext.Emps.Add(emps);
                _dbcontext.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.Depts = new SelectList(
                _dbcontext.Depts,"DId",
                "DName",
                emps.DId
                );
            ModelState.AddModelError("", "ENter name ");

            return View(emps);
        }

        [HttpGet]
        public IActionResult Edit(int id)
        {
           
            var emp=_dbcontext.Emps.Find(id);
            if (emp == null) 
                {
                   return NotFound(); 
                }


                ViewBag.Depts = new SelectList(
                               _dbcontext.Depts, "DId",
                               "DName",emp.DId
                               );
                return View(emp);
            }

        
        [HttpPost]
        public IActionResult Edit(Employeeee emps)
        {
            if (ModelState.IsValid)
            {
                _dbcontext.Emps.Update(emps);
                _dbcontext.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.Depts = new SelectList(
                _dbcontext.Depts, "DId",
                "DName",
                emps.DId
                );

            return View(emps);
        }
        [HttpGet]
        public IActionResult Delete(int id)
        {

            var emp = _dbcontext.Emps.Include(e=>e.Department).FirstOrDefault(e=>e.Id==id);
            if (emp == null)
            {
                return NotFound();
            }


            ViewBag.Depts = new SelectList(
                           _dbcontext.Depts, "DId",
                           "DName", emp.DId
                           );
            return View(emp);
        }


        [HttpPost,ActionName("Delete")]
        public IActionResult DeleteConfirm(int id )
        {

            var emp = _dbcontext.Emps.Find(id);
            if (emp == null)
            {
                return NotFound();
            }

            _dbcontext.Emps.Remove(emp);
                _dbcontext.SaveChanges();
                return RedirectToAction("Index");
            
            

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
