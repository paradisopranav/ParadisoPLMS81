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

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    'ed/1/AZbo1YX04df+rN1oA==')

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Paradiso LMS/i_Course Library_yui_3_17_2_1_1741273229905_12'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Paradiso LMS/span_Reports_1'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Reports/input_Duplicate Report_txt'), 'sql')

WebUI.sendKeys(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Reports/input_Duplicate Report_txt'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Reports/input_Duplicate Report_txt'), 'sql')

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Reports/a_sql'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_sql/button_Report Settings'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_sql/a_Schedule Report'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Schedule Reports/input_Label_label'), 'Testing katalon sheduled')

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Schedule Reports/button_Next'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Schedule Reports/button_Next_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Schedule Reports/button_Next_1'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Schedule Reports/input_Recipients list_recipients'), 
    'manjusha.k@paradisosolutions.com')

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Schedule Reports/button_Next_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_Schedule Reports/button_Finish'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Page_sql/i_File Uploaded Successfully_men men-plms-a_150658'))

WebUI.closeBrowser()

