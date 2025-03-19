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
    'Assignment')

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Course Katalon_Activity Test creation course/span_Assignment'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Course Katalon_Activity Test creation course/button_Add Content'))

WebUI.setText(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/input_Assignment name_name'), 
    'Katalon Assignment Activity')

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/input_Enable_allowsubmissionsfromdateenabled'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/input_Enable_duedateenabled'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/input_Enable_gradingduedateenabled'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/a_Grade'))

WebUI.setText(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/input_Grade to pass_gradepass'), 
    '60')

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/a_Activity Completion'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/select_Do not indicate activity completion _1406bf'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/input_Require View_completionview'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/input_Course completion_mustbecompleted'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/input_Require Grade_completionusegrade'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _7c3868/svg_Delete Topic_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _7c3868/span_Edit Settings'))

WebUI.setText(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/input_Assignment name_name'), 
    'Katalon Assignment Activity update')

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Editing Assignment/input_Upon Activity Completion_submitbutton'))


//WebUI.navigateToUrl("https://plms-php81.paradisolms.net/mod/assign/view.php?id=9733")
	
WebUI.verifyElementText(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _a193f7/p_Katalon Assignment Activity update'), 
    'Katalon Assignment Activity update')

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _a193f7/a_View all submissions'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _8b29a6/a_Grade'))

WebUI.setText(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _8b29a6/input_Grade out of 100_grade'), 
    '65')

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _8b29a6/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _8b29a6/button_OK'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _8b29a6/a_View all submissions'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _8b29a6/p_Katalon Assignment Activity update'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _a193f7/a_Grade'))

WebUI.setText(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _8b29a6/input_Grade out of 100_grade'), 
    '')

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _8b29a6/button_Save and show next'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _8b29a6/button_OK_1'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _8b29a6/a_View all submissions_1'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _8b29a6/p_Katalon Assignment Activity update_1'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _a193f7/circle_Delete Topic_Ellipse_455'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Katalon_Activity Test creation course _a193f7/a_Delete'))

WebUI.click(findTestObject('Object Repository/Assignment_Activity_in_Course/Page_Delete Assignment/button_Yes'))

WebUI.closeBrowser()

