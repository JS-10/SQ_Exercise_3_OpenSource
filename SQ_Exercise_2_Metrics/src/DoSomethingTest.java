import org.junit.*;

//Exercise 2 - Task 1 - JUnit file
public class DoSomethingTest {

    private DoSomething object;

    @Before
    public void setUp() {
        object = new DoSomething();
    }

    // Start by entering while-statement, skipping first if-Statement and entering first else-Statement
    @Test
    public void testCalculation_VariablesAllSix(){
        Assert.assertTrue(21 == object.calculation(6, 6, 6));
    }

    // Skip while-statement
    @Test
    public void testCalculation_VariablesAllEight(){
        Assert.assertTrue(24 == object.calculation(8, 8, 8));
    }

    // Start by entering while-statement and both if-statements
    @Test
    public void testCalculation_CLargerThanB_ALargerThanC(){
        Assert.assertTrue(21 == object.calculation(6, 2, 4));
    }

    // Start by entering while-statement and first if-Statement, skipping second if-Statement and entering second else-Statement
    @Test
    public void testCalculation_CLargerThanB_ANotLargerThanC(){
        Assert.assertTrue(22 == object.calculation(4, 2, 10));
    }
}