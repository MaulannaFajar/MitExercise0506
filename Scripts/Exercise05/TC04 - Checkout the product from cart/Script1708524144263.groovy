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

def data = findTestData('Data Files/dataAkun')

def userName = data.getObjectValue('username', 2)

def passWord = data.getObjectValue('password', 2)

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), userName)

WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_password'), passWord)

WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Page_Swag Labs/div_Sauce Labs Backpack'))

WebUI.click(findTestObject('Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Page_Swag Labs/a_Swag Labs_shopping_cart_link'))

WebUI.click(findTestObject('Page_Swag Labs/button_Checkout'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/span_Checkout Your Information'), 1)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/span_Checkout Your Information'), 'Checkout: Your Information')

WebUI.closeBrowser()

