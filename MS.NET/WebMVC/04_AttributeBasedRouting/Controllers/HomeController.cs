using Microsoft.AspNetCore.Mvc;

namespace _04_AttributeBasedRouting.Controllers
{
    [Route("Home")]
    public class HomeController : Controller
    {
        [Route(" ")]
        [Route("Index")]
        [Route("~/")]


        public IActionResult Index()
        {
            return View();
        }
    }
}
