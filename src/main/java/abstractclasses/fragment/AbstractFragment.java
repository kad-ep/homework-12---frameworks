package abstractclasses.fragment;

import org.openqa.selenium.WebElement;

public abstract class AbstractFragment {


    private WebElement rootElement;

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getRootElement() {
        return rootElement;
    }

    public AbstractFragment(WebElement rootElement) {
        this.rootElement = rootElement;
    }
}
