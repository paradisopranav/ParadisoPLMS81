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

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/span_Course Notification_toggle'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/span_Add Activity'))

WebUI.setText(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/input_Add Content_search'), 
    'Quiz')

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Course Katalon_Activity Test creation course/span_Quiz'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Course Katalon_Activity Test creation course/button_Add Content'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Name_name'), 'Katalon Quiz')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/a_Timing'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Enable_timelimitenabled'))

WebUI.setText(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Time_timelimitnumber'), 
    '10')

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/a_Grade'))

WebUI.setText(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Grade to pass_gradepass'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/select_Unlimited            1            2 _13fc15'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/a_Activity Completion'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/select_Do not indicate activity completion _1406bf'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Require View_completionview'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Course completion_mustbecompleted'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Require Grade_completionusegrade'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Require passing grade_completionpass'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Editing Quiz/input_Upon Activity Completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Course Katalon_Activity Test creation course/p_Quiz'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Katalon_Activity Test creation course Quiz/button_AddEdit Questions'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_Add'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_a new question'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/label_TrueFalse'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/input_Description_submitbutton'))

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a TrueFalse question/input_Question name_name'), 
    'Katalon true false')

WebUI.setText(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/Question Text'), 'Katalon true false')

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/Question Text'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a TrueFalse question/select_False            True'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a TrueFalse question/input_Yardley classic_submitbutton'))

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/Delete true false q'))

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/true false delete ok btn'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_Add_1'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_a new question_1'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_Multiple choice'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/input_Description_submitbutton_1'))

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Multiple choice question/input_Question name_name'), 
    'Katalon multiple choice')

WebUI.setText(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/Question Text'), 'Katalon multiple choice')

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/Question Text'))

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Multiple choice question/p'), 
    'A')

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Multiple choice question/p_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Multiple choice question/select_None            100            90   _353130'), 
    '1.0', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Multiple choice question/p_1_2'), 
    'B')

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Multiple choice question/p_1_2'))

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Multiple choice question/p_1_2_3'), 
    'C')

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Multiple choice question/p_1_2_3'))

WebUI.setText(findTestObject('Add Questions in quiz activity/Page_Editing a Multiple choice question/P_1_2_3_4'), 'D')

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Multiple choice question/P_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Multiple choice question/input_Yardley classic_submitbutton'))

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Multiple choice question/delete multiple q'))

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Multiple choice question/delete multip q ok btn'))


WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_Add_1_2'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_a new question'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_Short answer'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/input_Description_submitbutton_1_2'))

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Short answer question/input_Question name_name'), 
    'Katalon Short Answer')

WebUI.setText(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/Question Text'), 'Katalon Short Answer')

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/Question Text'))

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Short answer question/p_Katalon Short Answer'), 
    'Shot1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Short answer question/select_None            100            90   _353130'), 
    '1.0', true)

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Short answer question/input_Answer 2_answer1'), 
    'Short2')

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Short answer question/input_Answer 3_answer2'), 
    'Short3')

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Short answer question/input_Yardley classic_submitbutton'))

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Short answer question/Delete short q'))

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Short answer question/delete short q ok btn'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_Add_1_2_3'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_a new question_1_2'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/label_Numerical'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/input_Description_submitbutton_1_2_3'))

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Numerical question/input_Question name_name'), 
    'Katalon Numeric question')

WebUI.setText(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/Question Text'), '1+1')

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/Question Text'))

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Numerical question/input_Answer 1_answer0'), 
    '2')

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Numerical question/select_None            100            90   _353130'), 
    '1.0', true)

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Numerical question/input_Answer 2_answer1'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Numerical question/input_Answer 3_answer2'), 
    '5')

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Numerical question/input_Yardley classic_submitbutton'))

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Numerical question/delete numeric q'))

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Numerical question/delete numeric ok btn'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_Add_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_a new question_1_2_3'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/span_Matching'))

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing quiz Quiz/input_Description_submitbutton_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Matching question/input_Question name_name'), 
    'Katalon matching')

WebUI.setText(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/Question Text'), 'Katalon matching')

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a TrueFalse question/Question Text'))

WebUI.setText(findTestObject('Add Questions in quiz activity/Page_Editing a Matching question/Question1'), 'Matching1')

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Matching question/Question1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Matching question/input_Answer_subanswers0'), 
    'Q1')

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Matching question/div_Available choices                      _884b17'), 
    'Matching2')

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Matching question/div_Available choices                      _884b17'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Matching question/input_Answer_subanswers1'), 
    'q2')

WebUI.setText(findTestObject('Add Questions in quiz activity/Page_Editing a Matching question/3 question'), 'Matching3')

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Matching question/3 question'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Matching question/input_Answer_subanswers2'), 
    'q3')

WebUI.click(findTestObject('Object Repository/Add Questions in quiz activity/Page_Editing a Matching question/input_Yardley classic_submitbutton'))

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Matching question/Matching q delete'))

WebUI.click(findTestObject('Add Questions in quiz activity/Page_Editing a Multiple choice question/delete multip q ok btn'))
//WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/span_Course Notification_toggle'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Katalon_Activity Test creation course _629ec6/circle_Delete Topic_Ellipse_454'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Katalon_Activity Test creation course _629ec6/a_Delete'))

WebUI.click(findTestObject('Object Repository/Quiz activity in course/Page_Delete Quiz/button_Yes'))

