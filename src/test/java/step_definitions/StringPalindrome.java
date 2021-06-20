package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StringPalindrome {
    private String testPalindrome;
    private boolean isPalindrome;

    @Given("I entered string {string}")
    public void iEnteredString(String toTest) {
        testPalindrome = toTest;
    }

    @When("I test it for Palindrome")
    public void iTestItForPalindrome() {
        isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());
    }

    @Then("the result should be {String}")
    public void theResultShouldBe(String result) {
        boolean expectedResult = Boolean.parseBoolean(result);
        if(expectedResult) {
            Assert.assertTrue(isPalindrome);
        }else{
            Assert.assertFalse(isPalindrome);

        }
    }

}
