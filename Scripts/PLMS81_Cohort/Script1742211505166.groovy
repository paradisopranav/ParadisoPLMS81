import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Cohort Module/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Paradiso LMS Log in to the site/button_Log in'))

// Generate a random name with 8 characters
String randomName = RandomStringUtils.randomAlphabetic(8).toLowerCase()

String randomNameupdate = RandomStringUtils.randomAlphabetic(8).toLowerCase()

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Dashboard/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Dashboard/div_Settings'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Search/a_Cohorts'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_Add New Cohort'))

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_Add New Cohort/input_Name_name'), randomName)

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_Add New Cohort/input_Cohort ID_idnumber'), randomName)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Add New Cohort/input_qa_multi_select_field_submitbutton'))

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'), 
    randomName)

WebUI.sendKeys(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_All Cohorts'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_System cohorts'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/i_Created manually_icon fa fa-eye fa-fw'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_All Cohorts'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_System cohorts'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/i_Created manually_icon fa fa-eye fa-fw'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_All Cohorts'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_System cohorts'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/i_Created manually_icon fa fa-cog fa-fw'))

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_Edit cohort/input_Name_name'), randomNameupdate)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Edit cohort/input_qa_multi_select_field_submitbutton'))

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'), 
    randomNameupdate)

WebUI.sendKeys(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_All Cohorts_1'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_System cohorts_1'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/i_Created manually_icon fa fa-users fa-fw'))

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_Assign cohort members/input_Search_addselect_searchtext'), 
    'hruta')

WebUI.sendKeys(findTestObject('Object Repository/Cohort Module/Page_Assign cohort members/input_Search_addselect_searchtext'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cohort Module/Page_Assign cohort members/select_hruta hruta (manashmail.com)hruta1 h_e50a15'), 
    '24315', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cohort Module/Page_Assign cohort members/select_hruta hruta (manashmail.com)hruta1 h_e50a15'), 
    '4898', true)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Assign cohort members/input_Match the search text anywhere in the_89f7b5'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Assign cohort members/input_Search_cancel'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_All Cohorts_1'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/i_Created manually_icon fa fa-users fa-fw_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cohort Module/Page_Assign cohort members/select_hruta hruta (manashmail.com)    hrut_d5ce47'), 
    '24315', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cohort Module/Page_Assign cohort members/select_hruta hruta (manashmail.com)    hrut_d5ce47'), 
    '4898', true)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Assign cohort members/input_Match the search text anywhere in the_31d039'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Assign cohort members/input_Search_cancel'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_System cohorts_1'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/i_Created manually_icon fa fa-trash fa-fw'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Delete cohort/button_Continue'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_All Cohorts_1'))

WebUI.closeBrowser()
