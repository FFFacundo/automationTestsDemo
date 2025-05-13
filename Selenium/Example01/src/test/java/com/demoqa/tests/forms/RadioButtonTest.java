package com.demoqa.tests.forms;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.forms.FormsPage;
import com.demoqa.pages.forms.PracticeFormPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioButtonTest extends BaseTest {
    @Test
    public void radioButtonSelectTest(){
        PracticeFormPage practiceFormPage = homePage.goToFormsPage().clickPracticeForm();
        practiceFormPage.clickOtherRadioButton();

        Assertions.assertTrue(practiceFormPage.isOtherRadioButtonSelected(),"\n\nOther radio button is not selected \n\n");
    }

}
