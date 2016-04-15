package com.tastymonster.automation.codegen;

public class GeneratePages {

    public static void main(String[] args) {
        // Generate the pages
        PageGenerator generator = new PageGenerator();
        generator.setPresentationLayer(new PatentMojoPresentationLayerInfo());
        generator.setTestGenerationLayer(new TestGenerationLayerInfo());
        generator.generatePages();
    }
}
