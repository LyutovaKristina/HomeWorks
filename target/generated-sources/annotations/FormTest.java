package com.example.tests;

import com.example.pageobjects.OnlineRechargePage;
import io.github.bonigarcia.seljup.SeleniumWatch;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class O {
    private WebDriver driver;
    private OnlineRechargePage onlineRechargePage;