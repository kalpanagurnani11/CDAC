namespace _05_Demo_OOPS
{
    public class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                #region TP
                //Console.WriteLine("enter ur choice 1.mysqlserver,2.oracleserver");


                //    int dbchoice = Convert.ToInt32(Console.ReadLine());
                //    switch (dbchoice)
                //    {
                //        case 1:
                //            {
                //                MySqlServer mysql = new MySqlServer();

                //                Console.WriteLine("enter ur choice 1.insert,2.Update,3.Delete");
                //                int mychoice = Convert.ToInt32(Console.ReadLine());


                //                switch (mychoice)
                //                {
                //                    case 1:
                //                        {
                //                            mysql.insert();

                //                            break;
                //                        }
                //                    case 2:
                //                        {
                //                            mysql.update();
                //                            break;
                //                        }
                //                    case 3:
                //                        mysql.delete();
                //                        break;

                //                    default:
                //                        {
                //                            Console.WriteLine("invalid choice");
                //                            break;

                //                        }
                //                }
                //                break;
                //            }
                //        case 2:
                //            {
                //                OracleServer osr = new OracleServer();
                //                Console.WriteLine("enter ur choice 1.insert,2.Update,3.Delete");
                //                int mychoice1 = Convert.ToInt32(Console.ReadLine());


                //                switch (mychoice1)
                //                {
                //                    case 1:
                //                        {
                //                            osr.insert();

                //                            break;
                //                        }
                //                    case 2:
                //                        {
                //                            osr.update();
                //                            break;
                //                        }
                //                    case 3:
                //                        osr.delete();
                //                        break;
                //                    default:
                //                        {
                //                            Console.WriteLine("invalid choice");
                //                            break;

                //                        }
                //                }
                //                break;


                //            }
                //        default:
                //            {
                //                Console.WriteLine("invalid DB choice");
                //                break;
                //            }
                //    }

                //            Console.WriteLine("Do you want to continue? y/n");
                //            string ynChoice = Console.ReadLine().ToLower();// y,n

                //            if (ynChoice == "n")
                //            {
                //                break;
                //            }




                //} 
                #endregion

                Console.WriteLine("Enter your Database choice: 1. MySql, 2. Oracle");
                int dbChoice = Convert.ToInt32(Console.ReadLine());

                DataBaseFactory factory = new DataBaseFactory();
                Db dbObj = factory.GetSomeDb(dbChoice);
                if (dbObj != null)
                {
                    Console.WriteLine("Enter your db opeartion choice: 1. Insert, 2. Update, 3. Delete");
                    int opChoice = Convert.ToInt32(Console.ReadLine());
                    switch (opChoice)
                    {
                        case 1:
                            dbObj.Insert();
                            break;
                        case 2:
                            dbObj.Update();
                            break;
                        case 3:
                            dbObj.Delete();
                            break;
                        default:
                            Console.WriteLine("Invalid db operation choice");
                            break;
                    }
                }

                Console.WriteLine("Do you want to continue? y/n");
                string ynChoice = Console.ReadLine().ToLower();// y,n

                if (ynChoice == "n")
                {
                    break;
                }
            }
        }
    
    }

    public interface Db {

        void Insert();
        void Update();
        void Delete();

    }

    public class DataBaseFactory
    {
        public Db GetSomeDb(int dbChoice)
        {
            Db obj = null;
            switch (dbChoice)
            {
                case 1:
                    
                        obj = new MySqlServer();
                        break;
                    
                case 2:
                    
                    obj = new OracleServer();
                        break;
            
                default:
                    {
                        Console.WriteLine("Invalid database choice");
                        break;
                    }
            }
            return obj;
           
            }

        }
    



    public class MySqlServer:Db
    {
        public MySqlServer()
        {
        }
        public void Insert()
        {
            Console.WriteLine("Insert in MySqlServer");
        }
        public void Update()
        {
            Console.WriteLine("update in MySqlServer");
        }
        public void Delete()
        {
            Console.WriteLine("delete in MySqlServer");
        }
    }

    public class OracleServer:Db
    {
        public void Insert()
        {
            Console.WriteLine("Insert in OracleServer");
        }
        public void Update()
        {
            Console.WriteLine("update in OracleServer");
        }
        public void Delete()
        {
            Console.WriteLine("delete in OracleServer");
        }

    }
}

