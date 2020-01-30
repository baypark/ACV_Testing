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

WebUI.openBrowser(GlobalVariable.BACKENDACV)

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/input-email'), 'admin@gmail.com')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/input-password'), '373N5QL8KVQ=')

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/klik-login'))

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.BACKENDACV + '/list-order')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST ORDER/search-list order'), '087889837919')

WebUI.delay(1)

WebUI.executeJavaScript('$(".os-icon-pencil-12").eq("0").click()', [])

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/select-jenis inspeksi'), '0', false)

//WebUI.clearText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-jam'))

//WebUI.clearText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-kota'))

//WebUI.clearText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-alamat'))

//WebUI.clearText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-nopol'))

//WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-jam'), '14:00')

//WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-kota'), 'Tangerang Selatan')
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-alamat'), 'Jl. Ciputat Raya No.100, RT.11/RW.1, Daerah Khusus Ibukota Jakarta 12240')
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-nopol'), 'B2163BAY')

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/combo box-merk'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), 'HONDA')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/combo box-seri'))

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-seri'))

WebUI.delay(2)

//WebUI.executeJavaScript('$("[class=select2-search__field]").val(BRIO).click()', [])

//WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-seri'), 'BRIO')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/combo box-silinder'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), '1.3')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/combo box-tipe'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), 'S')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-tahun'), '2015')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/combo box-transmisi'), 'Manual', false)

//WebUI.clearText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-tgl inspeksi'))
//
//WebUI.delay(2)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-tgl inspeksi'), '22-06-2019')
//
//WebUI.executeJavaScript('$("#btn_order_confirm").click()', [])
//
//WebUI.delay(2)
//
//WebUI.verifyTextPresent('Data order inspeksi berhasil diperbaharui', false)
//
//WebUI.delay(1)
//
//WebUI.executeJavaScript('$("#btn-confirm-order").click()', [])
//
//WebUI.delay(2)
//
//WebUI.verifyTextPresent('Berhasil memperbaharui status order inspection', false)
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/tab-payment'))
//
//WebUI.delay(2)
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
//WebUI.delay(2)
//
//WebUI.verifyTextPresent('Email Invoice berhasil dikirim', false)

//WebUI.delay(2)

//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/tab-assign'))
//
//WebUI.selectOptionByValue(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/combo box-inspector'), '5541|inspector ibid', false)
//
//WebUI.delay(2)
//
//WebUI.executeJavaScript('$("#btn-update-order").eq("1").click()', [])
//
//WebUI.delay(2)
//
//WebUI.verifyTextPresent('Data order inspeksi berhasil diperbaharui', false)
//
//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/button-assign'))
//
//WebUI.delay(2)
//
//WebUI.verifyTextPresent('Berhasil memperbaharui status order inspection', false)
//
//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/tab-upload'))
//
//WebUI.delay(1)

//WebUI.uploadFile(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/upload-car report'), 'C:/Users/V310/Downloads/Documents/getACV.pdf')
//
//WebUI.delay(2)
//
//WebUI.verifyTextPresent('Berhasil upload CAR REPORT', false)
//
//WebUI.delay(1)
//
//WebUI.uploadFile(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/upload-document report'), 'C:/Users/V310/Downloads/Documents/inspection_2.pdf')
//
//WebUI.delay(2)
//
//WebUI.verifyTextPresent('Berhasil upload DOCUMENT REPORT', false)
//
//WebUI.delay(1)

//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/button-finish'))
//
//WebUI.delay(2)
//
//WebUI.verifyTextPresent('Berhasil memperbaharui status order inspection', false)