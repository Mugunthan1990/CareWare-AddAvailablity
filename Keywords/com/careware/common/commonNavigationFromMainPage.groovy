package com.careware.common

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class commonNavigationFromMainPage {


	@Keyword

	def parentNavigation (data_ParentNavigationTap) {


		/// Uses Xpath of innertext it contains or ID of it //span[text()= '${ParentNavigationTap}']|//a[@id='${ParentNavigationTap}'] --- Example Text - Availability,scheduleGroup | Example ID - availability,Schedules


		WebUI.click(findTestObject('Page_NavigationToAll/btn_ParentNavigationTap',[('ParentNavigationTap') : data_ParentNavigationTap]))
	}

	@Keyword
	def ChildNavigation (data_ChildNavigationTap) {

		/// Uses XPath of innertext it contains and Its Id  //span[text() = '${ChildNavigationTap}']|//a[@id='${ChildNavigationTap}'] --- Example Text - Settings | Example ID - dsSettings

		WebUI.click(findTestObject('Page_NavigationToAll/btn_ParentNavigationTap', [('ChildNavigationTap') : data_ChildNavigationTap]))
	}
}
