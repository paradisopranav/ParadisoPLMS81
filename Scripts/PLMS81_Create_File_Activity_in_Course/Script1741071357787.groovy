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
WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Username_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Password_password'),
	GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Paradiso LMS/span_Courses'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Paradiso LMS/span_Catalog'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_PLMS Course Categories/input_dqksywlv_form-control course_search'))

WebUI.setText(findTestObject('File Activity in course/Page_PLMS Course Categories/input_dqksywlv_form-control course_search'), 
    'katalon_activity Test creation')

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_PLMS Course Categories/div_Katalon_Activity Test creation course'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/span_Course Notification_toggle'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/span_Add Activity'))

WebUI.setText(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/input_Add Content_search'), 
    'file')

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/span_File'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/button_Add Content'))

WebUI.setText(findTestObject('Object Repository/File Activity in course/Page_Editing File/input_Name_name'), 'Katalon File Upload Test')

WebUI.click(findTestObject('File Activity in course/upload file objects/Page_Editing File/Select file first'))

WebUI.uploadFile(findTestObject('File Activity in course/upload file objects/Page_Editing File/choose file button'), FileUpload)

WebUI.click(findTestObject('File Activity in course/upload file objects/Page_Editing File/button_Upload'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Editing File/a_Appearance'))

WebUI.selectOptionByValue(findTestObject('Object Repository/File Activity in course/Page_Editing File/select_Automatic            Embed          _4e382d'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Editing File/a_Activity Completion'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Editing File/div_Completion tracking'))

WebUI.selectOptionByValue(findTestObject('Object Repository/File Activity in course/Page_Editing File/select_Do not indicate activity completion _1406bf'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Editing File/input_Course completion_mustbecompleted'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Editing File/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Katalon_Activity Test creation course _25ec65/circle_Delete Topic_Ellipse_454'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Katalon_Activity Test creation course _25ec65/span_Edit Settings'))

WebUI.setText(findTestObject('Object Repository/File Activity in course/Page_Editing File/input_Name_name'), 'Katalon File Upload Test update')

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Editing File/input_Upon Activity Completion_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/File Activity in course/Page_Katalon_Activity Test creation course _4109f1/p_Katalon File Upload Test update'), 
    'Katalon File Upload Test update')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Katalon_Activity Test creation course _4109f1/circle_Delete Topic_Ellipse_454'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/a_Delete'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Delete File/button_Yes'))

