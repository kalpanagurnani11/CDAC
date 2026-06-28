using Microsoft.AspNetCore.Mvc;

namespace _04_AttributeBasedRouting.Controllers
{
    [Route("{Controller}")]
    public class EmpController : Controller
    {
        [Route("{action}")]
        public IActionResult Index()
        {
            return View();
        }
    }
}
