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
    'video')

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Course Katalon_Activity Test creation course/span_Video'))

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Course Katalon_Activity Test creation course/button_Add Content'))

WebUI.setText(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/input_Name_name'), 'Video Katalon')

WebUI.setText(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/p_Video katalon'), 'Video Katalon')

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/button_Upload Video'))

WebUI.uploadFile(findTestObject('Video Activity in course/Video Upload objects/Page_Editing Video/Video upload'), VideoFile)

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/button_Upload'))

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/a_Activity Completion'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/select_Do not indicate activity completion _1406bf'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/input_Course completion_mustbecompleted'))

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/input_Enable Video Progress Completion_vide_c84524'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/select_0            10            20       _4d2a56'), 
    '80', true)

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Katalon_Activity Test creation course _80216e/circle_Delete Topic_Ellipse_455'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Katalon_Activity Test creation course _80216e/a_Edit Settings'))

WebUI.setText(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/input_Name_name'), 'Video Katalon Update')

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Editing Video/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Katalon_Activity Test creation course _f93ec1/div_Restore_vjs-poster'))

WebUI.delay(40)

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Katalon_Activity Test creation course _f93ec1/circle_Delete Topic_Ellipse_455'))

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Katalon_Activity Test creation course _f93ec1/span_Delete'))

WebUI.click(findTestObject('Object Repository/Video Activity in course/Page_Delete Video/button_Yes'))

