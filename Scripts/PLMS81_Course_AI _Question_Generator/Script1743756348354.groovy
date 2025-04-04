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

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Paradiso LMS/img_Admin User_userpicture'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Paradiso LMS/a_Settings                                Settings'))

WebUI.setText(findTestObject('Object Repository/AI_Question_Generator/Page_PLMS Administration Search/input_Query_query'), 
    'AI Question Generator')

WebUI.sendKeys(findTestObject('Object Repository/AI_Question_Generator/Page_PLMS Administration Search/input_Query_query'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_PLMS Administration Search/span_Question'))

WebUI.setEncryptedText(findTestObject('Object Repository/AI_Question_Generator/Page_PLMS Administration Plugins Blocks AI _17113b/input_block_ai_quiz_generator  apikey_s_blo_52270a'), 
    'uwKpzziK/2TVxPHt2l9vip1odnR5QLWHYGdssOKO4A20vfHE+UP8EVdfBYhHKDiYupL2KnpcyfzwNTbOMMrFGMBysUsWKVacsCbX9tjv8fiM2oL+to+j+hzo8htzUejLFW67E+g8zMjv6hTbhC8AfmDs6ASAI+DpjjI4w5MpOt4A0PJqujHFjnrw85Jus8rKD1pV5jmZ1PWmC+UNb6MjvjQz3MqWX/jL')

WebUI.selectOptionByValue(findTestObject('Object Repository/AI_Question_Generator/Page_PLMS Administration Plugins Blocks AI _17113b/select_gpt-3.5-turbo            gpt-3.5-tur_5e8193'), 
    'gpt-4-turbo', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AI_Question_Generator/Page_PLMS Administration Plugins Blocks AI _17113b/select_gpt-3.5-turbo            gpt-3.5-tur_5e8193'), 
    'gpt-4', true)

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_PLMS Administration Plugins Blocks AI _17113b/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Paradiso LMS/span_Courses'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Paradiso LMS/span_Catalog'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_PLMS Course Categories/input_dqksywlv_form-control course_search'))

WebUI.setText(findTestObject('File Activity in course/Page_PLMS Course Categories/input_dqksywlv_form-control course_search'), 
    'Quiz AI question generator')

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_PLMS Course Categories/div_Quiz AI question generator'))

WebUI.click(findTestObject('Object Repository/File Activity in course/Page_Course Katalon_Activity Test creation course/span_Course Notification_toggle'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/a_Add tab'))

WebUI.setText(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/input_Add Content_search'), 
    'AI')

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/span_AI Question Generato'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/button_Add Content'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/svg_Grades overview_Component_188_3'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/a_AI Question Generator'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/button_Generate questions'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/i_No Selection_wid wid-icon-arrowvit'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/select_Katalon Page inbound and outbound Ac_abef5c'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/select_Katalon Page inbound and outbound Ac_abef5c'))

WebUI.setText(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/input_Number of questions to generate_numbe_8f4f1b'), 
    '5')

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/input_Prompt text_submitbutton'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/input_Mark as correct_addToQBank'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Edit questions/a_About Course'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/svg_Grades overview_Component_188_3'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/a_AI Question Generator_1'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/button_Generate questions'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/span_No Selection_form_autocomplete_downarr_4b6974'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/select_Katalon Page inbound and outbound Ac_abef5c'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/select_Katalon Page inbound and outbound Ac_abef5c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/select_Multiple choice            TrueFalse_6524a8'), 
    'truefalse', true)

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/input_Prompt text_submitbutton'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/input_Mark as correct_addToQBank'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Edit questions/a_About Course'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/path_Grades overview_Path_51141'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/a_AI Question Generator_1_2'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Course Quiz AI question generator/button_Generate questions'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/input_No Selection_form_autocomplete_input-_679897'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/select_Katalon Page inbound and outbound Ac_abef5c'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/select_Katalon Page inbound and outbound Ac_abef5c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/select_Multiple choice            TrueFalse_6524a8'), 
    'shortanswer', true)

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/input_Prompt text_submitbutton'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_AI Question Generator/input_Mark as correct_addToQBank'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Edit questions/input_Description_qbheadercheckbox'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Edit questions/input_With selected_deleteselected'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Edit questions/button_Delete'))

WebUI.click(findTestObject('Object Repository/AI_Question_Generator/Page_Edit questions/a_About Course'))

WebUI.click(findTestObject('AI_Question_Generator/Page_Course Quiz AI question generator/Click on more'))

WebUI.click(findTestObject('AI_Question_Generator/Page_Course Quiz AI question generator/Edit Block setting'))

WebUI.click(findTestObject('AI_Question_Generator/Page_Course Quiz AI question generator/Delete block button'))

WebUI.click(findTestObject('AI_Question_Generator/Page_Course Quiz AI question generator/Delete Ok Button'))

WebUI.click(findTestObject('AI_Question_Generator/Page_Course Quiz AI question generator/Click on more'))

WebUI.delay(2)

WebUI.closeBrowser()

