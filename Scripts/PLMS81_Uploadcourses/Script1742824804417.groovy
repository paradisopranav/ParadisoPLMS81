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

WebUI.setText(findTestObject('Object Repository/Uploadcourses/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Uploadcourses/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_Dashboard/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_Dashboard/div_Settings'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Administration Search/a_Courses'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Administration Search/a_Upload courses'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Administration Courses Upload courses/input_File_coursefilechoose'))

WebUI.uploadFile(findTestObject('Object Repository/Uploadcourses/fileselection_uploadcourse/Page_PLMS Administration Courses Upload courses/input_Attachment_repo_upload_file'), 
    courseuploadfile)

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Administration Courses Upload courses/button_Upload'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Administration Courses Upload courses/input_Allow resets_submitbutton'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Administration Courses Upload courses/input_Allow resets_submitbutton'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Administration Courses Upload courses/button_Continue'))

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/course/')

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/input_Course templates_form-control course_search'))

WebUI.setText(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/input_Course templates_yui_3_17_2_1_1742825_dc3ccf'), 
    'course 50')

WebUI.sendKeys(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/input_Course templates_yui_3_17_2_1_1742825_dc3ccf'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/input_Course templates_yui_3_17_2_1_1742825_dc3ccf'),
	'')

WebUI.sendKeys(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/input_Course templates_yui_3_17_2_1_1742825_dc3ccf'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Course Categories/i_Course catalog_men men-plms-module'))

WebUI.setText(findTestObject('Object Repository/Uploadcourses/Page_Course and Category Management/input_Course and Category Management_search'), 
    'course 50')

WebUI.sendKeys(findTestObject('Object Repository/Uploadcourses/Page_Course and Category Management/input_Course and Category Management_search'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_Course and Category Management/i_QA_yui_3_17_2_1_1742882271861_642'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Delete Course 502/button_Delete'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Deleting Course 502/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Uploadcourses/Page_Course and Category Management/input_Course and Category Management_search'), 
    'course 50')

WebUI.sendKeys(findTestObject('Object Repository/Uploadcourses/Page_Course and Category Management/input_Course and Category Management_search'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_Course and Category Management/i_QA_yui_3_17_2_1_1742882362957_545'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Delete Course 503/button_Delete'))

WebUI.click(findTestObject('Object Repository/Uploadcourses/Page_PLMS Deleting Course 503/button_Continue'))

WebUI.delay(2)

WebUI.closeBrowser()