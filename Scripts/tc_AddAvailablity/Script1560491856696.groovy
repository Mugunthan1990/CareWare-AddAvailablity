import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword as SetDateCalendarKeyword

//Login
CustomKeywords.'com.careware.common.LogIn.logIn'(GlobalVariable.G_url, GlobalVariable.G_username, GlobalVariable.G_password)

WebUI.delay(3)

//Navigating to AdAvailability Page -  Heere need to pass the availality eliment ID or Innertext
CustomKeywords.'com.careware.common.commonNavigationFromMainPage.parentNavigation'(data_ParentNavigationTap)

WebUI.delay(3)

//Add Availability
CustomKeywords.'com.careware.common.availablity.addAvilablity'(Year, Month, startDate, SetShift)

WebUI.delay(3)

//Go Back to Add availablity
CustomKeywords.'com.careware.common.commonNavigationFromMainPage.parentNavigation'(data_ParentNavigationTap)

WebUI.delay(3)

//Modify the availablity
CustomKeywords.'com.careware.common.availablity.modify'(Year, data_ModifyMonth, data_ModifyDate, data_MofifyShift)

WebUI.delay(3)


//Go Back to Add availablity
CustomKeywords.'com.careware.common.commonNavigationFromMainPage.parentNavigation'(data_ParentNavigationTap)

//Delete avilability
CustomKeywords.'com.careware.common.availablity.DeleteAvailability'()

WebUI.delay(5)



