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

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Vendre'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Vendre votre bien'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Type de bien'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/li_MaisonVilla'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Nombre de pices'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/li_1'))

WebUI.setText(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Appartement_sell_my_propertyproduct_surface'), 
    '900')

WebUI.setText(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/input_m_sell_my_propertyprice'), 
    '7000000000')

WebUI.setText(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Ce champ est requis_sell_my_propertyp_746687'), 
    'adsdfgjz')

WebUI.setText(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Ce champ est requis_sell_my_propertyp_8a9de1'), 
    '40000000')

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/div_Etape 2'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Vous tes'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/li_Madame'))

WebUI.setText(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Monsieur_sell_my_propertyfirst_name'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Monsieur_sell_my_propertylast_name'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Monsieur_sell_my_propertyemail'), 
    'test.test@test.com')

WebUI.setText(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Monsieur_sell_my_propertytelephone'), 
    '06235417899')

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Monsieur_register_newsletterV'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/img_Lorsque vous avez termin cliquez sur le bouton de validation_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/img_Lorsque vous avez termin cliquez sur le bouton de validation_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/img_Lorsque vous avez termin cliquez sur le bouton de validation_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/button_Valider'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/div_Lorsque vous avez termin cliquez sur le_83aa4e'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/button_Valider'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/button_Valider'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/div_Lorsque vous avez termin cliquez sur le_83aa4e_1'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/button_Valider'))

WebUI.click(findTestObject('Object Repository/Test4-sitepublic/Page_iad - Vendre son bien immobilier avec _1ba77b/span_Soumettre'))

WebUI.closeBrowser()

