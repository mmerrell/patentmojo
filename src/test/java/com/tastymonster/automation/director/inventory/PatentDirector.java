package com.tastymonster.automation.director.inventory;

import com.tastymonster.automation.director.base.AbstractDirector;
import com.tastymonster.automation.director.base.IEntityDirector;
import com.tastymonster.automation.page.base.AddPatentPage;
import com.tastymonster.automation.page.base.IndexPage;


public class PatentDirector extends AbstractDirector implements IEntityDirector<PatentFields> {

    private IndexPage indexPage = newPage( IndexPage.class );
    private AddPatentPage addPatentPage = newPage( AddPatentPage.class );
    
	@Override
	public void create( PatentFields fields ) {
	    indexPage.navigate();
	    indexPage.addPatentNewTab.click();
	    fields.persist();
	    addPatentPage.btnSubmit.click();
	}

	@Override
	public void navigate( PatentFields fields ) {
	}

	@Override
	public void update( PatentFields oldFields, PatentFields newFields ) {
	}

	@Override
	public void delete( PatentFields fields ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists( PatentFields fields ) {
		// TODO Auto-generated method stub
		return false;
	}
}
