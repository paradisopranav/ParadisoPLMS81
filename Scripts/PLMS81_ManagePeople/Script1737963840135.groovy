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

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/login/index.php')

WebUI.setText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Username_username'), 'admin')

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Username_username'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    'ed/1/AZbo1YX04df+rN1oA==')

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/button_Log in'))

// Generate a random name with 8 characters
String randomFirstName = RandomStringUtils.randomAlphabetic(8).toLowerCase()

String randomLastName = RandomStringUtils.randomAlphabetic(8).toLowerCase()

// Generate a random email
String randomEmail = RandomStringUtils.randomAlphabetic(8).toLowerCase() + '@example.com'

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS/span_Manage people'))

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS/a_People'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/a_New User'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Username_username'), randomEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_newpassword'), 'xkuS2zDhoxbqAxb5QPoxUg==')

WebUI.setText(findTestObject('Object Repository/Page_/input_First Name_firstname'), randomFirstName)

WebUI.setText(findTestObject('Object Repository/Page_/input_Surname_lastname'), randomLastName)

WebUI.setText(findTestObject('Object Repository/Page_/input_Email_email'), randomEmail)

WebUI.click(findTestObject('Object Repository/Page_/input_Email_submitbutton'))

WebUI.setText(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), randomEmail)

WebUI.sendKeys(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Manage People/input_Status_id'))

//WebUI.click(findTestObject('Object Repository/Page_Manage People/input_Status_id'))
WebUI.click(findTestObject('Object Repository/Page_Manage People/a_Enroll Users'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/ul_Courses_select2-selection__rendered'))

WebUI.setText(findTestObject('Object Repository/Page_Manage People/input_Courses_select2-search__field'), 'test')

WebUI.sendKeys(findTestObject('Page_Manage People/input_Courses_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Manage People/button_Enroll'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/input_Status_id_1'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/a_Suspend'))

WebUI.click(findTestObject('Object Repository/Page_/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), randomEmail)

WebUI.sendKeys(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Manage People/a_Never_btn dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/span_Activate User Account'))

WebUI.setText(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), randomEmail)

WebUI.sendKeys(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Manage People/input_Status_id_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/a_Add to Cohort'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/button_Add to Cohort'))

/*

WebUI.click(findTestObject('Object Repository/Page_Manage People/button_New User_btn btn_css dropdown dropdo_1428cf'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/span_Send Message'))

WebUI.setText(findTestObject('Object Repository/Page_Manage People/p_gyjgjmuhk jil'), 'Hello adding')

WebUI.click(findTestObject('Object Repository/Page_Manage People/button_Save'))
*/
WebUI.click(findTestObject('Object Repository/Page_Manage People/i_Manage People_fa fa-close close_icon_search'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/svg'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/a_Full Name'))

WebUI.setText(findTestObject('Object Repository/Page_Manage People/input_Full Name_userfullname'), randomFirstName)

WebUI.click(findTestObject('Object Repository/Page_Manage People/button_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/svg'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/svg'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/a_Email Address'))

WebUI.setText(findTestObject('Object Repository/Page_Manage People/input_Email Address_email'), randomEmail)

WebUI.click(findTestObject('Object Repository/Page_Manage People/input_Email Address_email'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/button_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/span_Email Address_closebutton'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/svg'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/a_Username'))

WebUI.setText(findTestObject('Object Repository/Page_Manage People/input_Username_username'), randomEmail)

WebUI.click(findTestObject('Object Repository/Page_Manage People/button_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/button_Manage People_filterdropdownMenupeople'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/input_Total Record Found 24119_show_tenant'))

//Extra function for three dot click.
//WebUI.click(findTestObject('Object Repository/Page_Manage People/i_New User_wid wid-dots'))

WebUI.setText(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), randomEmail)

WebUI.sendKeys(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Manage People/input_Status_id_1_2_3'))
WebUI.click(findTestObject('Object Repository/Page_Manage People/i_New User_wid wid-dots'))

//WebUI.click(findTestObject('Object Repository/Page_Manage People/button_New User_btn btn_css dropdown dropdo_1428cf'))

WebUI.click(findTestObject('Object Repository/Page_Manage People/span_Delete'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Administration Users Accounts Bul_d721b7/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_PLMS Administration Users Accounts Bul_d721b7/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), randomEmail)

WebUI.sendKeys(findTestObject('Object Repository/Page_Manage People/input_Manage People_txt'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

