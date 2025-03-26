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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Paradiso LMS Log in to the site/button_Log in'))

// Generate a random name with 8 characters
String randomName = RandomStringUtils.randomAlphabetic(8).toLowerCase()

WebUI.click(findTestObject('Object Repository/Page_Course and Category Management/span_Courses'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Add New Category/i_SOCIAL WALL_fa men men-plms-courses'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_PLMS Add New Category/Page_PLMS Course Categories/a_Catalog'))

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Page_Course and Category Management/span_Catalog'))
WebUI.click(findTestObject('Object Repository/Page_PLMS Course Categories/Page_PLMS Course Categories/button_Add New'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_PLMS Course Categories/a_Course'), 10)

WebUI.click(findTestObject('Object Repository/Page_PLMS Course Categories/a_Course'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Add a New Course/button_Create'))

WebUI.setText(findTestObject('Object Repository/Page_PLMS Add a New Course/input_Course Name_fullname'), 'Delete course checking from katalon')

WebUI.click(findTestObject('Object Repository/Page_PLMS Add a New Course/li_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_PLMS Add a New Course/input_Previous_saveanddisplay'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course aaaaa/svg'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_PLMS Course Categories/input_dqksywlv_form-control course_search'))

WebUI.setText(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/input_Course templates_yui_3_17_2_1_1742825_dc3ccf'), 
    'Delete course checking from katalon')

WebUI.sendKeys(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/input_Course templates_yui_3_17_2_1_1742825_dc3ccf'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/input_Course templates_yui_3_17_2_1_1742825_dc3ccf'), 
    '')

WebUI.sendKeys(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/input_Course templates_yui_3_17_2_1_1742825_dc3ccf'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Course_restorefrom_recyclebin/managecourses_btn'))

WebUI.setText(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/input_Course and Category Management_search'), 
    'Delete course checking from katalon')

WebUI.sendKeys(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/input_Course and Category Management_search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/i_QA_yui_3_17_2_1_1742882271861_642'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Delete Course 502/button_Delete'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_PLMS Deleting Course 502/button_Continue'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/a_Paradiso Solutions'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/i_(252)_icon fa men men-plms-setting-dot-ic_dbb21c'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/span_Recycle bin'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Recycle bin/i_Tuesday, 25 March 2025, 653 PM_icon fa fa_83e734'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Recycle bin/a_Back to Category Paradiso Solutions'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_PLMS Paradiso Solutions/i_Course catalog_men men-plms-module'))

WebUI.setText(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/input_Course and Category Management_search'), 
    'Delete course checking from katalon')

WebUI.sendKeys(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/input_Course and Category Management_search'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Recycle bin/a_Back to Category Paradiso Solutions'))
WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/i_QA_yui_3_17_2_1_1742882271861_642'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Delete Course 502/button_Delete'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_PLMS Deleting Course 502/button_Continue'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/a_Paradiso Solutions'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/i_(252)_icon fa men men-plms-setting-dot-ic_dbb21c'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Course and Category Management/span_Recycle bin'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Recycle bin/i_Tuesday, 25 March 2025, 705 PM_icon fa fa_c52359'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Recycle bin/input_Are you sure you want to delete the s_da9b52'))

WebUI.click(findTestObject('Object Repository/Course_restorefrom_recyclebin/Page_Recycle bin/a_Back to Category Paradiso Solutions'))

WebUI.closeBrowser()

