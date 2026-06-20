namespace _19_DEMO_Events_Delegates
{
    public delegate void ResultHandler(int mrk);

    internal class Program
    {
        static void Main(string[] args)
        {
            #region Delegate
            //Student s = new Student();

            //ResultHandler pass = new ResultHandler(s.pass_Student);
            //ResultHandler fail = new ResultHandler(s.Fail_Student);

            //Console.WriteLine("Enter marks");
            //s.Marks = Convert.ToInt32(Console.ReadLine());

            //if (s.Marks > 40)
            //{
            //    pass(s.Marks);
            //}
            //else
            //{
            //    fail(s.Marks);
            //} 
            #endregion
            Student s=new Student();
            s._pass += new ResultHandler(s.pass_Student);
            s._fail += new ResultHandler(s.Fail_Student);


            Console.WriteLine("Enter mrks: ");
            s.Marks = Convert.ToInt32(Console.ReadLine());

        }
    }
    public class Student
    {
        public event ResultHandler _pass;
        public event ResultHandler _fail;

        private int _marks;
        public int Marks
        {
            get { return _marks; }
            set
            {
                
                _marks = value;
                if(_marks>40)
                {
                    _pass(_marks);
                }

                else
                {
                    _fail(_marks);
                }



            }


        }
        public void RaiseEvent(int mrk)
        {
            if (mrk > 40)
            {
                _pass.Invoke(mrk);
            }
            else
            {
                _fail(mrk);
            }
        }
        public void pass_Student(int mrks)
        {
            Console.WriteLine($"Congrats! you have passed with {mrks} marks!!!!");


        }
        public void Fail_Student(int mks)
        {
            Console.WriteLine($"you have failed with {mks} marks!!!!");

        }
    }


    }
