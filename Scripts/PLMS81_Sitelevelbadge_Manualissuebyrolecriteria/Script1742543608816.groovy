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

WebUI.setText(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Paradiso LMS Log in to the site/button_Log in'))

// Generate a random name with 8 characters
//String randomName = RandomStringUtils.randomAlphabetic(8).toLowerCase()
//String randomNameupdate = RandomStringUtils.randomAlphabetic(8).toLowerCase()
WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Dashboard/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Dashboard/div_Settings'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_PLMS Administration Search/a_Manage Badges'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Manage Badges/button_Add a New Badge'))

WebUI.setText(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_New badge/input_Name_name'), 
    'katalon badge 2403')

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_New badge/input_Name_name'))

WebUI.setText(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_New badge/textarea_Description_description'), 
    'katalon badge 24032025')

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_New badge/input_Image_imagechoose'))

WebUI.uploadFile(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/uploadimage_criteria1/Page_New badge/input_Attachment_repo_upload_file'), 
    uploadimage)

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_New badge/button_Upload'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_New badge/input_Time Unit_submitbutton'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Katalon badge first/a_Edit details'))

WebUI.setText(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Katalon badge first/input_Name_name'), 
    'katalon badge 24032025')

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Katalon badge first/input_Time Unit_submitbutton'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Katalon badge first/button_Add criteria'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/badge dropdown'))

TestObject dropdown = findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/badge dropdown')

try {
    // Attempt to select the dropdown option
    WebUI.selectOptionByLabel(dropdown, 'Manual issue by role', true)
}
catch (StaleElementReferenceException e) {
    WebUI.delay(2)

    dropdown = findTestObject('Sitelevelbadge_Manualissuebyrolecriteria/badge dropdownn')

    WebUI.selectOptionByLabel(dropdown, 'Manual issue by role', true)
} 
catch (Exception e) {
    WebUI.comment('Failed to select dropdown option: ' + e.getMessage())
} // Handle stale element exception by re-finding the object and trying again

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Katalon badge first demo/input_Manager_role_1'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Katalon badge first demo/input_Any of the selected roles awards the _dee3a1'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Katalon badge first demo/button_Enable access'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Changes in badge access/button_Continue'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Katalon badge first demo/a_Recipients (0)'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Katalon badge first demo/button_Award badge'))

WebUI.setText(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Badge recipients/input_Search_potentialrecipients_searchtext'), 
    'hruta')

WebUI.sendKeys(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Badge recipients/input_Search_potentialrecipients_searchtext'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Badge recipients/select_hruta hruta (manashmail.com)hruta1 h_e50a15'), 
    '24315', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Badge recipients/select_hruta hruta (manashmail.com)hruta1 h_e50a15'), 
    '4898', true)

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Badge recipients/input_Match the search text anywhere in the_df68c1'))

//WebUI.navigateToUrl('https://plms-php81.paradisolms.net/badges/index.php?type=1')
WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Dashboard/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Dashboard/div_Settings'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_PLMS Administration Search/a_Manage Badges'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Manage Badges/i_Awarded by Manager_dropdownMenuButton_1'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Manage Badges/a_Disable access'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Manage Badges/i_Awarded by Manager_dropdownMenuButton_1'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Manage Badges/a_Copy'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Copy of katalon badge 24032025/input_Time Unit_submitbutton'))

WebUI.delay(5)

//WebUI.navigateToUrl('https://plms-php81.paradisolms.net/badges/index.php?type=1')
WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Dashboard/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Dashboard/div_Settings'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_PLMS Administration Search/a_Manage Badges'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Manage Badges/i_Awarded by Manager_dropdownMenuButton_1_2'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Manage Badges/a_Delete'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Manage Badges/button_Delete and remove existing issued badges'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Manage Badges/i_Awarded by Manager_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Manage Badges/a_Delete_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sitelevelbadge_Manualissuebyrolecriteria/Page_Manage Badges/button_Delete and remove existing issued badges_1'))

WebUI.delay(5)

WebUI.closeBrowser()

