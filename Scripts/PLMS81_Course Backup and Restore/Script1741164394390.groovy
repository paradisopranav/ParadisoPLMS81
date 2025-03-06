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
    'regression course')

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_PLMS Course Categories/div_Regression Course'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Course Regression Course/i_Preview_men men-menu-dots'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Course Regression Course/a_Backup'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Backup course Regression Course/input_IMS Common Cartridge 1.1_setting_root_users'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Backup course Regression Course/input_Include content bank content_submitbutton'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Backup course Regression Course/input__setting_section_section_5032_included'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Backup course Regression Course/input_Include content bank content_submitbutton'))

WebUI.setText(findTestObject('Object Repository/Course Backup and Restore/Page_Backup course Regression Course/input_Filename_setting_root_filename'), 
    'KatalonBackup.mbz')

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Backup course Regression Course/input_Include content bank content_submitbutton'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Backup course Regression Course/button_Continue'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Course Regression Course/a_Download'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Course Regression Course/a_Restore'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Regression Course Restore/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Course Backup and Restore/Page_Regression Course Restore/input_There are too many results, enter a m_66b687_1'), 
    'Katalon')

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Regression Course Restore/input_There are too many results, enter a m_4db108'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Regression Course Restore/input_Description_targetid'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Regression Course Restore/input_Katalon Studio_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Regression Course Restore/input_Include content bank content_submitbutton'))

WebUI.click(findTestObject('Course Backup and Restore/Page_Regression Course Restore/input_New value for Course name_setting_cou_60b55d'))

WebUI.setText(findTestObject('Course Backup and Restore/Page_Regression Course Restore/input_New value for Course name_setting_cou_60b55d'), 
    'katalon course')

WebUI.setText(findTestObject('Course Backup and Restore/Page_Regression Course Restore/input_New value for Course short name_setti_04c828'), 
    'katalon course')

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Regression Course Restore/input_Include content bank content_submitbutton'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Regression Course Restore/input_Include content bank content_submitbutton'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Regression Course Restore/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_katalon course Import/i_Preview_men men-menu-dots'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_katalon course Import/a_Restore'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Course katalon course/button_Manage backup files'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Manage backup files/span_KatalonBackup.mbz'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Manage backup files/button_Delete'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Manage backup files/button_OK'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Manage backup files/input_Loading_submitbutton'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_Course katalon course/a_Skip to main content_back_page'))

WebUI.setText(findTestObject('Object Repository/Course Backup and Restore/Page_PLMS Course Categories/input_Katalon Studio_yui_3_17_2_1_1741164799939_41'), 
    'katalon')

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_PLMS Course Categories/div_Katalon Studio'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_PLMS Course Categories/svg'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_PLMS Delete katalon course/button_Delete'))

WebUI.click(findTestObject('Object Repository/Course Backup and Restore/Page_PLMS Deleting katalon course/button_Continue'))

