package com.tastymonster.automation.director.inventory;

import com.tastymonster.automation.director.base.AbstractFields;
import com.tastymonster.automation.director.base.IDirectorFields;
import com.tastymonster.automation.element.base.IClickable;
import com.tastymonster.automation.element.base.IDiv;
import com.tastymonster.automation.element.base.ITextBox;
import com.tastymonster.automation.page.base.BaseAddPatentPage;

public class PatentFields extends AbstractFields implements IDirectorFields {
    protected final BaseAddPatentPage page = newPage( BaseAddPatentPage.class );
    
    public final ITextBox dateConceived = page.dateConceived;
    public final ITextBox companyName = page.companyName;
    public final IClickable addInventor = page.addInventor;
    public final IClickable btnSubmit = page.btnSubmit;
    public final ITextBox industry = page.industry;
    public final ITextBox titleField = page.titleField;
    public final ITextBox inventorName = page.inventorName;
    public final IDiv wrapper = page.wrapper;
    public final ITextBox inventorTitle = page.inventorTitle;
    public final ITextBox descriptionField = page.descriptionField;

    public PatentFields() {
        super.fields.add( dateConceived );
        fields.add( companyName );
        fields.add( industry );
        fields.add( titleField );
        fields.add( inventorName );
        fields.add( inventorTitle );
        fields.add( descriptionField );
    };
}
