import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddNewProject;
import task.validators.ExistProject;

public class ProjectTest extends BaseTest{
    @Test
    public void addNewProjectTest(){
        AddNewProject.as(webDriver, "josue.test1@gmail.com", "Passwd123", "Diplomado V5");
        Assert.assertTrue(ExistProject.existProject(webDriver));
    }
}
