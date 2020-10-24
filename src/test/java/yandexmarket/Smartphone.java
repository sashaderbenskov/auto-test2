package yandexmarket;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Smartphone {
    public void smart() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1458,898));
        driver.get("https://www.mvideo.ru/product-list");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-category-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469778\"]")).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));
        driver.findElement(By.className("facet-price-min")).sendKeys("15000");
        driver.findElement(By.className("facet-price-max")).sendKeys("40000");



    }
    public void brand(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-monoblock_razreshenie-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469779\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294961497&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469779\"]")).click();

    }

    public void seriesSamsung(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-samsung_smarts-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185+4294961497+12391&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469781\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185+4294961497+12392&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469781\"]")).click();


    }

    public void NFC(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-tekhnologiia_nfc_smarts-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185+4294961497+4294956306&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469781\"]")).click();



    }
    public void memory(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-vstroen_pamyat_smarts-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185+4294961497+11858&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469781\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185+4294961497+11859&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469781\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185+4294961497+11860&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469781\"]")).click();


    }

    public void Operativememory(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-operativnaia_pamiat_smarts-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185+4294961497+12820&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469781\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185+4294961497+12822&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469781\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185+4294961497+12823&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469781\"]")).click();


    }

    public void LTE(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-podderzhka_4g_lte-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185+4294961497+4294956199&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469781\"]")).click();


    }

    public void Color(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-podderzhka_4g_lte-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294956343+4294965185+4294961497+4294956223&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603540469781\"]")).click();

    }

}
