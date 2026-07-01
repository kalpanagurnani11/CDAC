using System.Diagnostics;
using _08_Demo_EF.DAL;
using _08_Demo_EF.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace _08_Demo_EF.Controllers
{
    public class HomeController : Controller
    {
        private readonly ProductDbContext _dbcontext;

        

        public HomeController(ProductDbContext context)
        {
           _dbcontext = context;
        }

        public IActionResult Index()
        {
            var products = _dbcontext.products
                                    .Include(p => p.ProductCategory)
                             .ToList();
            ;
            return View(products);
        }

        [HttpGet]
        public IActionResult Create()
        {
            var vm=new ProductViewModel();
            vm.Product = new Product();
            vm.Categories = _dbcontext.catgories.ToList();
            return View(vm);
        }

        [HttpPost]
        public IActionResult Create(ProductViewModel vm)
        {

            foreach (var item in ModelState)
            {
                Console.WriteLine($"Key = {item.Key}");

                foreach (var error in item.Value.Errors)
                {
                    Console.WriteLine($"Error = {error.ErrorMessage}");
                }
            }

            //if (!ModelState.IsValid)
            //{
            //    vm.Categories = _dbcontext.catgories.ToList();

            //    return View(vm);
            //}

            Category category = _dbcontext.catgories.Find(vm.SelectedCategoryId);

            vm.Product.ProductCategory = category;

            _dbcontext.products.Add(vm.Product);

            _dbcontext.SaveChanges();

            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult Edit(int id)
        {
            Product? product =
            _dbcontext.products
                      .Include(p => p.ProductCategory)
                      .FirstOrDefault(p => p.ProductId == id);

            ProductViewModel vm =
            new ProductViewModel();

            vm.Product = product;

            vm.Categories =
            _dbcontext.catgories.ToList();

            vm.SelectedCategoryId =
            product.ProductCategory.CId;

            return View(vm);
        }

        [HttpPost]
        public IActionResult Edit(ProductViewModel vm)
        {
            if (!ModelState.IsValid)
            {
                vm.Categories =
                _dbcontext.catgories.ToList();

                return View(vm);
            }

            Category? category =
            _dbcontext.catgories.Find(vm.SelectedCategoryId);

            vm.Product.ProductCategory =
            category;

            _dbcontext.products.Update(vm.Product);

            _dbcontext.SaveChanges();

            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult Details(int id)
        {
            Product? product = _dbcontext.products
                                        .Include(p => p.ProductCategory)
                                        .FirstOrDefault(p => p.ProductId == id);

            return View(product);
        }

        [HttpGet]
        public IActionResult Delete(int id)
        {
            Product? product =
            _dbcontext.products
                      .Include(p => p.ProductCategory)
                      .FirstOrDefault
                      (p => p.ProductId == id);

            return View(product);
        }

        [HttpPost]
        public IActionResult Delete(Product product)
        {
            Product? p =
            _dbcontext.products.Find(product.ProductId);

            _dbcontext.products.Remove(p);

            _dbcontext.SaveChanges();

            return RedirectToAction("Index");
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
