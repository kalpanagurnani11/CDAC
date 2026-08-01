using Microsoft.AspNetCore.Mvc;
using Q7.Models;

namespace Q7.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class StudentController : ControllerBase
    {
        static List<Student> students = new()
        {
            new Student { Id = 1, Name = "John" },
            new Student { Id = 2, Name = "Rohan" }
        };

        [HttpGet]
        public List<Student> Get()
        {
            return students;
        }

        [HttpPost]
        public void Post(Student s)
        {
            students.Add(s);
        }

        [HttpPut("{id}")]
        public void Put(int id, Student s)
        {
            var st = students.FirstOrDefault(x => x.Id == id);
            if (st != null)
            {
                st.Name = s.Name;
            }
        }

        [HttpDelete("{id}")]
        public void Delete(int id)
        {
            students.RemoveAll(x => x.Id == id);
        }
    }
}