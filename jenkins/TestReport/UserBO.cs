using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class UserBO
{
    public User GetUserInstance(string username, string password, string email)
    {
        return new User(username, password, email);
    }
}