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

WebUI.openBrowser(GlobalVariable.STAGGINGACVFRONTEND)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/click-masuk'))

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN GOOGLE/click-google'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/input-email google'), 'autotestacv@gmail.com')

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/click-next'))

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN GOOGLE/input-password'), 'RigbBhfdqODDCrBgcI6gOA==')

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/click-passnext'))

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.STAGGINGACVFRONTEND + '/order-inspection')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-nomor polisi'), GlobalVariable.NOPOLORDER)

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/click-merk'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-merk'), 'DAIHATSU')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-merk'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/click-seri'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-seri'), 'TERIOS')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-seri'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/click-silinder'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-silinder'), '1.5')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-silinder'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/click-tipe'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-tipe'), 'TS')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-tipe'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-tahun'), '2017')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/combo box-transmisi'), 'Manual', false)

WebUI.delay(2)

WebUI.executeJavaScript('$("[id=btn-selanjutnya]").click()', [])

WebUI.delay(3)

WebUI.executeJavaScript('$("[id=radio-button-4]").click()', [])

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-tanggal'), '18-09-2019')

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/click-time'))

WebUI.delay(1)

WebUI.executeJavaScript('$(".time_order_datetimepicker").eq("3").click()', [])

WebUI.delay(3)

WebUI.executeJavaScript('$("[id=radio-button-2]").click()', [])

//WebUI.selectOptionByValue(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/combo box-kota'), 'Jakarta Selatan', false)
//
//WebUI.delay(2)

//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-alamat inspeksi'), 'JL. ACV ASTRA STAGING')
//
//WebUI.delay(2)
//
//WebUI.executeJavaScript('$("[id=btn-selanjutnya]").click()', [])
//
WebUI.delay(2)

WebUI.executeJavaScript('$("[id=btn-selanjutnya-2]").click()', [])

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-nomor hp'), '87889837919')

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/btn-kirim'))

WebUI.delay(25)

WebUI.executeJavaScript('$("[id=btn_kirim_codeotp_loading]").click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('$("[type=checkbox]").click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('$(".swal2-confirm").click()', [])

WebUI.delay(1)

WebUI.executeJavaScript('$("[id=btn-booking-inspeksi]").click()', [])

WebUI.delay(3)

WebUI.verifyTextPresent('Appointment Success', false)