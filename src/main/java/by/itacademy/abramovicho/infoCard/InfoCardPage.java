package by.itacademy.abramovicho.infoCard;

import org.openqa.selenium.edge.EdgeDriver;

public class InfoCardPage {
    EdgeDriver driver;

    public InfoCardPage(EdgeDriver driver) {
        this.driver = driver;
    }

    public String getClinicName() {
        return driver.findElement(InfoCardPagePath.clinicName).getText();
    }
}
