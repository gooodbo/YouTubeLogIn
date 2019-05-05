package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
    private WebDriver driver;

    YouTube() {
        driver = new ChromeDriver();
    }

    public void logIn() throws InterruptedException {
        driver.get("https://www.youtube.com/");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("vikalosebys@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("ebanuzzablya");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();
        Thread.sleep(1000);

    }

    public void subscribe() throws InterruptedException {
        driver.get("https://www.youtube.com/user/TheNafig");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"subscribe-button\"]")).click();
        Thread.sleep(1000);

    }
}
