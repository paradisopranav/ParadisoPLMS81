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

WebUI.setText(findTestObject('Object Repository/LearningPath_Creation/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/LearningPath_Creation/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Paradiso LMS Log in to the site/button_Log in'))

// Generate a random name with 8 characters
String randomName = RandomStringUtils.randomAlphabetic(8).toLowerCase()
String randomNameupdate = RandomStringUtils.randomAlphabetic(8).toLowerCase()

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Dashboard/i_Add a Course_fa men men-plms-learning-path'))

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/span_New Path'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Learning Path Name_name'), 
    randomName)

WebUI.setText(findTestObject('LP Description_field/Page_Learning Paths/p_Description_yui_3_17_2_1_1741608751742_641'), randomName)

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Learning Path Image_learningpath_imagechoose'))

WebUI.uploadFile(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Attachment_repo_upload_file'), 
    qalpimage)

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/button_Upload'))

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Published_submitbutton'))

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/i__men men-plms-arrow-small-left'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    randomName)

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/a_Edit Edit'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Learning Path Name_name'), 
    randomNameupdate)

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Published_submitbutton'))

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/a_Back to Learning Path'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    randomNameupdate)

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/i_Edit_men men-close-circle-outline'))

WebUI.click(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/button_OK'))

WebUI.setText(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    randomNameupdate)

WebUI.sendKeys(findTestObject('Object Repository/LearningPath_Creation/Page_Learning Paths/input_Master topics in small steps. Set a s_14d170'), 
    Keys.chord(Keys.ENTER))

