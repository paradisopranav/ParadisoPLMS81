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
    'Katalon badge course_403')

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_PLMS Course Categories/div_Katalon badge course_403'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Course Katalon badge course_403/path_Grades overview_Path_51141'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Course Katalon badge course_403/a_Manage Badges'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Manage Badges/button_Add a New Badge'))

String randomName = RandomStringUtils.randomAlphabetic(8).toLowerCase()

WebUI.setText(findTestObject('Object Repository/Course_Level_Badges/Page_Katalon badge course_403 New badge/input_Name_name'), 
    randomName)

WebUI.setText(findTestObject('Object Repository/Course_Level_Badges/Page_Katalon badge course_403 New badge/textarea_Description_description'), 
    randomName)

WebUI.click(findTestObject('Course_Level_Badges/Badge Image upload object/Page_Katalon badge course_403 New badge/Upload Image'))

WebUI.uploadFile(findTestObject('Course_Level_Badges/Badge Image upload object/Page_Katalon badge course_403 New badge/Choose File'), 
    BadgeImage)

WebUI.click(findTestObject('Course_Level_Badges/Badge Image upload object/Page_Katalon badge course_403 New badge/button_Upload'))

WebUI.click(findTestObject('Course_Level_Badges/Badge Image upload object/Page_Katalon badge course_403 New badge/Create badge'))

WebUI.click(findTestObject('Course_Level_Badges/Badge Image upload object/Page_Katalon badge course_403 New badge/badge dropdown'))

TestObject dropdown = findTestObject('Course_Level_Badges/Badge Image upload object/Page_Katalon badge course_403 New badge/badge dropdown')

try {
    // Attempt to select the dropdown option
    WebUI.selectOptionByLabel(dropdown, 'Manual issue by role', true)
}
catch (StaleElementReferenceException e) {
    WebUI.delay(2)

    dropdown = findTestObject('Course_Level_Badges/Badge Image upload object/Page_Katalon badge course_403 New badge/badge dropdown')

    WebUI.selectOptionByLabel(dropdown, 'Manual issue by role', true)
} 
catch (Exception e) {
    WebUI.comment('Failed to select dropdown option: ' + e.getMessage())
} // Handle stale element exception by re-finding the object and trying again

//WebUI.selectOptionByValue(findTestObject('Object Repository/Course_Level_Badges/Page_Katalon Badge dfg/select_Choose.                    Manual is_cf71a9'), 
//    '2', true)
WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Katalon Badge dfg/input_Manager_role_1'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Katalon Badge dfg/input_Any of the selected roles awards the _dee3a1'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Katalon Badge dfg/button_Enable access'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Changes in badge access/button_Continue'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Katalon Badge dfg/a_Recipients (0)'))


WebUI.click(findTestObject('Course_Level_Badges/Page_Katalon Badge dfg/Award badge button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Course_Level_Badges/Page_Badge recipients/select_Admin User (supportparadisosoftware.com)'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Badge recipients/input_Match the search text anywhere in the_df68c1'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Badge recipients/button_Grades overview_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Badge recipients/a_Manage Badges'))

WebUI.verifyElementText(findTestObject('Object Repository/Course_Level_Badges/Page_Manage Badges/a_1'), '1')

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Manage Badges/i_Awarded by Manager_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Manage Badges/a_Copy'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Copy of Katalon Badge dfg/button_Enable access'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Changes in badge access/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Copy of Katalon Badge dfg/path_Grades overview_Path_51142'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Copy of Katalon Badge dfg/a_Manage Badges'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Manage Badges/i_Awarded by Manager_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Manage Badges/a_Delete'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Manage Badges/button_Delete and keep existing issued badges'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Manage Badges/td_Disable accessAward badgeEditCopyDelete'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Manage Badges/i_Awarded by Manager_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Manage Badges/a_Delete_1'))

WebUI.click(findTestObject('Object Repository/Course_Level_Badges/Page_Manage Badges/button_Delete and remove existing issued badges'))

