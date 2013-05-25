package com.tastymonster.automation.home;

import org.testng.annotations.Test;

import com.tastymonster.automation.director.inventory.PatentDirector;
import com.tastymonster.automation.director.inventory.PatentFields;

public class TestIndexPage {
    
    @Test
    public void testPopupHandler() {
        PatentDirector director = new PatentDirector();
        PatentFields fields = new PatentFields();
        fields.companyName.setValue( "My Company" );
        fields.titleField.setValue( "My Awesome Invention" );
        fields.descriptionField.setValue( "My awesome invention" );
        fields.industry.setValue( "My Industry" );
        fields.inventorName.setValue( "Myself Lastname" );
        fields.inventorTitle.setValue( "Inventor Supreme" );
        director.create( fields );
    }
}
