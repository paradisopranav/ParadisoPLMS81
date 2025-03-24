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

WebUI.setText(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Paradiso LMS Log in to the site/button_Log in'))

// Generate a random name with 8 characters
//String randomName = RandomStringUtils.randomAlphabetic(8).toLowerCase()
//String randomNameupdate = RandomStringUtils.randomAlphabetic(8).toLowerCase()
WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Dashboard/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Dashboard/div_Settings'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_PLMS Administration Search/a_Manage Badges'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Manage Badges/button_Add a New Badge'))

WebUI.setText(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/input_Name_name'), 'Katalon course criteria badge 2025')

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/input_Name_name'))

WebUI.setText(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/textarea_Description_description'), 
    'QA demo badge 2025 demoss')

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/input_Image_imagechoose'))

WebUI.uploadFile(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/uploadimage_criteria1/Page_New badge/input_Attachment_repo_upload_file'), 
    badgeimageupload)

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/button_Upload'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/input_Time Unit_submitbutton'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025/a_Edit details'))

WebUI.setText(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025/input_Name_name'), 
    'Katalon course criteria badge 2026')

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025/input_Time Unit_submitbutton'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025/button_Add criteria'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Copy of expiration testing/i_No Selection_wid wid-icon-arrowvit'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Copy of expiration testing/li_QA COURSE 2401'))


/*WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/coursecriteria_badgedropdown'))

TestObject dropdown = findTestObject('Object Repository/sitebadge_completingsetofcourses/coursecriteria_badgedropdown')

try {
    // Attempt to select the dropdown option
    WebUI.selectOptionByLabel(dropdown, 'Completing a set of courses', true)
}
catch (StaleElementReferenceException e) {
    WebUI.delay(2)

    dropdown = findTestObject('Object Repository/sitebadge_completingsetofcourses/coursecriteria_badgedropdown')

    WebUI.selectOptionByLabel(dropdown, 'Completing a set of courses', true)
} 
catch (Exception e) {
    WebUI.comment('Failed to select dropdown option: ' + e.getMessage())
} // Handle stale element exception by re-finding the object and trying again

*/

/*
WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Copy of expiration testing/i_No Selection_wid wid-icon-arrowvit'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Copy of expiration testing/li_QA COURSE 2401'))

WebUI.selectOptionByValue(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Copy of expiration testing/select_tenant course 201QA COURSE 2401sonal_9f5504'),
	'1110', true)

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Copy of expiration testing/input_firstvaluecourse_submitcourse'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Copy of expiration testing/input_Any of the selected courses is comple_930cad'))

( // WebUI.selectOptionByValue(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025 2026/select_Choose.                    Manual is_f7e05d'), 
// '5', true)
WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025 2026/span_No Selection_form_autocomplete_downarr_80be32')))

WebUI.setText(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025 2026/input_No Selection_form_autocomplete_input-_68a268'), 
    'regress')

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025 2026/li_Regression course  Testing all the activ_7f5f39'))

WebUI.selectOptionByValue(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025 2026/select_REGRESSION QUIZ_2201REGRESSION ILT C_627021'), 
    '1061', true)

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025 2026/input_REGRESSION ILT COURSE_901_submitcourse'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025 2026/input_Any of the selected courses is comple_930cad'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_QA demo badge 2025 2026/button_Enable access'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Changes in badge access/button_Continue'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Manage Badges/i_concat(, , Regression course  Testing all_7b893d'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Manage Badges/a_Disable access'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Manage Badges/i_concat(, , Regression course  Testing all_7b893d'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Manage Badges/a_Copy'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Copy of QA demo badge 2025 2026/input_Time Unit_submitbutton'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Manage Badges/i_concat(, , Regression course  Testing all_7b893d_1'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Manage Badges/a_Delete'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_Manage Badges/button_Delete and remove existing issued badges'))
*/

WebUI.closeBrowser()

