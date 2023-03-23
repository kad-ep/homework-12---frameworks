package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavFragment extends AbstractFragment {
    public NavFragment(WebElement rootElement) {
        super(rootElement);
    }
    @FindBy(css = "div.user-nav")
    WebElement userNav;

    public WebElement getFragment(){
        return userNav;
    }


}
