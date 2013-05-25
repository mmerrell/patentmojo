package com.tastymonster.automation.codegen;

import java.util.Set;

import com.tastymonster.automation.util.AutomationUtils;

public class ParseFreeMarker implements IPresentationParser {
	@Override
	public Set<FieldDetails> buildFieldDetails() {
		return null;
	}

	@Override
	public String getPageName() {
		return "";
	}

	@Override
	public String getPageURI() {
		return null;
	}

	@Override
	public String normalizeFieldName( String fieldName ) {
		return AutomationUtils.normalizeFieldName( fieldName );
	}

	@Override
	public void initPageContents() {
	}

}
