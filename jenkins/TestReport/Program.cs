using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main(string[] args)
    {
        UserBO userBo = new UserBO();

        Console.WriteLine("Enter the username");
        string name = Console.ReadLine();
        Console.WriteLine("Enter the password");
        string password = Console.ReadLine();
        Console.WriteLine("Enter the email");
        string email = Console.ReadLine();

        User user = userBo.GetUserInstance(name, password, email);

        Console.WriteLine("User details");

        Console.WriteLine(user);

        Console.ReadKey();
    }
}
