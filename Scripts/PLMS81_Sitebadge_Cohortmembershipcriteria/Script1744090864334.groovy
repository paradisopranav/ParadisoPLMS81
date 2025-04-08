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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Paradiso LMS Log in to the site/button_Log in'))

// Generate a random name with 8 characters
//String randomName = RandomStringUtils.randomAlphabetic(8).toLowerCase()
//String randomNameupdate = RandomStringUtils.randomAlphabetic(8).toLowerCase()
WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Dashboard/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Dashboard/div_Settings'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_PLMS Administration Search/a_Manage Badges'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Manage Badges/button_Add a New Badge'))

WebUI.setText(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/input_Name_name'), 'Cohort membership criteria 1')

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/input_Name_name'))

WebUI.setText(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/textarea_Description_description'), 
    'Hello testing this cohort membership badge criteria')

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/input_Image_imagechoose'))

WebUI.uploadFile(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/uploadimage_criteria1/Page_New badge/input_Attachment_repo_upload_file'), 
    cohortbadgeimage)

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/button_Upload'))

WebUI.click(findTestObject('Object Repository/sitebadge_completingsetofcourses/Page_New badge/input_Time Unit_submitbutton'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_QA demo badge 2025/a_Edit details'))

WebUI.setText(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_QA demo badge 2025/input_Name_name'), 'Cohort membership criteria 2')

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_QA demo badge 2025/input_Time Unit_submitbutton'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_QA demo badge 2025/button_Add criteria'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/cohort_badgedropdown'))

TestObject dropdown = findTestObject('Object Repository/Sitebadge_cohortmembership/cohort_badgedropdown')

try {
    // Attempt to select the dropdown option
    WebUI.selectOptionByLabel(dropdown, 'Cohort membership', true)
}
catch (StaleElementReferenceException e) {
    WebUI.delay(2)

    dropdown = findTestObject('Object Repository/Sitebadge_cohortmembership/cohort_badgedropdown')

    WebUI.selectOptionByLabel(dropdown, 'Cohort membership', true)
} 
catch (Exception e) {
    WebUI.comment('Failed to select dropdown option: ' + e.getMessage())
} // Handle stale element exception by re-finding the object and trying again

WebUI.delay(5)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Cohort membership criteria 2/select_Choose.                    Manual is_f7e05d'), 
//   '8', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Cohort membership criteria 2/select_adding cohort_QA regression         _ed7eac'), 
    '268', true)

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Cohort membership criteria 2/input_Membership in any of the selected coh_b073c4'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Cohort membership criteria 2/button_Enable access'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Changes in badge access/button_Continue'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Cohort membership criteria 2/a_Recipients (0)'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Dashboard/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Dashboard/div_Settings'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_PLMS Administration Search/a_Manage Badges'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Manage Badges/i_concat(, , adding cohort_QA regression, ,_ab3424'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Manage Badges/a_Disable access'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Manage Badges/i_concat(, , adding cohort_QA regression, ,_ab3424'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Manage Badges/a_Copy'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Copy of Cohort membership criteria 2/input_Time Unit_submitbutton'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Dashboard/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Dashboard/div_Settings'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_PLMS Administration Search/a_Manage Badges'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Manage Badges/i_concat(, , adding cohort_QA regression, ,_ab3424'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Manage Badges/a_Delete'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Manage Badges/button_Delete and remove existing issued badges'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Manage Badges/i_concat(, , adding cohort_QA regression, ,_ab3424_1'))

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Manage Badges/a_Delete_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sitebadge_cohortmembership/Page_Manage Badges/button_Delete and remove existing issued badges_1'))

WebUI.delay(5)

WebUI.closeBrowser()

