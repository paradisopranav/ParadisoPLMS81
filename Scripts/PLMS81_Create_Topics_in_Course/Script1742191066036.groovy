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

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Katalon_Activity Test creation course Scrom/a_Add Topics'))

WebUI.setText(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Katalon_Activity Test creation course Scrom/input_Number of Topics_add_section_numsections'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Katalon_Activity Test creation course Scrom/input_Topic_appendsection_1'), 
    'Katalon')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Katalon_Activity Test creation course Scrom/input_Topic_appendsection_1_2_3'), 
    'Delete')

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Katalon_Activity Test creation course Scrom/button_Add Topics'))

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/svg_Delete_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/span_Delete Topic'))

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/svg_Katalon_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/span_Edit Topic'))

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Edit Katalon/input_Custom_namecustomize'))

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Edit Katalon/input_Custom_namecustomize'))

WebUI.setText(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Edit Katalon/input_New value for Section Name_namevalue'), 
    'Katalon Topic')

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Edit Katalon/input_Add restriction_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/a_Katalon Topic'), 
    'Katalon Topic')

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/svg_Katalon Topic_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/span_Highlight'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/svg_Katalon Topic_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/span_Hide Topic'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/svg_Katalon Topic_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/span_Show Topic'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/svg_Katalon Topic_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/span_Remove highlight'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/svg_Katalon Topic_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Coure_Topic_in_Course/Page_Course Katalon_Activity Test creation course/span_Delete Topic_1'))

