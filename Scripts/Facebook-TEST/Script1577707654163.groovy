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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/input_Impossible de crer votre compteImposs_6f0b92'), 
    'Iman')

WebUI.setText(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/input_Impossible de crer votre compteImposs_e3ea0e'), 
    'test')

WebUI.setText(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/input_Impossible de crer votre compteImposs_cf9066'), 
    'nezha.ennejjary@gmail.com')

WebUI.setText(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/input_Impossible de crer votre compteImposs_c3bc3b'), 
    'nezha.ennejjary@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/input_Impossible de crer votre compteImposs_0e7c18'), 
    'KQLXZm23zHcUOM5DxW8C1A==')

WebUI.selectOptionByValue(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/select_Jour12345678910111213141516171819202_b1cf5d'), 
    '30', true)

WebUI.click(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/input_Genre_sex'))

WebUI.click(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/button_Inscription'))

WebUI.setEncryptedText(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/input_Impossible de crer votre compteImposs_0e7c18'), 
    'ylnSSh2x47IMVnaGCdT+qg==')

WebUI.click(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/button_Inscription'))

WebUI.setText(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/input_Impossible de crer votre compteImposs_e3ea0e'), 
    'ennejjary')

WebUI.click(findTestObject('Object Repository/facebook-test/Page_Facebook - Connexion ou inscription/button_Inscription'))

WebUI.closeBrowser()

