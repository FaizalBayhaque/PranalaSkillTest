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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')

WebUI.click(findTestObject('Object Repository/Page_Register/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_MERCHANT LOGIN_email'), 'johndoe@testmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_MERCHANT LOGIN_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login please wait'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Sales person                Search e_941074'), 
    'search_engine', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Trading As_trading_name'), 'Businessman')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/textarea_Description of your products or se_3a74f4'), 
    'Lorem Ipsum dolor amet')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Address line 1_company_street_no'), 
    'Jakarta')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Address line 2_company_street_name'), 
    'Kebon Jeruk')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_City_company_city'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_ZIP or Postal Code_company_postal_code'), 
    '12345')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/div_Merchant Application                   _c802fb'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Website_company_website'), 'www.loremipsum.com')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Year of incorporation_company_age'), 
    '5')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

