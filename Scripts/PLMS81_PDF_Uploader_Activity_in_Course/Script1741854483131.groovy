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
    'PDF')

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Course Katalon_Activity Test creation course/span_PDF Uploader'))

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Course Katalon_Activity Test creation course/button_Add Content'))

WebUI.setText(findTestObject('Object Repository/PDF uploader in course/Page_Editing PDF Uploader/input_Name_name'), 'Katalon PDF uploader activity')

WebUI.click(findTestObject('PDF uploader in course/Page_Katalon_Activity Test creation course _999000/Unselect new tab'))

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Editing PDF Uploader/i_- drag and drop not supported_icon fa fa-_b0369b'))

WebUI.uploadFile(findTestObject('PDF uploader in course/Page_Katalon_Activity Test creation course _999000/Choose'), PDF1)

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Editing PDF Uploader/button_Upload'))

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Editing PDF Uploader/a_Activity Completion'))

WebUI.selectOptionByValue(findTestObject('PDF uploader in course/Page_Editing PDF Uploader/activity dropdown open'), '2', 
    true)

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Editing PDF Uploader/input_Require View_completionview'))

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Editing PDF Uploader/input_Course completion_mustbecompleted'))

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Editing PDF Uploader/input_PDF Read_pdfallread'))

int mainWindowIndex = WebUI.getWindowIndex()

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Editing PDF Uploader/input_Upon Activity Completion_submitbutton'))

WebUI.delay(3)

WebUI.switchToWindowIndex(mainWindowIndex + 1)

// Step 5: Close the new tab
WebUI.closeWindowIndex(WebUI.getWindowIndex())

// Step 6: Switch back to the main window
WebUI.switchToWindowIndex(mainWindowIndex)

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Katalon_Activity Test creation course _999000/circle_Delete Topic_Ellipse_455'))

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Katalon_Activity Test creation course _999000/a_Edit Settings'))

WebUI.setText(findTestObject('Object Repository/PDF uploader in course/Page_Editing PDF Uploader/input_Name_name'), 'Katalon PDF uploader activity update')

int mainWindowIndex1 = WebUI.getWindowIndex()

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Editing PDF Uploader/input_Upon Activity Completion_submitbutton'))

WebUI.delay(3)

WebUI.switchToWindowIndex(mainWindowIndex1 + 1)

// Step 5: Close the new tab
WebUI.closeWindowIndex(WebUI.getWindowIndex())

// Step 6: Switch back to the main window
WebUI.switchToWindowIndex(mainWindowIndex1)

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Katalon_Activity Test creation course _1cb2b1/svg_Delete Topic_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Katalon_Activity Test creation course _1cb2b1/span_Delete'))

WebUI.click(findTestObject('Object Repository/PDF uploader in course/Page_Delete PDF Uploader/button_Yes'))

