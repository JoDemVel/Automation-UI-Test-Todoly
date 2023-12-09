package task.validators;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LoggedPage;
import ui.Project;

public class ExistProject {
    public static boolean existProject(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, Project.project);
    }
}
