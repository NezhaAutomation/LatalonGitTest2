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

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Vente achat location maison appa_3091d3/a_Acheter'))

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Vente achat location maison appa_3091d3/img_Surface dcroissant_lazy'))

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/a_Motif'))

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/li_Je suis intrss(e) par un bien'))

WebUI.setText(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/input_Je souhaiterais me renseigner sur les_6cf733'), 
    'Nezha')

WebUI.setText(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/input_Je souhaiterais me renseigner sur les_5c81db'), 
    'Nezjjary')

WebUI.setText(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/input_Je souhaiterais me renseigner sur les_8800dc'), 
    'nezha@test.com')

WebUI.setText(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/input_Je souhaiterais me renseigner sur les_69c921'), 
    '06235146987')

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/input_Je souhaiterais me renseigner sur les_8734b2'))

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/button_Ignorer'))

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/img_concat(S  il n  y en a aucune cliquez s_78d0ed'))

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/img_concat(S  il n  y en a aucune cliquez s_78d0ed'))

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/img_concat(S  il n  y en a aucune cliquez s_78d0ed'))

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/img_concat(S  il n  y en a aucune cliquez s_78d0ed'))

WebUI.click(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/button_Suivant'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Test-vendre-siteweb/Page_iad - Appartement de 51 m - 2 chambres_431556/iframe_concat(Crer l  alerte)_c-yzq446dkl7p'), 
    0)

WebUI.closeBrowser()

