package pageObjects;

public class Login_PO extends Base_PO{

    public Login_PO(){
        super();
    }

    public void navigateTo_WebDriverUniversity_Login_Page(){
        navigateTo_URL("https://www.webdriveruniversity.com/Login-Portal/index.html?");
    }
}
