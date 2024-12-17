package com.seleniumjavatest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    WebDriver driver;

    @BeforeEach

    public void setup(){

        driver = new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm#checkbox");
        driver.manage().window().maximize();

    }

    @Test

    public void TestRadioButton() throws InterruptedException {

        WebElement redColor = driver.findElement(By.xpath("//input[@value='red']"));
        WebElement yellowColor = driver.findElement(By.xpath("//input[@value='yellow']"));
        WebElement blueColor = driver.findElement(By.xpath("//input[@value='blue']"));
        WebElement orangeColor = driver.findElement(By.xpath("//input[@value='orange']"));
        WebElement purpleColor = driver.findElement(By.xpath("//input[@value='purple']"));
        WebElement greenColor = driver.findElement(By.xpath("//input[@value='green']"));

        System.out.println("Valor redColor: " + redColor.isSelected());
        System.out.println("Valor yellowColor: " + yellowColor.isSelected());
        System.out.println("Valor blueColor: " + blueColor.isSelected());
        System.out.println("Valor orangeColor: " + orangeColor.isSelected());
        System.out.println("Valor purpleColor: " + purpleColor.isSelected());
        System.out.println("Valor greenColor: " + greenColor.isSelected());

        yellowColor.click();
        orangeColor.click();
        purpleColor.click();

        Thread.sleep(1500);

        System.out.println("========== Luego de hacer click ============");
        System.out.println("Valor redColor: " + redColor.isSelected());
        System.out.println("Valor yellowColor: " + yellowColor.isSelected());
        System.out.println("Valor blueColor: " + blueColor.isSelected());
        System.out.println("Valor orangeColor: " + orangeColor.isSelected());
        System.out.println("Valor purpleColor: " + purpleColor.isSelected());
        System.out.println("Valor greenColor: " + greenColor.isSelected());

        assertTrue(yellowColor.isSelected());

    }

    @AfterEach

    public void tearDown(){

        driver.close();

    }

}
