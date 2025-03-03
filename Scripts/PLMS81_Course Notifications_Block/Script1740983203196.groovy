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

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Paradiso LMS/h6_Courses'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Paradiso LMS/span_Catalog'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_PLMS Course Categories/div_Communication_hoverimg'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/span_Level up_toggle'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/svg_Grades overview_Component_188_3'))

WebUI.click(findTestObject('PLMS81_Course_Notification_Block/Page_Course Communication/i_Move Course Notification block_icon fa me_af7be5'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/span_Delete Course Notification Block'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Notification Delete Course Noti_a85085/button_Yes'))


WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/a_Add tab'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/input_Add Content_search'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/input_Add Content_search'), 
    'course noti')

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/span_Course Notification'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/button_Add Content'))

//WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/path_Grades overview_Path_51141'))
WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/svg_Grades overview_Component_188_3'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/a_Course Notification'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/button_Edit templates'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Course Completion Notification to Student'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/input__enabled_notify_on_course_completion_student'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Course Completion Notification to Teacher'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/input_link_enabled_notify_on_course_complet_9d69c4'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Course Enroll Notification to Student'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/input_link_enabled_notify_on_course_enroll_student'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Notify when Course is incomplete'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/input_link_enabled_notify_on_course_incomplete'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Notify when Course is overdue'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/input_course_link_enabled_notify_on_course_overdue'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Course Expiration Notification to Student'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/input_course_link_enabled_notify_student_be_9a924e'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/input_link_submitbutton'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Course Completion Notification to Student_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Course Completion Notification to Teacher_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Course Enroll Notification to Student_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Notify when Course is incomplete_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Notify when Course is overdue_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Quiz reminder'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/a_Course Expiration Notification to Student_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_System Notifications/button_Back to course'))

WebUI.click(findTestObject('Object Repository/PLMS81_Course_Notification_Block/Page_Course Communication/svg_Grades overview_Component_188_3'))

