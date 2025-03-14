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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

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

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Course Katalon_Activity Test creation course/span_Interactive Content'))

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Course Katalon_Activity Test creation course/button_Add Content'))

WebUI.setText(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/p_Interactive'), 
    'Katalon Interactive Activity')

WebUI.switchToFrame(findTestObject('Interactive activity in course/Page_Katalon Title/iframe_object'), 2)

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/button_Details'))

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/button_Use'))

WebUI.delay(30)

WebUI.setText(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/input_Used for searching, reports and copyr_af320a'), 
    'Katalon Interactive video Title')

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/div_Add a video_field-files-13'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/div_Upload video file_h5p-file-drop-upload-_957f09'), 
    'https://www.youtube.com/watch?v=d95PPykB2vE')

WebUI.click(findTestObject('Interactive activity in course/Page_Katalon Title/Insert video'))

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/span_Add interactions'))

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/div_Paste_h5p-touch-area'))

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/input_Button_displayType'))

WebUI.setText(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/input_Used for searching, reports and copyr_b78a23'), 
    'True false')

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/div_Question'))

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Interactive activity in course/Page_Katalon Title/Question text box frame'), 2)

WebUI.setText(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/html_Rich Text Editor, field-question-189htmlcursortextcursorautoimg,input,textareacursordefault.cke_editablecursortext.cke_editable img,.cke_editable input,.cke_editable textareacursordefault.cke_contents_ltr a.cke_anch'), 
    'Raining?')

WebDriver driver = DriverFactory.getWebDriver()

// Execute JavaScript to focus on the parent window
//((JavascriptExecutor) driver).executeScript("window.parent.focus();")
    	
	((JavascriptExecutor) driver).executeScript("window.parent.focus();")

// Switch to the parent frame
driver.switchTo().parentFrame()

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/span_Done'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/a_Grade'))

WebUI.setText(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/input_Grade to pass_gradepass'), 
    '1')

WebUI.click(findTestObject('Interactive activity in course/Page_Course Katalon_Activity Test creation course/Activity completion'))

WebUI.selectOptionByValue(findTestObject('Interactive activity in course/Page_Course Katalon_Activity Test creation course/Select option'), 
    '2', true)

WebUI.click(findTestObject('Interactive activity in course/Page_Course Katalon_Activity Test creation course/Uncheck first condition'))

WebUI.click(findTestObject('Interactive activity in course/Page_Course Katalon_Activity Test creation course/Select 1st condition'))

WebUI.click(findTestObject('Interactive activity in course/Page_Course Katalon_Activity Test creation course/Received grade'))

WebUI.click(findTestObject('Interactive activity in course/Page_Course Katalon_Activity Test creation course/Passing grade'))

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/input_Upon Activity Completion_submitbutton'))

WebUI.delay(5)


WebUI.click(findTestObject('Interactive activity in course/Page_Delete Interactive Content/Click dots'))

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Katalon Title/span_Edit Settings'))

WebUI.setText(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/input_Used for searching, reports and copyright information_field-extratitle--1'), 
    'Katalon Title update')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Editing Interactive Content/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Katalon Title update/svg_Interactive Content_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Katalon Title update/a_Delete'))

WebUI.click(findTestObject('Object Repository/Interactive activity in course/Page_Delete Interactive Content/button_Yes'))

