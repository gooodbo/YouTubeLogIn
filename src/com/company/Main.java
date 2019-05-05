package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IntelliJ IDEA 2019.1.1\\chromedriver.exe");
        YouTube youTube = new YouTube();
        youTube.logIn();
        youTube.subscribe();
    }
}
