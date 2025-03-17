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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Cohort Module/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Learning Paths/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Learning Paths/div_Settings'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Search/a_Cohorts'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_Add New Cohort'))

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_Add New Cohort/input_Name_name'), 'Katalon cohort creation test')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_Add New Cohort/input_Cohort ID_idnumber'), '1733')

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Add New Cohort/input_qa_multi_select_field_submitbutton'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'), 
    'katalon cohort creation')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/i_Created manually_icon fa fa-cog fa-fw'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Edit cohort/input_Name_name'))

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_Edit cohort/input_Name_name'), 'QA_Katalon cohort creation test')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Edit cohort/input_qa_multi_select_field_submitbutton'))

//add for clear

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'),
	'')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'), 
    'QA_Katalon cohort creation test')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)


WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/i_Created manually_icon fa fa-eye fa-fw'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/i_Created manually_icon fa fa-eye fa-fw'))

WebUI.delay(2)

/*WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'), 
    'QA_Katalon cohort creation test')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    Keys.chord(Keys.ENTER))

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

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Assign cohort members/p_Footnote content editor for main footer'))
*/

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'),
	'')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'), 
    'QA_Katalon cohort creation test')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/i_Created manually_icon fa fa-trash fa-fw'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Delete cohort/button_Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'))


