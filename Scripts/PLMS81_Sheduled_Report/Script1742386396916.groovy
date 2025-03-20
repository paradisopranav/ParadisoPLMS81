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

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/login/index.php')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Paradiso LMS/i_Course Library_fa men men-plms-reports'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Paradiso LMS/span_Reports'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Reports/a_New Report'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Report/input_Name_name'), 'Sheduled report script using katalon')

WebUI.selectOptionByValue(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Report/select_Courses            Learning Path    _b68ab0'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Report/input_Show logged in user data_submitbutton'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon Columns/p_User Name'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon Columns/p_First Name'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon Columns/button_Add'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon Columns/button_Next'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/a_Finish'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/button_Report Settings'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/a_Schedule Report'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Schedule Reports/input_Label_label'), 'Testing of Sheduled report script using katalon')

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Schedule Reports/textarea_Description_description'), 
    'testing')

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Schedule Reports/button_Next'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Schedule Reports/button_Next_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Schedule Reports/button_Next_1'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Schedule Reports/input_Recipients list_recipients'), 
    'manjusha.k@paradisosolutions.com')

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Schedule Reports/textarea_Message_message'), 
    'testing sheduled report using katalon')

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Schedule Reports/button_Next_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Schedule Reports/button_Finish'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/button_Report Settings'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/a_List of Schedules'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/button_'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/div_Settings'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_PLMS Administration Search/a_Server'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_PLMS Administration Search/a_Scheduled tasks'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_PLMS Administration Server Tasks Sched_97df90/th_Ad-hoc database queries run scheduled re_8e869d'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_PLMS Administration Server Tasks Sched_97df90/a_Run now'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_/button_Run now'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_/i_Course Library_fa men men-plms-reports'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_/i_Course Library_fa men men-plms-reports'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_/span_Reports'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Reports/input_Duplicate Report_txt'), 'Sheduled report script using katalon')

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Reports/div_Duplicate Report_yui_3_17_2_1_1742387005136_18'))

//WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Reports/input_Duplicate Report_txt'), 'Sheduled report ')

//WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Reports/a_Sheduled report script using katalon')) 

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/a_List of Schedules_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/i_Thursday,Mar-20-2025 000_fa fa-trash'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/button_OK'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/button_'))

//WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/a'))
//WebUI.navigateToUrl('https://plms-php81.paradisolms.net/blocks/configurable_reports/viewreport.php?id=934')

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/button_Report Settings'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/a_Delete Report'))

WebUI.click(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Sheduled report script using katalon/button_Yes'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Sheduled report/Page_Reports/input_Duplicate Report_txt_1'), 'Sheduled report script using katalon')

WebUI.closeBrowser()