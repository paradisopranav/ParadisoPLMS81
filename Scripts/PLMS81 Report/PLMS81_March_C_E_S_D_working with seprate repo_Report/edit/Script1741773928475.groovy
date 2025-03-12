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

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    'ed/1/AZbo1YX04df+rN1oA==')

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Paradiso LMS/i_Course Library_fa men men-plms-reports'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Paradiso LMS/span_Reports'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Reports/i_Courses_wid wid-dots'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Reports/span_Edit'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Course and Activity report/input_Name_name'), 
    'Course and Activity report update')

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Course and Activity report/input_Name_name'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Course and Activity report/input_Show logged in user data_submitbutton'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Course and Activity report update Columns/button_Next'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report repo/Edit report/Page_Course and Activity report update/a_Finish'))

WebUI.closeBrowser()

