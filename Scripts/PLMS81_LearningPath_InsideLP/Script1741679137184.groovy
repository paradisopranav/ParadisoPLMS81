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

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Dashboard/i_Add a Course_fa men men-plms-learning-path'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    'katalon lp testing')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_katalon lp testing 1'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Courses'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/span_Add Courses'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/input_Search_potentialcourses_searchtext'), 
    'katalon')

WebUI.selectOptionByValue(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/select_katalon testing- lp coursekatalon ol_190238'), 
    '253,katalon testing- lp course', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/select_katalon testing- lp coursekatalon ol_190238'), 
    '299,katalon old course', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/select_katalon testing- lp coursekatalon ol_190238'), 
    '1160,Katalon badge course_403', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/select_katalon testing- lp coursekatalon ol_190238'), 
    '1178,Katalon_Learning path Course', true)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/input_If only one record matches the search_8b291f'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/i_File Uploaded Successfully_men men-plms-a_14dec7'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/span_katalon testing- lp course_slider round'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/span_Edit'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/p_katalon old course'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/button_Add'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Remove_submitbutton'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Searchbox_LPCourses tab'), 'badge course')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Searchbox_LPCourses tab'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Searchbox_LPCourses tab'), '')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Searchbox_LPCourses tab'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Overview'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_(Not Set)_btn-lp_publish'))

// Accept the alert (clicks "OK")
WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Users'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/span_Enrol Users'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/input_Search_potentialusers_searchtext'), 
    'hruta')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/input_Search_potentialusers_searchtext'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/select_hruta hruta (manashmail.com)hruta1 h_e50a15'), 
    '24315', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/select_hruta hruta (manashmail.com)hruta1 h_e50a15'), 
    '4898', true)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/input_If only one record matches the search_8b291f'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/i_File Uploaded Successfully_men men-plms-a_14dec7'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/Searchbox_LPUsers tab'), 
    'hruta1')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/Searchbox_LPUsers tab'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/Searchbox_LPUsers tab'), 
    '')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/Searchbox_LPUsers tab'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Cohorts'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/span_Add Cohorts'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/input_Search_potentialcohorts_searchtext'), 
    'katalon cohort')

WebUI.selectOptionByValue(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/select_QAqa cohort_2106qa cohort_2806qa my _0d47a3'), 
    '180,katalon cohort', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/select_katalon cohortkatalon cohort 2'), 
    '181,katalon cohort 2', true)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/input_If only one record matches the search_8b291f'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_katalon lp testing 10/i_File Uploaded Successfully_men men-plms-a_14dec7'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Searchbox_LPCohort tab'), 'cohort 2')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Searchbox_LPCohort tab'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Searchbox_LPCohort tab'), '')

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Insidethetabs/Searchbox_LPCohort tab'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_2'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_/i_File Uploaded Successfully_men men-plms-a_14dec7'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Notifications'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Email Template_enrollment_editor_checkbox1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Email Template_expiration_editor_checkbox1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Days After Enrollment_enreminder_edit_da6ddb'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Days After Enrollment_enreminder_editor_text'), 
    '1')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Days Before Expiration_exreminder_edi_05c6ca'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Days Before Expiration_exreminder_edi_e98544'), 
    '1')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Day Frequency_completion_reminder_edi_823da3'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Days Before Expiration_completion_rem_db03ac'), 
    '1')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Email Template_notifications_editor_c_8df1d6'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Enable_submitbutton'))

//WebUI.waitForElementClickable(findTestObject('LearningPath_Insidethetabs/learningpath_insidetabs_notification_publishbutton/Page_Learning Paths/input_Enable_submitbutton'),
//  10)
//WebUI.click(findTestObject('LearningPath_Insidethetabs/learningpath_insidetabs_notification_publishbutton/Page_Learning Paths/input_Enable_submitbutton'))
//WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Enable_submitbutton_1'))
WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Courses'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/i_Edit_men men-close-circle-outline'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/button_OK_1_2_3'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Courses'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/i_Edit_men men-close-circle-outline'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/button_OK_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Courses'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/i_Edit_men men-close-circle-outline'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/button_OK'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Courses'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/i_Edit_men men-close-circle-outline'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/button_OK_1'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Users'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Enrol Users_all_users'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/span_Delete Users'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/button_OK_1_2'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Cohorts'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Add Cohorts_all_cohorts'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/span_Delete'))

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/button_OK_1_2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Notifications'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Email Template_enrollment_editor_checkbox1'))

//WebUI.click(findTestObject('LearningPath_Insidethetabs/LP_Notification_Enrollmentchechbox_disable'))
//WebUI.click(findTestObject('LearningPath_Insidethetabs/Page_Learning Paths/input_Email Template_enrollment_editor_checkbox1'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Email Template_expiration_editor_checkbox1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Days After Enrollment_enreminder_edit_da6ddb'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Days After Enrollment_enreminder_editor_text'), 
    '')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Days Before Expiration_exreminder_edi_05c6ca'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Days Before Expiration_exreminder_edi_e98544'), 
    '')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Day Frequency_completion_reminder_edi_823da3'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Days Before Expiration_completion_rem_db03ac'), 
    '')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Email Template_notifications_editor_c_8df1d6'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/input_Enable_submitbutton_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LearningPath_Insidethetabs/Page_Learning Paths/a_Overview'))

