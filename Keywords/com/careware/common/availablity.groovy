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

public class availablity{

	@Keyword
	def addAvilablity ( Year , Month, StartDate ) {
		WebUI.click(findTestObject('AddAvilablity/GoToAddAvilablityPage'))

		WebUI.delay(3)

		WebUI.click(findTestObject('AddAvilablity/span_Add Availability'))

		WebUI.delay(1)

		//Open Clander for the Start Date
		WebUI.click(findTestObject('AddAvilablity/dp_addAvailablityStartDate'))

		WebUI.delay(1)

		//Set Date and schedule time for te start Date
		WebUI.selectOptionByLabel(findTestObject('AddAvilablity/btn_dd_Change_year'), Year, false)

		WebUI.delay(1)

		WebUI.selectOptionByLabel(findTestObject('AddAvilablity/btn_dd_change_month'), Month, false)

		WebUI.delay(1)

		WebUI.click(findTestObject('AddAvilablity/ele_dayToSelect', [('SetDate') : StartDate]))

		WebUI.delay(1)

		WebUI.click(findTestObject('AddAvilablity/div_D120700 AM - 0700 PM'))
		WebUI.click(findTestObject('Object Repository/AddAvilablity/AddAvailablity_Submit'))

		WebUI.click(findTestObject('Object Repository/AddAvilablity/AddAvailablity_Cancel'))

		// Cheack the added avaiilablilty
		WebUI.click(findTestObject('AddAvilablity/GoToAddAvilablityPage'))


	}
}
