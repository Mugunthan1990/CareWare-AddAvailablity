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

public class LogIn {

	@Keyword
	def logIn(url,Username,Password){

		//Open browser
		WebUI.openBrowser('')
		//Go to the perticuler website
		WebUI.navigateToUrl(url)
		//Login
		WebUI.setText(findTestObject('Page_CareWare  Log in/input_username'), Username, FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Page_CareWare  Log in/input_password'), Password)
		WebUI.click(findTestObject('Page_CareWare  Log in/button_Log In'))
		WebUI.click(findTestObject('Object Repository/Page_CommonElementInMainPage/btn_adjustTable'))
		println("\n    Login Sucessfull   \n")
	}
}



