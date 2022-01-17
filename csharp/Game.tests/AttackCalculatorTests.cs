using System;
using Xunit;

using Game;

namespace Game.tests
{
    public class AttackCalculatorTests 
    {
        [Fact]
        public void ThisTestShouldPass()
        {          
            Assert.Equal(0, 0);
        }

       [Fact]
        public void ThisTestShouldFail()
        {          
            Assert.Equal(0, 42);
        }
    }
}
