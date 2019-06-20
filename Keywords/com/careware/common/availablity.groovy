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
	def addAvilablity ( Year , Month, startDate,SetShift ) {

		WebUI.click(findTestObject('Page_addAvilablity/span_Add Availability'))

		//Open Clander for the Start Date
		WebUI.delay(1)


		WebUI.click(findTestObject('Page_addAvilablity/dp_addAvailablityStartDate'))

		WebUI.delay(1)

		//Set Date and schedule time for te start Date
		WebUI.selectOptionByLabel(findTestObject('Page_addAvilablity/btn_dd_Change_year'), Year, false)

		WebUI.delay(1)

		WebUI.selectOptionByLabel(findTestObject('Page_addAvilablity/btn_dd_change_month'), Month, false)

		WebUI.delay(1)

		WebUI.click(findTestObject('Page_addAvilablity/ele_dayToSelect', [('SetDate') : startDate]))

		WebUI.delay(1)

		WebUI.click(findTestObject('Page_addAvilablity/ShiftSelector', [('SetShift') : SetShift]))
		WebUI.delay(1)

		WebUI.click(findTestObject('Page_addAvilablity/AddAvailablity_Submit'))
		WebUI.delay(1)

		WebUI.click(findTestObject('Page_addAvilablity/AddAvailablity_Cancel'))
		WebUI.delay(1)



	}

	@Keyword
	def modify (Year, data_ModifyMonth, data_ModifyDate, data_MofifyShift) {

		WebUI.click(findTestObject('Page_addAvilablity/btn_ModifyAvailability'))
		WebUI.delay(1)

		WebUI.click(findTestObject('Page_addAvilablity/dp_addAvailablityStartDate'))

		WebUI.delay(1)

		//Set Date and schedule time for the start Date
		WebUI.selectOptionByLabel(findTestObject('Page_addAvilablity/btn_dd_Change_year'), Year, false)

		WebUI.delay(1)

		WebUI.selectOptionByLabel(findTestObject('Page_addAvilablity/btn_dd_change_month'), data_ModifyMonth, false)

		WebUI.delay(1)

		WebUI.click(findTestObject('Page_addAvilablity/ele_dayToSelect', [('SetDate') : data_ModifyDate]))

		WebUI.delay(1)

		WebUI.click(findTestObject('Page_addAvilablity/ShiftSelector', [('SetShift') : data_MofifyShift]))
		WebUI.delay(1)

		WebUI.click(findTestObject('Page_addAvilablity/AddAvailablity_Submit'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Page_addAvilablity/AddAvailablity_Cancel'))
		WebUI.delay(1)

	}
	
	@Keyword
	def DeleteAvailability (){

		WebUI.click(findTestObject('Object Repository/Page_addAvilablity/btn_DeleteAvilablity'))
		WebUI.delay(1)

		WebUI.click(findTestObject('Object Repository/Page_addAvilablity/btn_DeleteAvailabilityConformation'))

		WebUI.delay(1)

	}
}
