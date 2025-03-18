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
    'Quiz')

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Course Katalon_Activity Test creation course/span_Quiz'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Course Katalon_Activity Test creation course/button_Add Content'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Name_name'), 'Katalon Quiz')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/a_Timing'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Enable_timelimitenabled'))

WebUI.setText(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Time_timelimitnumber'), 
    '10')

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/a_Grade'))

WebUI.setText(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Grade to pass_gradepass'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/select_Unlimited            1            2 _13fc15'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/a_Activity Completion'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/select_Do not indicate activity completion _1406bf'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Require View_completionview'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Course completion_mustbecompleted'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Require Grade_completionusegrade'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Require passing grade_completionpass'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Katalon_Activity Test creation course _fd582e/svg_Delete Topic_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Katalon_Activity Test creation course _fd582e/span_Edit Settings'))

WebUI.setText(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Name_name'), 'Katalon Quiz update')

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/a_Timing_1'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Enable_timelimitenabled'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Katalon_Activity Test creation course _629ec6/circle_Delete Topic_Ellipse_454'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Katalon_Activity Test creation course _629ec6/a_Delete'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Delete Quiz/button_Yes'))

