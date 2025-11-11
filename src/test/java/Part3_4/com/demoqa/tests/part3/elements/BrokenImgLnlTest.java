package Part3_4.com.demoqa.tests.part3.elements;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenImgLnlTest extends BaseTest{

    public static void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(5000); // Set connection timeout to 3 seconds
            httpURLConnection.connect();

            System.out.println("link is " + url + " - " + httpURLConnection.getResponseCode());
//            if(httpURLConnection.getResponseMessage().contains(url)){
//                System.out.println("Valid link working");
//                return;
//            }

            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
            }
        } catch (Exception e) {
            System.out.println(url + " - " + "is a broken link");
        }
    }

    @Test
    public void testSingleClick() {
        var BrokenLinkPage = homePage.goToElements().clickBrokenLink();
        BrokenLinkPage.ClickBrokenImage();
        System.out.println("Get the node of broken image");
        String tmpURL = BrokenLinkPage.GetBrokenImageURL();
        verifyLink(tmpURL);
    }

    @Test
    public void testBrokenLink(){
        var BrokenLinkPage = homePage.goToElements().clickBrokenLink();
        BrokenLinkPage.clickBrokenLink();
        System.out.println("Get the node of broken LINK ");
        String tmpBrokenURL = BrokenLinkPage.GetBrokenLink();
        verifyLink(tmpBrokenURL);
    }

    @Test
    public void testValidImageText(){
        var BrokenLinkPage = homePage.goToElements().clickBrokenLink();
        BrokenLinkPage.ClickValidImageLink();
        System.out.println("Get the node of valid image");
        String actualResult = BrokenLinkPage.getValidImageText();
        Assert.assertTrue(actualResult.equals("Valid image"), "\n" +
                "The actual result does not match expected results\n");
    }

    @Test
    public void testValidLink(){
        var BrokenLinkPage = homePage.goToElements().clickBrokenLink();
        BrokenLinkPage.ClickValidLink();
        String tmpValidLink = BrokenLinkPage.getValidLink();
        System.out.println("Get the node of valid link");
        verifyLink(tmpValidLink);
    }
}
