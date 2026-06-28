using Microsoft.AspNetCore.Mvc;

namespace _04_AttributeBasedRouting.Controllers
{
    [Route("BVS")]
    public class AdminController : Controller
    {   
        [Route("DashBoard")]

        public IActionResult Index()
            
        {
            return View();
        }
        [Route("Demo/{id?}")]
        public IActionResult GetData(int ? id)
        {
            return View("Data");
        }
        [Route("Test")]
        public IActionResult GetInfo()
        {
            return RedirectToAction("Index");
        }
    }
}
