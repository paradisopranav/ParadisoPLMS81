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

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/a_Invite'))

WebUI.setText(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/input_Invite -                         Kata_7230cc'), 
    'katalon cohort')

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/a_katalon cohort'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/input_Users_btn btn-primary btn-md center-b_e789b1'))

WebUI.verifyElementText(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/p_Invite link Katalon_Activity Test creatio_0a2cd3'), 
    'Invite link Katalon_Activity Test creation course have been shared successfully.')

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/button_Ok'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/svg_Invite_pr-2'))

WebUI.setText(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/input_Invite -                         Kata_7230cc'), 
    'plms880')

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/a_plms 880'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/input_plms 880_yui_3_17_2_1_1742204429966_120'))

WebUI.verifyElementText(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/p_Invite link Katalon_Activity Test creatio_0a2cd3_1'), 
    'Invite link Katalon_Activity Test creation course have been shared successfully.')

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/button_Ok_1'))

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/a_Invite_1'))

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/input_The user does not exist, Enter email _5a12e9'))

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/input_The user does not exist, Enter email _5a12e9'))

WebUI.click(findTestObject('Object Repository/CourseInvite_in_Course/Page_Course Katalon_Activity Test creation course/button_Cancel'))

WebUI.closeBrowser()

