package com.udacity.jwdnd.cl.review;

import com.udacity.jwdnd.cl.review.model.ChatMessage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {

    @FindBy(css = "#chatMessageUsername")
    private WebElement firstMessageUsername;

    @FindBy(id="submitMessage")
    private WebElement submitButton;

    @FindBy(css = "#messageText")
    private WebElement textField;

    @FindBy(className = "chatMessageText")
    private WebElement firstMessageText;

    public ChatPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
    public void sendChatMessage(String text) {
        this.textField.sendKeys(text);
        this.submitButton.click();
    }

    public ChatMessage getFirstMessage() {
        ChatMessage result = new ChatMessage();
        result.setMessageText(firstMessageText.getText());
        result.setUsername(firstMessageUsername.getText());
        return result;
    }
}
