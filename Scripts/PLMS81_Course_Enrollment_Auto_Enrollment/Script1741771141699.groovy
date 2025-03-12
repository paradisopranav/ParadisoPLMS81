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

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_PLMS Course Categories/input_dqksywlv_form-control course_search'))

WebUI.setText(findTestObject('File Activity in course/Page_PLMS Course Categories/input_dqksywlv_form-control course_search'), 
    'katalon_activity Test creation')

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_PLMS Course Categories/div_Katalon_Activity Test creation course'))

WebUI.click(findTestObject('Object Repository/Enrollment method Manual in course/Page_Course Katalon_Activity Test creation course/i_Preview_men men-menu-dots'))

WebUI.click(findTestObject('Object Repository/Enrollment method Manual in course/Page_Course Katalon_Activity Test creation course/a_Enrolment Methods'))

//WebUI.click(findTestObject('Enrollment method autoenrollment in course/Page_Enrolment Methods/Auto dropdown'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/Enrollment method autoenrollment in course/Page_Enrolment Methods/select_Choose.                    Manual en_fb9bc6'), 
//   '/enrol/auto/edit.php?courseid=1159', true)
//chatgpt code
// Store the test object in a variable
TestObject dropdown = findTestObject('Enrollment method autoenrollment in course/Page_Enrolment Methods/Auto dropdown')

try {
    // Attempt to select the dropdown option
    WebUI.selectOptionByLabel(dropdown, 'Auto enrolment', true)
}
catch (StaleElementReferenceException e) {
    WebUI.delay(2)

    dropdown = findTestObject('Enrollment method autoenrollment in course/Page_Enrolment Methods/Auto dropdown')

    WebUI.selectOptionByLabel(dropdown, 'Auto enrolment', true)
} 
catch (Exception e) {
    WebUI.comment('Failed to select dropdown option: ' + e.getMessage())
} // Handle stale element exception by re-finding the object and trying again

WebUI.click(findTestObject('Object Repository/Enrollment method autoenrollment in course/Page_Auto enrolment/input_Custom welcome message_submitbutton'))

WebUI.click(findTestObject('Object Repository/Enrollment method autoenrollment in course/Page_Enrolment Methods/i_Auto enrolment_icon fa fa-eye fa-fw iconsmall'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Enrollment method autoenrollment in course/Page_Enrolment Methods/i_Auto enrolment_icon fa fa-eye-slash fa-fw_1f7c41'))

WebUI.click(findTestObject('Object Repository/Enrollment method autoenrollment in course/Page_Enrolment Methods/i_Auto enrolment_icon fa fa-trash fa-fw iconsmall'))

WebUI.click(findTestObject('Object Repository/Enrollment method autoenrollment in course/Page_Enrolment Methods/button_Continue'))

