package com.tastymonster.automation.codegen;

import org.testng.annotations.Test;

@Test
public class TestPatentMojoPageGenerator {

	@Test( groups = { "integration" } )
	public void testGeneratePages() {
		//Generate the pages
		PageGenerator generator = new PageGenerator();
		generator.setCodegenTemplatePath( "src/main/java/com/tastymonster/automation/codegen/templates/" );
		generator.setPresentationLayer( new PatentMojoPresentationLayerInfo() );
		generator.generatePages();
	}
}
