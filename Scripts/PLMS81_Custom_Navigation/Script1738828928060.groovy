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

WebUI.click(findTestObject('Object Repository/Custom_Navigation/Page_Paradiso LMS/svg_Multi Tenant_left-footer'))

WebUI.click(findTestObject('Object Repository/Custom_Navigation/Page_Navigation structure/input_Link_type'))

WebUI.setText(findTestObject('Object Repository/Custom_Navigation/Page_Navigation structure/input_Container_label'), 'Katalon Container')

WebUI.click(findTestObject('Object Repository/Custom_Navigation/Page_Navigation structure/svg'))

WebUI.click(findTestObject('Object Repository/Custom_Navigation/Page_Navigation structure/i_Menu hide from selected companies_fa fa-eye'))

//WebUI.click(findTestObject('Page_Navigation structure/input_Assign Roles_yui_3_17_2_1_1738837364837_27'))
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

WebUI.click(findTestObject('Object Repository/Custom_Navigation/Page_Navigation structure/input_Menu hide from selected companies_item_add'))

WebUI.click(findTestObject('Object Repository/Custom_Navigation/Page_Navigation structure/div_Katalon Container                      _c003c2'))

String textToVerify = 'Katalon Container'

if (WebUI.verifyTextPresent(textToVerify, false)) {
    println('Text found on the page: ' + textToVerify)
} else {
    println('Text not found on the page: ' + textToVerify)
}

WebUI.click(findTestObject('Custom_Navigation/LeftNav_container object/svg_Katalon Container_menu-dots-vertical_1_'))

WebUI.click(findTestObject('Custom_Navigation/LeftNav_container object/a_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/button_Ok'))

WebUI.click(findTestObject('Object Repository/Page_Navigation structure/input_Custom Navigation_save_menu'))

