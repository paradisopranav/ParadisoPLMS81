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

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/login/index.php')

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS Log in to the site/b_Create An Account'))

WebUI.setText(findTestObject('Object Repository/Create an new user from login page/Page_New account/input_Username_username'), 
    'katalonloginpage')

WebUI.setEncryptedText(findTestObject('Object Repository/Create an new user from login page/Page_New account/input_Password_password'), 
    'xkuS2zDhoxbqAxb5QPoxUg==')

WebUI.setText(findTestObject('Object Repository/Create an new user from login page/Page_New account/input_Email Address_email'), 
    'katalonloginpage@dom.com')

WebUI.setText(findTestObject('Object Repository/Create an new user from login page/Page_New account/input_Email (Again)_email2'), 
    'katalonloginpage@dom.com')

WebUI.setText(findTestObject('Object Repository/Create an new user from login page/Page_New account/input_First Name_firstname'), 
    'katalon')

WebUI.setText(findTestObject('Object Repository/Create an new user from login page/Page_New account/input_Surname_lastname'), 
    'loginpage')

WebUI.setText(findTestObject('Object Repository/Create an new user from login page/Page_New account/input_CityTown_city'), 
    'Pune')

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_New account/input_checkbox_field_submitbutton'))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Error/a_Log in'))

//Admin Login
WebUI.setText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Username_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS/h6_Manage people'))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS/a_People'))

WebUI.setText(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/input_Manage People_txt'), 
    'katalonloginpage')

WebUI.sendKeys(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/input_Manage People_txt'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/input_Status_id'))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/a_Never_btn dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/a_Confirm'))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/span_Logout'))

WebUI.setText(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    'katalonloginpage')

WebUI.setEncryptedText(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    'xkuS2zDhoxbqAxb5QPoxUg==')

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS/button_End tour'))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS/span_kl'))

WebUI.verifyElementText(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS/div_katalon loginpage'), 
    'katalon loginpage')

WebUI.click(findTestObject('Create an new user from login page/Page_Paradiso LMS Log in to the site/userlogout'))

//Admin Login to delete the user
//Admin Login
WebUI.setText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Username_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS/h6_Manage people'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS/a_People'))

WebUI.setText(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/input_Manage People_txt'), 
    'katalonloginpage')

WebUI.sendKeys(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/input_Manage People_txt'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/input_Status_id'))

WebUI.click(findTestObject('Create an new user from login page/Page_Manage People/Admin moreoption three dots'))

WebUI.click(findTestObject('Create an new user from login page/Page_Manage People/Click delete'))

WebUI.click(findTestObject('Create an new user from login page/Page_Manage People/Delete ok button'))

WebUI.click(findTestObject('Create an new user from login page/Page_Manage People/Delete continue button'))

WebUI.setText(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/input_Manage People_txt'), 
    'katalonloginpage')

WebUI.sendKeys(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/input_Manage People_txt'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Manage People/span_Logout'))

WebUI.setText(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS Log in to the site/input_Username_username'), 
    'katalonloginpage')

WebUI.setEncryptedText(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    'xkuS2zDhoxbqAxb5QPoxUg==')

WebUI.click(findTestObject('Object Repository/Create an new user from login page/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.delay(5)

WebUI.closeBrowser()

