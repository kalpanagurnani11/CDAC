using EmpApi.Model;
using Microsoft.AspNetCore.Mvc;
using System;

namespace EmpApi.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ValuesController : ControllerBase
    {
        private readonly CustomerDbContext db;

        public ValuesController(CustomerDbContext context)
        {
            db = context;
        }

        // GET: api/Values
        [HttpGet]
        public IActionResult Get()
        {
            return Ok(db.Customers.ToList());
        }

        // GET: api/Values/1
        [HttpGet("{id}")]
        public IActionResult Get(int id)
        {
            var customer = db.Customers.Find(id);

            if (customer == null)
                return NotFound();

            return Ok(customer);
        }

        // POST: api/Values
        [HttpPost]
        public IActionResult Post(customer customer)
        {
            db.Customers.Add(customer);
            db.SaveChanges();

            return Ok("Customer Added Successfully");
        }

        // PUT: api/Values/1
        [HttpPut("{id}")]
        public IActionResult Put(int id, customer customer)
        {
            var c = db.Customers.Find(id);

            if (c == null)
                return NotFound();

            c.Name = customer.Name;

            db.SaveChanges();

            return Ok("Customer Updated Successfully");
        }

        // DELETE: api/Values/1
        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            var c = db.Customers.Find(id);

            if (c == null)
                return NotFound();

            db.Customers.Remove(c);
            db.SaveChanges();

            return Ok("Customer Deleted Successfully");
        }
    }
}