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

WebUI.setText(findTestObject('Object Repository/Report Repository 6 march/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Report Repository 6 march/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    'ed/1/AZbo1YX04df+rN1oA==')

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_Paradiso LMS/i_Course Library_fa men men-plms-reports'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_Paradiso LMS/span_Reports_1'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_Reports/a_New Report'))

WebUI.setText(findTestObject('Object Repository/Report Repository 6 march/Page_Report/input_Name_name'), '6th march delete katalon report')

WebUI.selectOptionByValue(findTestObject('Object Repository/Report Repository 6 march/Page_Report/select_Courses            Learning Path    _b68ab0'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_Report/input_Show logged in user data_submitbutton'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report Columns/p_User Name'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report Columns/p_First Name'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report Columns/p_Last Name'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report Columns/button_Add'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report Columns/button_Next'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report/a_Finish'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report/button_Add'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report/a_Add Columns'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report Columns/p_Email'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report Columns/button_Add'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report Columns/button_Save'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report/i_File Uploaded Successfully_men men-plms-a_150658'))

WebUI.setText(findTestObject('Object Repository/Report Repository 6 march/Page_Reports/input_Duplicate Report_txt'), '6th march delete katalon report')

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_Reports/span_Courses_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_Reports/i_Edit_men men-plms-delete pr-2'))

WebUI.click(findTestObject('Object Repository/Report Repository 6 march/Page_6th march delete katalon report/button_Yes'))

WebUI.closeBrowser()

