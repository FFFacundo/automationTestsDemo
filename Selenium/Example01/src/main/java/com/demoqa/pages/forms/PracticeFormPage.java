package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJs;
import static utilities.JavaScriptUtility.scrollToElementJs;

public class PracticeFormPage extends FormsPage {

    private By otherRadioButton = By.id("gender-radio-3");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");


    public void clickOtherRadioButton(){
        scrollToElementJs(otherRadioButton);
        clickJs(otherRadioButton);
    }

    public boolean isOtherRadioButtonSelected(){
        return find(otherRadioButton).isSelected();
    }

    public void clickSportsHobbyCheckbox(){
        if(!find(sportsHobbyCheckbox).isSelected()){
            scrollToElementJs(sportsHobbyCheckbox);
            clickJs(sportsHobbyCheckbox);
        }
    }
    public void clickReadingHobbyCheckbox(){
        if(!find(readingHobbyCheckbox).isSelected()){
            scrollToElementJs(readingHobbyCheckbox);
            clickJs(readingHobbyCheckbox);
        }
    }
    public void clickMusicHobbyCheckbox(){
        if(!find(musicHobbyCheckbox).isSelected()){
            scrollToElementJs(musicHobbyCheckbox);
            clickJs(musicHobbyCheckbox);
        }
    }

    public void unclickReadingHobbyCheckbox(){
        if(find(readingHobbyCheckbox).isSelected()){
            scrollToElementJs(readingHobbyCheckbox);
            clickJs(readingHobbyCheckbox);
        }
    }

}
