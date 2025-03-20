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
    'forum')

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Course Katalon_Activity Test creation course/span_Forum'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Course Katalon_Activity Test creation course/button_Add Content'))

WebUI.setText(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Editing Forum/input_Forum name_name'), 'Katalon forum activity')

WebUI.setText(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Editing Forum/div_Description'), '')

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Editing Forum/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/a_Add a new discussion topic'))

WebUI.setText(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/input_Subject_subject'), 
    'Katalon forum')

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/p'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/input_Message_submitbutton'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/label_Subscribe to this discussion'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/label_Unsubscribe from this discussion_1'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/a_Subscribe to this discussion_yui_3_17_2_1_e237aa'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/span_Star this discussion'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/a_Subscribe to this discussion_yui_3_17_2_1_65b580'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/span_Unstar this discussion'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/i_Subscribe to this discussion_icon fa fa-e_f628f6'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/span_Pin this discussion'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/a_Subscribe to this discussion_yui_3_17_2_1_463580'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/span_Unpin this discussion'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/i_Subscribe to this discussion_icon fa fa-e_f628f6_1'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/span_Lock this discussion'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/a_Subscribe to this discussion_yui_3_17_2_1_9ddce0'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/span_Unlock this discussion'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/a_Katalon forum'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _e09118/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _67508d/input_Subject_subject'), 
    'Katalon forum update')

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _67508d/p_katalon forum'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _67508d/input_Yardley classic_submitbutton'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _3632c3/a_Reply'))

WebUI.setText(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _3632c3/textarea_Reply_post'), 
    'Katalon reply')

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _3632c3/span_Submit'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _3632c3/a_Show parent'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _3632c3/a_Permalink'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _3632c3/a_Edit'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _74a2d8/div_Katalon reply'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _74a2d8/input_Yardley classic_submitbutton'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _3632c3/a_Delete'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course/button_Continue'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course _3632c3/a_Delete_1'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon_Activity Test creation course/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/circle_Delete Topic_Ellipse_454'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity/span_Edit Settings'))

WebUI.setText(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Editing Forum/input_Forum name_name'), 'Katalon forum activity update')

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Editing Forum/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity update/svg_Delete Topic_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Katalon forum activity update/span_Delete'))

WebUI.click(findTestObject('Object Repository/Forum_Activity_in_Course/Page_Delete Forum/button_Yes'))

