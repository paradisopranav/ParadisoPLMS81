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

WebUI.click(findTestObject('Object Repository/Uploadcohorts/Page_Dashboard/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Uploadcohorts/Page_Dashboard/div_Settings'))

WebUI.click(findTestObject('Object Repository/Uploadcohorts/Page_PLMS Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Uploadcohorts/Page_PLMS Administration Search/a_Cohorts'))

WebUI.click(findTestObject('Object Repository/Uploadcohorts/Page_PLMS Administration Users Accounts Cohorts/a_Upload cohorts'))

WebUI.click(findTestObject('Uploadcohorts/filecohortupload/Page_/input_File_cohortfilechoose'))

WebUI.uploadFile(findTestObject('Uploadcohorts/filecohortupload/Page_/input_Attachment_repo_upload_file'), Cohortcsv)

WebUI.click(findTestObject('Object Repository/Uploadcohorts/Page_/button_Upload'))

//WebUI.waitForElementClickable(findTestObject('Object Repository/Uploadcohorts/Page_/input_Default context_previewbutton'), 2)
WebUI.click(findTestObject('Object Repository/Uploadcohorts/Page_/input_Default context_previewbutton'))

WebUI.click(findTestObject('Object Repository/Uploadcohorts/Page_/input_Default context_submitbutton'))

WebUI.click(findTestObject('Object Repository/Uploadcohorts/Page_/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Uploadcohorts/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'), 
    'uploadcohort')

WebUI.sendKeys(findTestObject('Object Repository/Uploadcohorts/Page_PLMS Administration Users Accounts Cohorts/input_Upload cohorts_search'), 
    Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/i_Created manually_icon fa fa-trash fa-fw'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_Delete cohort/button_Continue'))

WebUI.click(findTestObject('Object Repository/Cohort Module/Page_PLMS Administration Users Accounts Cohorts/a_All Cohorts_1'))

