package task.validators;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.Project;
import ui.Todo;

public class ExistTodo {
    public static boolean existTodo(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, Todo.todo);
    }
}
