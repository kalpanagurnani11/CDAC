
//Problem Using Events and Delegate

//Create a quiz game.

//Ask 5 questions
//Each question has options A, B, C, D
//User enters the option
//Count correct answers
//If correct >= 3
//Raise Pass event
//Else
//Raise Fail event

namespace GameQuiz
{
    public delegate void ResultHandler(int score);
    internal class Program
    {
        
        static void Main(string[] args)
        {
            Quiz q=new Quiz();

            q.Pass += q.PassStudent;
            q.Fail += q.FailStudent;
            q.StartQuiz();

            #region Using Delegate Only
            //Student s=new Student();

            //ResultHandler handler;
            //int score = 4;
            //if(score>=3)
            //{
            //    handler = s.PassStudent;
            //}
            //else
            //{
            //    handler = s.FailStudent;
            //}
            //handler(score);

            #endregion

            #region Normal Method
            //int score = 4;
            //if(score>=3)
            //{
            //    s.PassStudent(score);
            //}
            //else
            //{
            //    {
            //        s.FailStudent(score);
            //    }
            //} 
            #endregion

        }
    }

    public class Quiz
    {


        public event ResultHandler Pass;
        public event ResultHandler Fail;
        public void PassStudent(int score)
        {
            Console.WriteLine("You Passed");
            Console.WriteLine($"You scored {score}/5");

        }
        public void FailStudent(int score)
        {

            Console.WriteLine("You Failed");
            Console.WriteLine($"You scored {score}/5");
        }

        //public void Result(int scoree)
        //{
        //    if (scoree >= 3)
        //    {
        //        Pass.Invoke(scoree);

        //    }
        //    else
        //    {
        //        Fail.Invoke(scoree);
        //    }
        //}
        public void StartQuiz()
        {
            int score = 0;
            string ans;
            Console.WriteLine("Que1:");
            Console.WriteLine("2 + 2 = ?");
            Console.WriteLine("A) 3   B) 4   C) 5   D) 6");
            Console.Write("Enter Option (A/B/C/D): ");
           ans = Console.ReadLine().ToUpper();
            if(ans=="B")
            {
                score++;
            }


            Console.WriteLine("Que2:");
            Console.WriteLine("5 × 2 = ?");
            Console.WriteLine("A) 7   B) 8   C) 10   D) 12");
            Console.Write("Enter Option (A/B/C/D): ");
             ans = Console.ReadLine().ToUpper();
            if (ans == "C")
            {
                score++;
            }

            Console.WriteLine("Que3:");
            Console.WriteLine("5 + 2 = ?");
            Console.WriteLine("A) 7   B) 8   C) 10   D) 12");
            Console.Write("Enter Option (A/B/C/D): ");
             ans= Console.ReadLine().ToUpper();
            if (ans == "A")
            {
                score++;
            }

            Console.WriteLine("Que 4");
            Console.WriteLine("Lang used for .NET?");
            Console.WriteLine("A) Java   B) C#   C) Python   D) PHP");
            Console.Write("Enter Option (A/B/C/D): ");
            ans = Console.ReadLine().ToUpper();
            if (ans == "B")
            {
                score++;
            }

            //Console.WriteLine("Que4:");
            //Console.WriteLine("5 + 5 = ?");
            //Console.WriteLine("A) 7   B) 8   C) 10   D) 12");
            //Console.Write("Enter Option (A/B/C/D): ");
            // ans = Console.ReadLine().ToUpper();
            //if (ans == "C")
            //{
            //    score++;
            //}

            Console.WriteLine("Que5:");
            Console.WriteLine("50 + 5 = ?");
            Console.WriteLine("A) 55   B) 28   C) 40   D) 12");
            Console.Write("Enter Option (A/B/C/D): ");
            ans = Console.ReadLine().ToUpper();
            if (ans == "A")
            {
                score++;
            }

            Console.WriteLine("--------------------------------------------");

            if (score >= 3)
            {
                Pass.Invoke(score);

            }
            else
            {
                Fail.Invoke(score);
            }
        }
        


    }
 
       
    }



