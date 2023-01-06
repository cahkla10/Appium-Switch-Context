package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ProductPage;
import setups.DriverSetup;

public class ProductStep {
    ProductPage productsPage = new ProductPage(DriverSetup.getAppiumDriver());

    @When("^user click sort drop down$")
    public void user_click_sort_drop_down(){
        productsPage.clickSortDropDown();
    }

    @When("^user select sort \"([^\"]*)\"$")
    public void user_select_sort(String sort){
        productsPage.selectSort(sort);
    }

    @Then("^product will be sorted \"([^\"]*)\"$")
    public void product_will_be_sorted(String desc){
        productsPage.readSort(desc);
    }
}