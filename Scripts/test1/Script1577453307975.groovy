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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/intl/fr/gmail/about/')

WebUI.click(findTestObject('Object Repository/Test-gmail/Page_Gmail  La messagerie avec espace de st_0e3dd2/a_Connexion'))

WebUI.switchToWindowTitle('Gmail')

WebUI.setText(findTestObject('Object Repository/Test-gmail/Page_Gmail/input_Accder  Gmail_identifier'), 'nezha.ennejjary@gmail.com')

WebUI.click(findTestObject('Object Repository/Test-gmail/Page_Gmail/span_Suivant'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test-gmail/Page_Gmail/input_Trop de tentatives infructueuses_password'), 
    '3S6bj8v6lRWDesZ2lQz9jw==')

WebUI.click(findTestObject('Object Repository/Test-gmail/Page_Gmail/span_Suivant'))

WebUI.click(findTestObject('Object Repository/Test-gmail/Page_Gmail/polygon'))

WebUI.click(findTestObject('Object Repository/Test-gmail/Page_Gmail/span_Suivant'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Test-gmail/Page_Gmail/span_Suivant'), 0)

WebUI.acceptAlert()

WebUI.closeBrowser()

