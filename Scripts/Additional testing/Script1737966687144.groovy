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

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/login/index.php')

WebUI.setText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    'ed/1/AZbo1YX04df+rN1oA==')

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS/span_Manage people'))

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS/span_People'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/button_New User_btn btn_css dropdown dropdo_1428cf'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/span_Upload'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Administration Users Accounts Upl_824024/input_File_userfilechoose'))

WebUI.uploadFile(findTestObject('Page_PLMS Administration Users Accounts Upl_824024/input_File_userfilechoose_1'), file)

WebUI.click(findTestObject('Object Repository/Page_PLMS Administration Users Accounts Upl_824024/button_Upload'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Administration Users Accounts Upl_824024/input_Preview Rows_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Administration Users Accounts Upl_824024/p_Users created 1Users having a weak passwo_e2a8c9'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_PLMS Administration Users Accounts Upl_824024/p_Users created 1Users having a weak passwo_e2a8c9_1'), 
    'Users created: 1Users having a weak password: 0Errors: 0')

