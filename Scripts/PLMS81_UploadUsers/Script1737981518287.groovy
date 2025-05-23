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

WebUI.setText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Username_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/admin/tool/uploaduser/index.php')

WebUI.click(findTestObject('Page_PLMS Administration Users Accounts Upload Users/input_File_userfilechoose'))

WebUI.uploadFile(findTestObject('Page_PLMS Administration Users Accounts Upload Users/input_Attachment_repo_upload_file'), 
    file)

WebUI.click(findTestObject('Page_PLMS Administration Users Accounts Upload Users/button_Upload'))

WebUI.click(findTestObject('Page_PLMS Administration Users Accounts Upload Users/input_Preview Rows_submitbutton'))

WebUI.click(findTestObject('Page_PLMS Administration Users Accounts Upload Users/input__submitbutton'))

TestObject textElement = findTestObject('Object Repository/Page_PLMS Administration Users Accounts Upload Users/Page_PLMS Administration Users Accounts Upload Users/span_susa2dom.com')

//write a code to print below vaibale value
String extractedText = WebUI.getText(textElement)

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/local/people/index.php')
WebUI.setText(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), extractedText)

WebUI.sendKeys(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/Page_Manage People/input_Status_id_1_2_3'))
WebUI.click(findTestObject('Object Repository/Page_Manage People/i_New User_wid wid-dots'))

//WebUI.click(findTestObject('Object Repository/Page_Manage People/button_New User_btn btn_css dropdown dropdo_1428cf'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/span_Delete'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Administration Users Accounts Bul_d721b7/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Administration Users Accounts Bul_d721b7/button_Continue'))

