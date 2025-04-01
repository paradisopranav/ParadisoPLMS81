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

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/i_Home_fa men men-plms-knowledge-hub'))

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/span_Discover'))

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/i_Company Workspace_fa fa-angle-down role'))

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/button_Create Workspace'))

WebUI.setText(findTestObject('Object Repository/Discover Create workspace/Page_Create Workspace/input_Workspace Name_workspance_name'), 
    'Workspace using katalon')

WebUI.setText(findTestObject('Object Repository/Discover Create workspace/Page_Create Workspace/textarea_Description_description'), 
    'Testing description')

WebUI.setText(findTestObject('Object Repository/Discover Create workspace/Page_Create Workspace/input_Workspace Member_cq'), 
    'katalon katalon')

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Create Workspace/a_katalon katalon'))

WebUI.setText(findTestObject('Object Repository/Discover Create workspace/Page_Create Workspace/input_Workspace Owner_cq'), 
    'katalon owner')

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Create Workspace/a_katalon katalon_1'))

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Create Workspace/button_Create Workspace'))

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/i_Company Workspace_fa fa-angle-down role'))

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/svg'))

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Discover Create workspace/Page_Create Workspace/input_Workspace Name_workspance_name'), 
    'Workspace using katalon..')

/*WebUI.setText(findTestObject('Object Repository/Discover Create workspace/Page_Create Workspace/textarea_Testing description'), 
    'Testing description udate')*/
WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Create Workspace/button_Save Workspace'))

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/i_Company Workspace_fa fa-angle-down role'))

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/svg_1'))

//WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/path_Workspace using katalon_circle-ellipsis_1_'))
//WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/svg'))
WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/a_Delete'))

WebUI.click(findTestObject('Object Repository/Discover Create workspace/Page_Paradiso LMS/button_OK'))

WebUI.closeBrowser()

