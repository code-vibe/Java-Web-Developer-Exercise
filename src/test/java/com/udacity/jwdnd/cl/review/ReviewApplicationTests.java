package com.udacity.jwdnd.cl.review;

import com.udacity.jwdnd.cl.review.model.ChatMessage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ReviewApplicationTests {

	public int port;
	public static WebDriver driver;
	public String baseURL;

	@BeforeAll
	public static void beforeAll() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public@AfterAll
	static void afterAll() {
		driver.quit();
		driver = null;
	}

	@BeforeEach
	public void beforeEach() {
		baseURL = "http://localhost: + port";
	}

	@Test
	public void testUserSignupLoginAndSubmitMessage() {
		String username = "john";
		String password = "password123";
		String messageText = "Hello!";


		driver.get(baseURL + "/signup");

		SignupPage signupPage = new SignupPage(driver);
		signupPage.signup("John", "Doe", username, password);

		driver.get(baseURL + "/login");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);

		ChatPage chatPage = new ChatPage(driver);
		chatPage.sendChatMessage(messageText);

		ChatMessage sentMessage = chatPage.getFirstMessage();

		assertEquals(username, sentMessage.getUsername());
		assertEquals(messageText, sentMessage.getMessageText());
	}

}
