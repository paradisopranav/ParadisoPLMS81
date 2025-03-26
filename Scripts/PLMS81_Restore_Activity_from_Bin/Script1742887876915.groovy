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

WebUI.setText(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Paradiso LMS/span_Courses'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Paradiso LMS/span_Catalog'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_PLMS Course Categories/input_dqksywlv_form-control course_search'))

WebUI.setText(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/input_Course templates_yui_3_17_2_1_1742825_dc3ccf'),
	'Katalon course_Restore activity')

WebUI.sendKeys(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/input_Course templates_yui_3_17_2_1_1742825_dc3ccf'),
	Keys.chord(Keys.ENTER))

/* WebUI.setText(findTestObject('Object Repository/File Activity in course/Page_PLMS Course Categories/input_dqksywlv_form-control course_search'), 
<<<<<<< HEAD
   'katalon badge')
=======
   'Katalon badge course_403c')
>>>>>>> branch 'master' of https://github.com/paradisopranav/ParadisoPLMS81.git */

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_PLMS Course Categories/div_Katalon_Activity Test creation course'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/span_Course Notification_toggle'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/span_Add Activity'))

WebUI.setText(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/input_Add Content_search'), 
    'page')

WebUI.click(findTestObject('Object Repository/Page Activity In course/Page_Course Katalon_Activity Test creation course/span_Page'))

WebUI.click(findTestObject('Object Repository/Page Activity In course/Page_Course Katalon_Activity Test creation course/button_Add Content'))

WebUI.setText(findTestObject('Object Repository/Page Activity In course/Page_Editing Page/input_Name_name'), 'Katalon Page activity')

WebUI.setText(findTestObject('Object Repository/Page Activity In course/Page_Editing Page/p_Katalon'), 'Katalon Page text message')

WebUI.click(findTestObject('Object Repository/Page Activity In course/Page_Editing Page/a_Activity Completion'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page Activity In course/Page_Editing Page/select_Do not indicate activity completion _1406bf'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page Activity In course/Page_Editing Page/input_Course completion_mustbecompleted'))

WebUI.click(findTestObject('Object Repository/Page Activity In course/Page_Editing Page/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page Activity In course/Page_Katalon_Activity Test creation course _3abafb/circle_Delete Topic_Ellipse_454'))

WebUI.click(findTestObject('Object Repository/Page Activity In course/Page_Katalon_Activity Test creation course _3abafb/span_Delete'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Delete Page/button_Yes'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Course Katalon badge course_403/i_Preview_men men-menu-dots'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Course Katalon badge course_403/a_Recycle bin'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Recycle bin/i_Tuesday, 25 March 2025, 130 PM_icon fa fa_24d617'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Recycle bin/a_Back to Course Katalon badge course_403'))

WebUI.click(findTestObject('Object Repository/Page Activity In course/Page_Katalon_Activity Test creation course _3abafb/circle_Delete Topic_Ellipse_454'))

WebUI.click(findTestObject('Object Repository/Page Activity In course/Page_Katalon_Activity Test creation course _3abafb/span_Delete'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Delete Page/button_Yes'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Course Katalon badge course_403/i_Preview_men men-menu-dots'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Course Katalon badge course_403/a_Recycle bin'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Recycle bin/i_Tuesday, 25 March 2025, 250 PM_icon fa fa_82c3b6'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Recycle bin/input_Are you sure you want to delete the s_638962'))

WebUI.click(findTestObject('Object Repository/Activity_restorefrom_recyclebin/Page_Recycle bin/a_Back to Course Katalon badge course_403'))

WebUI.closeBrowser()

