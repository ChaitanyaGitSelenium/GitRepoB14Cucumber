package com.basic.differentFolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=true,
		features={"src/test/resources/com/basic/differentFolderFF/"},
		glue={"com/basic/differentFolder"}
		
		)

public class differentFolderRunnerTest
{
	
}
