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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/login/index.php')

WebUI.setText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_Password_password'), 
    'ed/1/AZbo1YX04df+rN1oA==')

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/input_(ja)_keepmeloggedin'))

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS Log in to the site/button_Log in'))

WebUI.navigateToUrl('https://plms-php81.paradisolms.net/')

WebUI.click(findTestObject('Object Repository/Page_Paradiso LMS/svg_Multi Tenant_left-footer'))



WebUI.click(findTestObject('Object Repository/Page_Navigation structure/input_Type_type'))

WebUI.setText(findTestObject('Object Repository/Page_Navigation structure/input_Container_label'), 'Link')

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/input_Container_href'))

WebUI.setText(findTestObject('Object Repository/Page_Navigation structure/input_Container_href_1'), '/course')

WebUI.setText(findTestObject('Object Repository/Page_Navigation structure/input_Container_select_index_language'), '')

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/input_Container_select_index_language'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Navigation structure/select_TargetSelf pageNew page'), 
    '_self', true)

//WebUI.click(findTestObject('Object Repository/Page_Navigation structure/input_Container_fa-type'))

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/input_Container_fa-type'))

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/svg'))

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/i_Menu hide from selected companies_fa fa-cube'))

//This login is used to select the multiple roles in the dropdowm.
List<String> optionsToSelect = ['Site Admin', 'No Roles', 'student', 'guest', 'user']

for (String optionText : optionsToSelect) {
	WebUI.click(findTestObject('Page_Navigation structure/input_Assign Roles_yui_3_17_2_1_1738837364837_27'))

	TestObject listOption = new TestObject('OptionToSelect')

	listOption.addProperty('xpath', ConditionType.EQUALS, ('//li[text()=\'' + optionText) + '\']')

	if (WebUI.verifyElementPresent(listOption, 5, FailureHandling.OPTIONAL)) {
		WebUI.click(listOption)

		WebUI.delay(2)
	} else {
		println(('Option \'' + optionText) + '\' not found.')
	}
}

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/input_Menu hide from selected companies_item_add'))

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/svg_Link_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/a_Edit'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Navigation structure/input_Container_label'), 'Link Update')

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/input_Menu hide from selected companies_item_add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/button_Link_menuOptionsmenuItem_267'))

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/a_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/button_Ok'))

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/input_Custom Navigation_save_menu'))