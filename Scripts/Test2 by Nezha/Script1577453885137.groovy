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

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.click(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/span_Crer un compte'))

WebUI.setText(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/input_Connexion_fos_user_registration_formemail'), 
    'Nezha.e@hiitconsulting.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/input_Connexion_fos_user_registration_formp_5b0d88'), 
    '3S6bj8v6lRWDesZ2lQz9jw==')

WebUI.click(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/input_Connexion_fos_user_registration_formcgu'))

WebUI.click(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/input_Politique de confidentialit_register__ea03d9'))

WebUI.click(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/input_Politique de confidentialit_promoP'))

WebUI.click(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/button_Sinscrire'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/input_Connexion_fos_user_registration_formp_e302d8'), 
    '3S6bj8v6lRWDesZ2lQz9jw==')

WebUI.click(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/button_Sinscrire'))

WebUI.setText(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/input_Connexion_fos_user_registration_formemail'), 
    'Nezha.e@hiitconsulting12.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/input_Connexion_fos_user_registration_formp_5b0d88'), 
    '3S6bj8v6lRWDesZ2lQz9jw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/input_Connexion_fos_user_registration_formp_e302d8'), 
    '3S6bj8v6lRWDesZ2lQz9jw==')

WebUI.click(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/button_Sinscrire'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Test-Siteweb/Page_iad - Vente achat location maison appa_3091d3/input_Connexion_fos_user_registration_formp_e302d8'), 
    0)

WebUI.closeBrowser()

