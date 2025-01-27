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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.Cookie

/*
WebUI.openBrowser('')


//This keyword maximizes the browser window
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/login/index.php')

WebUI.setText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Password_password'),
	'ed/1/AZbo1YX04df+rN1oA==')

WebUI.click(findTestObject('button_Log in'))
*/
WebUI.navigateToUrl('https://plms-php81.paradisolms.net/local/enroll_by_profile/index.php/')

String randomName = RandomStringUtils.randomAlphabetic(8).toLowerCase()

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/span_Add Rule'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Hub/input_Name_id_name_field1'), randomName)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Hub/select_-- Select Option --CityTownCountryEm_55ab99'),
	'firstname', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Hub/select_-- Select Option --Containsmatches e_42dc74'),
	'exactmatch', true)

WebUI.setText(findTestObject('Object Repository/Page_Automation Hub/input_Value_textmatch1'), randomName)

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/input_Value_textmatch1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Hub/select_-- Select Option --CourseTenantLearn_c75734'),
	'1', true)

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/input_bottelneck- 2025_elements'))

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/button_Save'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Hub/input_Automation Hub_search'), randomName)

WebUI.sendKeys(findTestObject('Object Repository/Page_Automation Hub/input_Automation Hub_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/input_Keep Enroll_selectall'))

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/span_Disable'))

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/button_OK'))

WebUI.delay(15)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/i_Disabled_wid wid-dots hideicon'))

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/a_EnableEnable'))

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/button_OK'))

WebUI.delay(10)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/input_Keep Enroll_selectall'))

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/span_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/div_Automation Hub                         _90b4e9'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Hub/input_Automation Hub_search'), '')

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/a_Task logs'))

WebUI.click(findTestObject('Object Repository/Page_Automation Hub/a_File Uploaded Successfully_back_page mr-2'))

WebUI.closeBrowser()

