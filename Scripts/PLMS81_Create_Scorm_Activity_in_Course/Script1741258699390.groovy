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
    'scorm')

WebUI.delay(5)

WebUI.click(findTestObject('SCROM_Activity_in_Course/Page_Course Katalon_Activity Test creation course/span_SCORM package'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Course Katalon_Activity Test creation course/button_Add Content'))

WebUI.setText(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Editing SCORM package/input_Name_name'), 'Katlon scorm activity')

WebUI.click(findTestObject('SCROM_Upload file/Page_Editing SCORM package/Upload Scorm'))

WebUI.uploadFile(findTestObject('SCROM_Upload file/Page_Editing SCORM package/Choose FIle'), Scromfile)

WebUI.click(findTestObject('SCROM_Upload file/Page_Editing SCORM package/button_Upload'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Editing SCORM package/legend_Activity Completion'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Editing SCORM package/select_Do not indicate activity completion _1406bf'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Editing SCORM package/input_Require View_completionview'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Editing SCORM package/input_Course completion_mustbecompleted'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Editing SCORM package/input_Require Grade_completionusegrade'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Editing SCORM package/input_Require status_completionstatusrequired2'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Editing SCORM package/input_Completed_completionstatusallscos'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Editing SCORM package/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Katalon_Activity Test creation course Scrom/input_Normal_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Katalon_Activity Test creation course Scrom/path_Sample SCORM 1 - Complete  Incomplete_uniqueDomId-380'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Katalon_Activity Test creation course Scrom/path_Sample SCORM 1 - Complete  Incomplete__317b20'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Katalon_Activity Test creation course Scrom/path_Sample SCORM 1 - Complete  Incomplete__74b33d'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Katalon_Activity Test creation course Scrom/a_Exit'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Katalon_Activity Test creation course Scrom/button_OK'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Katalon_Activity Test creation course Scrom/a_SCORM package_action-menu-toggle-4'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Katalon_Activity Test creation course Scrom/span_Edit Settings'))

WebUI.setText(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Editing SCORM package/input_Name_name'), 'Scrom update')

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Editing SCORM package/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('SCROM_Activity_in_Course/Page_Delete SCORM package/Report Tab'))

WebUI.click(findTestObject('SCROM_Activity_in_Course/Page_Delete SCORM package/Select all attempt'))

WebUI.click(findTestObject('SCROM_Activity_in_Course/Page_Delete SCORM package/Export scorm attempt'))

WebUI.click(findTestObject('SCROM_Activity_in_Course/Page_Delete SCORM package/ODS format report'))

WebUI.click(findTestObject('SCROM_Activity_in_Course/Page_Delete SCORM package/Export scorm attempt'))

WebUI.click(findTestObject('SCROM_Activity_in_Course/Page_Delete SCORM package/Excel format report'))

WebUI.click(findTestObject('SCROM_Activity_in_Course/Page_Delete SCORM package/Export scorm attempt'))

WebUI.click(findTestObject('SCROM_Activity_in_Course/Page_Delete SCORM package/Text format report'))

WebUI.click(findTestObject('SCROM_Activity_in_Course/Page_Delete SCORM package/Delete All Attempt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.acceptAlert(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Katalon_Activity Test creation course _226f48/svg_SCORM package_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Katalon_Activity Test creation course _226f48/span_Delete'))

WebUI.click(findTestObject('Object Repository/SCROM_Activity_in_Course/Page_Delete SCORM package/button_Yes'))

