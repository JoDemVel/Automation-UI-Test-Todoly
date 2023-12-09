package ui;

import org.openqa.selenium.By;

public class Project {
    public static By addNewProject = By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]");
    public static By newProjectField = By.xpath("//*[@id=\"NewProjNameInput\"]");
    public static By addNewProjectBottom = By.xpath("//*[@id=\"NewProjNameButton\"]");

    public static By project = By.xpath("//*[@id=\"ItemId_4174541\"]/table/tbody/tr/td[3]");
}
