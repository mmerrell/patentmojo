package com.tastymonster.automation.codegen;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestGenerationLayerInfo implements ITestGenerationLayerInfo {

    private final Map<String, Object> testData = new LinkedHashMap<String, Object>();

    public TestGenerationLayerInfo() {
        testData.put("testFirstName", "Brown");
        testData.put("testLastName", "Charlie");
        testData.put("testEmail", "cbrown@clown.com");
        testData.put("testPhone", "212-555-1212");
        testData.put("testSQ", "What is my pet's name?");
        testData.put("testSA", "Snowy");
    }

    @Override
    public Map<String, Object> getTestData() {
        return testData;
    }

}
