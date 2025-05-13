package com.demoqa.tests.forms;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.forms.PracticeFormPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckboxTests extends BaseTest {
    @Test
    public void checkboxTest(){
        PracticeFormPage page = homePage.goToFormsPage().clickPracticeForm();

        page.clickSportsHobbyCheckbox();
        page.clickReadingHobbyCheckbox();
        page.clickMusicHobbyCheckbox();

        page.unclickReadingHobbyCheckbox();
        Assertions.assertFalse(page.isReadingChecked(),"\n\n Reading checkbox is selected! \n\n");

    }
}
