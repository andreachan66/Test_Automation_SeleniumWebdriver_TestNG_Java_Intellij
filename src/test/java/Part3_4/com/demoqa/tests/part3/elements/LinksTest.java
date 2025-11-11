package Part3_4.com.demoqa.tests.part3.elements;

import Part3_4.com.demoqa.base.BaseTest;
import com.demoqa.pages.elements.LinkPracticePage;
import com.demoqa.pages.elements.LinksPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks(){
        var LinksPage = homePage.goToElements().clickLinks();
        LinksPage.clickBadRequestLink();
        String actualResponse =  LinksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400")
        && actualResponse.contains("Bad Request"),
        "\n Actual Response (" + actualResponse + ") \n Does not contain '400' and 'Bad Request' \n");
    }

//    @Test
//    public void testCreateLink(){
//        var LinkPracticePage = homePage.goToElements().clickLinkPractice();
//        LinkPracticePage.clickLinkPractice();
//        LinkPracticePage.clickLnkCreated();
//        String actualResponse = LinkPracticePage.getLnkCreatedResult();
//
//        System.out.println("Actual results  " + actualResponse);
//
//        Assert.assertTrue(actualResponse.contains("201"),
//                "\n" +
//                "\n Actual Response does not contain 201");
//    }
//
//    @Test
//    public void testNoContent(){
//        var LinkPracticePage = homePage.goToElements().clickLinkPractice();
//        LinkPracticePage.clickLinkPractice();
//        LinkPracticePage.clickLnkNoContent();
//        String actualResponse = LinkPracticePage.getLnkNoContentResult();
//
//        System.out.println("Actual Results: " + actualResponse);
//
//        Assert.assertTrue(actualResponse.contains("204"),
//                "\n" +
//                "\n Actual response does not contain 204");
//    }
//
//    @Test
//    public void testMoved(){
//        var LinkPracticePage = homePage.goToElements().clickLinkPractice();
//        LinkPracticePage.clickLinkPractice();
//        LinkPracticePage.clickLnkMoved();
//        String actualResponse = LinkPracticePage.getLnkMovedResult();
//
//        System.out.println("Actual Results: " + actualResponse);
//
//        Assert.assertTrue(actualResponse.contains("301"),
//                "\n" +
//                        "\n Actual response does not contain 301");
//    }
//
//    @Test
//    public void testBadRequest(){
//        var LinkPracticePage = homePage.goToElements().clickLinkPractice();
//        LinkPracticePage.clickLinkPractice();
//        LinkPracticePage.clickLnkBadRequest();
//        String actualResponse = LinkPracticePage.getBadRequestResult();
//
//        System.out.println("Actual Results: " + actualResponse);
//        Assert.assertTrue(actualResponse.contains("400"),
//                "\n"+
//                "\n Actual response does not contain 400");
//    }
//
//    @Test
//    public void testUnauthorized(){
//        var LinkPracticePage = homePage.goToElements().clickLinkPractice();
//        LinkPracticePage.clickLinkPractice();
//        LinkPracticePage.clickLnkAuthorized();
//        String actualResponse = LinkPracticePage.getUnauthorizedResult();
//
//        System.out.println("Actual Results: " + actualResponse);
//        Assert.assertTrue(actualResponse.contains("401"),
//                "\n"+
//                        "\n Actual response does not contain 401");
//    }

    @Test
    public void testForbidden(){
        var LinkPracticePage = homePage.goToElements().clickLinkPractice();
        LinkPracticePage.clickLinkPractice();
        LinkPracticePage.clickLnkForbidden();
        String actualResponse = LinkPracticePage.getForbiddenResult();

        System.out.println("Actual result: " + actualResponse);
        Assert.assertTrue(actualResponse.contains("403"),
                "\n" +
                "\n Actual response does not contain 403");
    }

    @Test
    public void testNotFound(){
        var LinkPracticePage = homePage.goToElements().clickLinkPractice();
        LinkPracticePage.clickLnkNotFound();
        LinkPracticePage.clickLnkNotFound();
        String actualResponse = LinkPracticePage.getNotFoundResult();

        System.out.println("Actual result: " + actualResponse);
        Assert.assertTrue(actualResponse.contains("404"),
                "\n" +
                "\n Actual response does not contain 404");
    }
}
