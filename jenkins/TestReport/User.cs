using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class User
{
    private string _username;

    public string Username
    {
        get { return _username; }
        set { _username = value; }
    }
    private string _password;

    public string Password
    {
        get { return _password; }
        set { _password = value; }
    }
    private string _email;

    public string Email
    {
        get { return _email; }
        set { _email = value; }
    }

    public User() { }

    public User(string _username, string _password, string _email)
    {
        this._username = _username;
        this._password = _password;
        this._email = _email;
    }

    public override string ToString()
    {
        return "Username: "+this._username+"\nPassword: "+this._password+"\nEmail: "+this._email;
    }
}