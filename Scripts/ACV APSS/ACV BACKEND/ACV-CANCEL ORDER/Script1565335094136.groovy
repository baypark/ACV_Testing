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

//WebUI.openBrowser(GlobalVariable.BACKENDACV)
//
//WebUI.delay(3)
//
//WebUI.maximizeWindow()
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/input-email'), 'admin@gmail.com')
//
//WebUI.delay(1)
//
//WebUI.setEncryptedText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/input-password'), '373N5QL8KVQ=')
//
//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/klik-login'))
//
//WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.BACKENDACV + '/list-order')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST ORDER/search-list order'), '087889837919')

WebUI.delay(8)

WebUI.executeJavaScript('$(".fa-pencil").eq("9").click()', [])

WebUI.delay(3)

WebUI.executeJavaScript('$("#btn_order_confirm").click()', [])

WebUI.delay(2)

WebUI.verifyTextPresent('Data order inspeksi berhasil diperbaharui', false)

WebUI.delay(1)

WebUI.executeJavaScript('$("[id=btn_confirm_order]").click()', [])

WebUI.delay(2)

WebUI.verifyTextPresent('Berhasil memperbaharui status order inspection', false)

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/tab-payment'))

WebUI.delay(3)

WebUI.executeJavaScript('$("#btn_cancel_order").click()', [])