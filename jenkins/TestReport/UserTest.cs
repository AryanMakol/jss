using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace TestReport
{
    [TestClass]
    public class UserTest
    {
        [TestMethod]
        public void TestUser()
        {
            User user = new User("Elsa", "elsa", "elsa@gmail.com");
            UserBO userBO = new UserBO();
            User result = userBO.GetUserInstance("Elsa", "elsa", "elsa@gmail.com");
            Assert.AreEqual(user.Username, result.Username);
            Assert.AreEqual(user.Password, result.Password);
            Assert.AreEqual(user.Email, result.Email);
        }
    }
}
