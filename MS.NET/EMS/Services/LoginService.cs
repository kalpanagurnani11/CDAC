using EMS.DAL;
using EMS.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EMS.Services
{
    public class LoginService
    {
  
            AppDbContext db = new AppDbContext();

            public void CreateUser()
            {
                Console.Write("Username : ");
                string user = Console.ReadLine();

                Console.Write("Password : ");
                string pass = Console.ReadLine();

                Login login = new Login()
                {
                    Username = user,
                    Password = pass
                };

                db.Logins.Add(login);
                db.SaveChanges();

                Console.WriteLine("User Created");
            }

            public void Login()
            {
                Console.Write("Username : ");
                string user = Console.ReadLine();

                Console.Write("Password : ");
                string pass = Console.ReadLine();

                var result = db.Logins
                               .FirstOrDefault(x =>
                                    x.Username == user &&
                                    x.Password == pass);

                if (result != null)
                    Console.WriteLine("Login Successful");
                else
                    Console.WriteLine("Invalid Credentials");
            }

            public void ResetPassword()
            {
                Console.Write("Username : ");
                string user = Console.ReadLine();

                var login = db.Logins
                              .FirstOrDefault(x => x.Username == user);

                if (login != null)
                {
                    Console.Write("New Password : ");
                    login.Password = Console.ReadLine();

                    db.SaveChanges();

                    Console.WriteLine("Password Updated");
                }
                else
                {
                    Console.WriteLine("User Not Found");
                }
            }
        }
    }

