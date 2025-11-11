package Utilities;

import static com.base.BasePage.delay;

public class ExpansionUtility extends Utitlity{


    public static void expandElements(String toggleStatus){

        if(toggleStatus.contains("rct-node-collapsed")) {
            delay(500);
            //CheckBoxPage.expandDropDownArrow();
        }

    }
}
