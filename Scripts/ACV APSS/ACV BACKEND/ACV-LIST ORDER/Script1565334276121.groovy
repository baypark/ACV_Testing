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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.STAGGINGACVBACKEND)

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/input-email'), 'admin@gmail.com')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/input-password'), '373N5QL8KVQ=')

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/klik-login'))

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.STAGGINGACVBACKEND + '/list-order')
//
//WebUI.delay(3)

//WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST ORDER/search-list order'), '087889837919')
//

WebUI.delay(5)

WebUI.executeJavaScript('$(".fa-pencil").eq("0").click()', [])

//WebUI.delay(3)
//
//WebUI.executeJavaScript('$("#btn_order_confirm").click()', [])
//
//WebUI.delay(2)
//
//WebUI.verifyTextPresent('Data order inspeksi berhasil diperbaharui', false)
//
//WebUI.delay(1)
//
//WebUI.executeJavaScript('$("[id=btn_confirm_order]").click()', [])
//
//WebUI.delay(2)
//
//WebUI.verifyTextPresent('Berhasil memperbaharui status order inspection', false)

//WebUI.delay(3)
//
//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/tab-payment'))

//WebUI.delay(3)
//
//WebUI.selectOptionByValue(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/combo box-paket harga'), '360000|Regular Car', false)
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/button-save payment'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/button-send email'))
//
//WebUI.delay(3)
//
//WebUI.verifyTextPresent('Email Invoice berhasil dikirim', false)

WebUI.delay(2)

respons = WebUI.getAttribute(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST ORDER/extracting data from link view'), 'value')

println(respons)

GlobalVariable.G_ValueExtract = respons

WebUI.executeJavaScript('window.open()', [])

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl(GlobalVariable.G_ValueExtract)

WebUI.delay(5)

//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST ORDER/button-lanjutkan invoice'))
//
//WebUI.delay(8)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST ORDER/input text-cc number'), '4111111111111111')

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST ORDER/input text-expired cc'), '0420')

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST ORDER/input text-kode cc'), '869')

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST ORDER/button-payment'))

WebUI.delay(15)

WebUI.verifyTextPresent('Pembayaran Berhasil', false)

WebUI.delay(1)

WebUI.navigateToUrl(GlobalVariable.STAGGINGACVBACKEND + '/list-order')

WebUI.delay(2)

WebUI.executeJavaScript('$(".fa-pencil").eq("0").click()', [])

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/tab-assign'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/combo box-inspector'), '10|Insepktor ACV', false)

WebUI.delay(2)

WebUI.executeJavaScript('$("#btn-update-order").eq("0").click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('$("#btn_assign_order").click()', [])

//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/button-assign'))

WebUI.delay(3)

WebUI.verifyTextPresent('Berhasil memperbaharui status order inspection', false)

WebUI.delay(120)

WebUI.navigateToUrl(GlobalVariable.STAGGINGACVBACKEND + '/list-order')

WebUI.delay(2)

WebUI.executeJavaScript('$(".fa-pencil").eq("0").click()', [])