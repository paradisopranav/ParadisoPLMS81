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

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/login/index.php')

WebUI.setText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    'ed/1/AZbo1YX04df+rN1oA==')

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_Add a Course_fa men men-plms-learning-path'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/span_New Path'))

WebUI.setText(findTestObject('Object Repository/Page_Learning Paths/input_Learning Path Name_name'), 'qa learning path 2802')

WebUI.setText(findTestObject('Object Repository/Page_Learning Paths/div_Description_id_descriptioneditable'), '<p dir="ltr" style="text-align: left;">qa learning path 2025</p>')

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/input_Learning Path Image_learningpath_imagechoose'))

WebUI.uploadFile(findTestObject('PLMS81 LP CREATE/Page_Learning Paths/input_Attachment_repo_upload_file'), lpimage)

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/button_Upload'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/input_Published_submitbutton'))

