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
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException

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

WebUI.click(findTestObject('Object Repository/Single Course Format/Page_PLMS Course Categories/h4_bottelneck 2026 category new cat 0309'))

WebUI.click(findTestObject('Object Repository/Single Course Format/Page_Course bottelneck 2026 category new cat 0309/i_Preview_men men-menu-dots'))

WebUI.click(findTestObject('Object Repository/Single Course Format/Page_Course bottelneck 2026 category new cat 0309/a_Edit settings'))

WebUI.click(findTestObject('Object Repository/Single Course Format/Page_Edit course settings/a_Course format'))

TestObject topicformat = findTestObject('Single Course Format/Page_Edit course settings/Select course format dropdown')

try {
    // Attempt to select the dropdown option
    WebUI.selectOptionByLabel(topicformat, 'Topics format', true)
}
catch (StaleElementReferenceException e) {
    WebUI.delay(2)

    dropdown = findTestObject('Sitelevelbadge_Manualissuebyrolecriteria/badge dropdownn')

    WebUI.selectOptionByLabel(topicformat, 'Topics format', true)
} 
catch (Exception e) {
    WebUI.comment('Failed to select dropdown option: ' + e.getMessage())
} // Handle stale element exception by re-finding the object and trying again


WebUI.click(findTestObject('Object Repository/Single Course Format/Page_Edit course settings/input_Sync with AI Tutor_saveanddisplay'))

WebUI.click(findTestObject('Object Repository/Single Course Format/Page_bottelneck 2026 category new cat 0309 TTTT/span_IBM_Theme_toggle'))

WebUI.click(findTestObject('Single Course Format/Page_Edit course settings/Disbaleoff toggle'))

WebUI.click(findTestObject('Object Repository/Single Course Format/Page_bottelneck 2026 category new cat 0309 TTTT/i_bottelneck 2026 category new cat 0309_men_b10524'))

WebUI.click(findTestObject('Object Repository/Single Course Format/Page_bottelneck 2026 category new cat 0309 TTTT/a_Edit settings'))

WebUI.click(findTestObject('Object Repository/Single Course Format/Page_Edit course settings/a_Course format_1'))

TestObject dropdown1 = findTestObject('Single Course Format/Page_Edit course settings/Select course format dropdown')

try {
	// Attempt to select the dropdown option
	WebUI.selectOptionByLabel(dropdown1, 'Left navigation format', true)
}
catch (StaleElementReferenceException e) {
	WebUI.delay(2)

	dropdown = findTestObject('Sitelevelbadge_Manualissuebyrolecriteria/badge dropdownn')

	WebUI.selectOptionByLabel(dropdown1, 'Left navigation format', true)
}
catch (Exception e) {
	WebUI.comment('Failed to select dropdown option: ' + e.getMessage())
} // Handle stale element exception by re-finding the object and trying again

WebUI.click(findTestObject('Object Repository/Single Course Format/Page_Edit course settings/input_Sync with AI Tutor_saveanddisplay'))

WebUI.closeBrowser()

