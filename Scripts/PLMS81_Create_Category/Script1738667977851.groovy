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

WebUI.setText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Username_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Password_password'),
	GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/button_Log in'))

// Generate a random name with 8 characters
String randomName = RandomStringUtils.randomAlphabetic(8).toLowerCase()

WebUI.click(findTestObject('Page_PLMS Add New Category/i_SOCIAL WALL_fa men men-plms-courses'))

WebUI.click(findTestObject('Page_PLMS Add New Category/Page_PLMS Course Categories/a_Catalog'))

WebUI.click(findTestObject('Page_PLMS Course Categories/Page_PLMS Course Categories/button_Add New'))

WebUI.click(findTestObject('Page_PLMS Course Categories/a_Category'))

WebUI.setText(findTestObject('Object Repository/Page_PLMS Add New Category/input_Category Name_name'), randomName)

WebUI.click(findTestObject('Object Repository/Page_PLMS Add New Category/input_Description_submitbutton'))

WebUI.click(findTestObject('Page_PLMS Add New Category/i_SOCIAL WALL_fa men men-plms-courses'))

WebUI.click(findTestObject('Page_PLMS Add New Category/Page_PLMS Course Categories/a_Catalog'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Course Categories/input_ygsgixns_form-control course_search'))

WebUI.setText(findTestObject('Object Repository/Page_PLMS Course Categories/input_ygsgixns_yui_3_17_2_1_1737526113553_41'), 
    randomName)

WebUI.waitForPageLoad(5)

WebUI.delay(10)

//Course Creation Steps
/*
WebUI.click(findTestObject('Object Repository/Page_Course and Category Management/span_Courses'))
WebUI.click(findTestObject('Page_PLMS Add New Category/i_SOCIAL WALL_fa men men-plms-courses'))

WebUI.click(findTestObject('Page_PLMS Add New Category/Page_PLMS Course Categories/a_Catalog'))

//WebUI.click(findTestObject('Object Repository/Page_Course and Category Management/span_Catalog'))
WebUI.click(findTestObject('Page_PLMS Course Categories/button_Add New'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Course Categories/a_Course'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Add a New Course/button_Create'))

WebUI.setText(findTestObject('Object Repository/Page_PLMS Add a New Course/input_Course Name_fullname'), randomName)

WebUI.click(findTestObject('Object Repository/Page_PLMS Add a New Course/li_Next'))

WebUI.delay(10)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_PLMS Add a New Course/Page_PLMS Add a New Course/button_Upload'))

WebUI.uploadFile(findTestObject('Page_PLMS Add a New Course/Page_PLMS Add a New Course/input_Attachment_repo_upload_file'),
	image)

WebUI.click(findTestObject('Page_PLMS Add a New Course/Page_PLMS Add a New Course/button_Upload'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Page_PLMS Add a New Course/input_Previous_saveanddisplay'))

WebUI.click(findTestObject('Page_PLMS Add a New Course/Page_Course bottelneck 2026 category new cat 0309/a_Skip to main content_yui_3_17_2_1_1738139221172_99'))

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/course/')

WebUI.click(findTestObject('Object Repository/Page_PLMS Course Categories/input_ygsgixns_form-control course_search'))

WebUI.setText(findTestObject('Object Repository/Page_PLMS Course Categories/input_ygsgixns_yui_3_17_2_1_1737526113553_41'),
	randomName)

WebUI.waitForPageLoad(5)
*/
WebUI.closeBrowser()

