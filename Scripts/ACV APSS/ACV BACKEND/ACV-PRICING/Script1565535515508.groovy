import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.BACKENDACV)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/input-email'), 'admin@gmail.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/input-password'), '373N5QL8KVQ=')

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/klik-login'))

WebUI.delay(5)

WebUI.navigateToUrl(GlobalVariable.BACKENDACV + '/pricing')

WebUI.delay(3)

WebUI.executeJavaScript('$(".fa-pencil").eq("0").click()', [])

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - PRICING/input text - min price'), GlobalVariable.SENDKEYSMINPRICE)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - PRICING/input text - max price'), GlobalVariable.SENDKEYSMAXPRICE)

WebUI.delay(2)

WebUI.executeJavaScript('$(".btn-primary").click()', [])

WebUI.delay(2)

WebUI.verifyTextPresent('Pricing berhasil', false)