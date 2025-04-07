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

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS Log in to the site/button_Log in'))

// Generate a random name with 8 characters
String randomName = RandomStringUtils.randomAlphabetic(8).toLowerCase()

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/i_Home_fa men men-plms-knowledge-hub'))

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/span_Discover'))

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/i_Katalon Workspace_fa fa-angle-down role'))

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/span_Katalon Workspace'))

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/button_Add Content'))

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/a_Page'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Add HTML Page/input_Page Title_title'), 
    randomName)

WebUI.setText(findTestObject('Object Repository/Discover_Page Content/Page_Add HTML Page/p_Page Content_yui_3_17_2_1_1743676975449_799'), 
    'Testing content of page')

WebUI.click(findTestObject('Object Repository/Discover_Page Content/Page_Add HTML Page/p_Page Content_yui_3_17_2_1_1743676975449_799'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Add HTML Page/select_Only For This Workspaceprivate      _221d7d'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Add HTML Page/input_Workspaces_submitbutton'))

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/input_Create Workspace_q'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/input_Create Workspace_q'), 
    randomName)

WebUI.sendKeys(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/input_Create Workspace_q'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/div_Page content of katalon workspace_1'))

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Page content of katalon workspace/i_File Uploaded Successfully_fa fa-chevron-_c840c8'))

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/p_Page content of katalon workspace'))

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Page content of katalon workspace/i_Page content of katalon workspace_fa fa-e_c5cd1a'))

WebUI.click(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Page content of katalon workspace/a_Delete'))

WebUI.setText(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/input_Create Workspace_q'), 
    randomName)

WebUI.sendKeys(findTestObject('Object Repository/PLMS81_Discover Page Content creation/Page_Paradiso LMS/input_Create Workspace_q'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.closeBrowser()

