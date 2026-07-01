using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Razor.Compilation;

namespace _05_ReturnTypeOFAction.Controllers
{
    public class HomeController : Controller
    {

        //IActionResult
        public IActionResult Index()
        {
            return View();
        }

        public ActionResult About()
        {
            return View();
        }

        public ActionResult<int> GetNum()
        {
            return 1234;
        }

        public ViewResult M1()
        {
            return View("~/Views/Home/About.cshtml");

        }

        public string GetsomeThing(string fnm,string lnm)
        {
            return $"Hello {fnm} {lnm}";
        }

        public JsonResult GetData()
        {
            var data = new {
            id=101,
            name="John",
            city="LA"
            };

            return new JsonResult(data);
        }
        public FileResult DownloadPDF()
        {
            var file = @"D:\CDAC\MS.NET\WebMVC\05_ReturnTypeOFAction\Data\hello.pdf";
            var byteArray=System.IO.File.ReadAllBytes(file);
            return File(byteArray, "application/pdf","hello.pdf");

            

        }
    }
}
