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

WebUI.openBrowser('https://preprod.iadfrance.fr/')

WebUI.click(findTestObject('test5-respo/Page_iad - Vente achat location maison appartement immobilier de proximit/a_Acheter'))

WebUI.click(findTestObject('test5-respo/Page_iad - Vente achat location maison appartement immobilier de proximit/a_Estimer'))

WebUI.click(findTestObject('test5-respo/Page_iad - Vente achat location maison appartement immobilier de proximit/a_Louer'))

WebUI.click(findTestObject('test5-respo/Page_iad - Vente achat location maison appartement immobilier de proximit/a_Vendre'))

WebUI.verifyElementPresent(findTestObject('test5-respo/Page_iad - Vente achat location maison appartement immobilier de proximit/a_Vendre'), 
    0)

WebUI.closeBrowser()

