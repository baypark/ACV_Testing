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

//WebUI.openBrowser(GlobalVariable.STAGGINGACVFRONTEND)
//
//WebUI.maximizeWindow()
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/click-merk'))
//
//WebUI.delay(3)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-merk'), 'TOYOTA')
//
//WebUI.delay(3)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-merk'), Keys.chord(Keys.ENTER))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/click-seri'))
//
//WebUI.delay(3)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-seri'), 'AVANZA')
//
//WebUI.delay(2)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-seri'), Keys.chord(Keys.ENTER))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/click-silinder'))
//
//WebUI.delay(2)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-silinder'), '1.3')
//
//WebUI.delay(2)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-silinder'), Keys.chord(Keys.ENTER))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - CTA/click - tipe'))
//
//WebUI.delay(3)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - CTA/input - tipe'), 'G')
//
//WebUI.delay(3)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-tipe'), Keys.chord(Keys.ENTER))
//
//WebUI.delay(1)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-tahun'), '2015')
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - CTA/click - close chat'))
//
//WebUI.delay(1)
//
//WebUI.executeJavaScript('$("#radio-normal").click()', [])
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - CTA/button - cek harga'))

//WebUI.delay(2)
//
//WebUI.executeJavaScript('$("[type=button]").eq("3").click()', [])

//WebUI.delay(3)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/input-email'), 'autotestacv@yahoo.com')
//
//WebUI.delay(2)
//
//WebUI.setEncryptedText(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/input-password'), 'RigbBhfdqODDCrBgcI6gOA==')
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/click-btn login'))
//
//WebUI.delay(3)
//
//WebUI.verifyTextPresent('Detail Informasi Kendaraan', false)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-nomor polisi'), GlobalVariable.NOPOLORDER)

WebUI.delay(2)

WebUI.executeJavaScript('$("[id=btn-selanjutnya]").click()', [])

WebUI.delay(3)

WebUI.executeJavaScript('$("[id=radio-button-4]").click()', [])

WebUI.delay(1)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-tanggal'), '19-10-2019')

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/click-time'))

WebUI.delay(1)

WebUI.executeJavaScript('$(".time_order_datetimepicker").eq("3").click()', [])

WebUI.delay(3)

WebUI.executeJavaScript('$("[id=radio-button-2]").click()', [])

WebUI.delay(1)

WebUI.executeJavaScript('$("[id=term_condition]").click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('$(".swal2-confirm").click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('$("[type=submit]").eq(2).click()', [])

WebUI.delay(5)

WebUI.verifyTextPresent('Appointment Success', false)