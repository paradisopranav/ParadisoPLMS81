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

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/local/learningpaths/view.php?id=357')

/*WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Courses'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/span_Add Courses'))

WebUI.setText(findTestObject('Object Repository/Page_qa learning path 28022025/input_Search_potentialcourses_searchtext'), 
    'audio')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_qa learning path 28022025/select_audio visual course_1802'), 
    '1142,audio visual course_1802', true)

WebUI.click(findTestObject('Object Repository/Page_qa learning path 28022025/input_If only one record matches the search_8b291f'))

WebUI.click(findTestObject('Object Repository/Page_qa learning path 28022025/a_Go Back'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Enrol Users'))

WebUI.setText(findTestObject('Object Repository/Page_qa learning path 28022025/input_Search_potentialusers_searchtext'), 
    'hruta200')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_qa learning path 28022025/select_hruta200 hruta200 (hruta200mail.com)'), 
    '24573', true)

WebUI.click(findTestObject('Object Repository/Page_qa learning path 28022025/input_If only one record matches the search_8b291f'))

WebUI.click(findTestObject('Object Repository/Page_qa learning path 28022025/a_Go Back_1'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Overview'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Cohorts'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/span_Add Cohorts'))

WebUI.setText(findTestObject('Object Repository/Page_qa learning path 28022025/input_Search_potentialcohorts_searchtext'), 
    'qa')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_qa learning path 28022025/select_QAqa cohort_2106qa cohort_2806qa my _0d47a3'), 
    '15,QA', true)

WebUI.click(findTestObject('Object Repository/Page_qa learning path 28022025/input_If only one record matches the search_8b291f'))

WebUI.click(findTestObject('Object Repository/Page_qa learning path 28022025/i_File Uploaded Successfully_men men-plms-a_14dec7'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Cohorts'))*/

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Courses'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/i_Edit_men men-close-circle-outline'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Courses_1'))

/*WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/input_Progress_learningpath-user form-check-input'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/span_Delete Users'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/button_OK_1'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Users'))*/

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Cohorts'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/input_Progress_learningpath-user form-check-input'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/span_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/button_OK_1'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Cohorts'))

WebUI.click(findTestObject('Object Repository/Page_Learning Paths/a_Overview'))

