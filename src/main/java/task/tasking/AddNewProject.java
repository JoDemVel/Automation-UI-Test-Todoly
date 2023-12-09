package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoggedPage;
import ui.Project;

public class AddNewProject {
    public static void as(WebDriver webDriver, String email, String password, String project){
        Login.as(webDriver, email, password);
        Click.on(webDriver, Project.addNewProject);
        Enter.text(webDriver, Project.newProjectField, project);
        Click.on(webDriver, Project.addNewProjectBottom);
    }
}
