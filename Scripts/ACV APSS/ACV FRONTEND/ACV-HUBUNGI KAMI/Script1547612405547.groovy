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

//WebUI.openBrowser(GlobalVariable.ACV)
//
//WebUI.delay(5)
//
//WebUI.maximizeWindow()
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/click-masuk'))
//
//WebUI.delay(3)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/input-email'), 'biyupark2494@gmail.com')
//
//WebUI.setEncryptedText(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/input-password'), '63p8nJj9qf/iTwpIBeOAIQ==')
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/click-btn login'))

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.STAGGINGACVFRONTEND + '/contact-us')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('ACV APPS/ACV FRONTEND/ACV - HUBUNGI KAMI/select-pertanyaan'), 'Masukan/Saran', false)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - HUBUNGI KAMI/input-pertanyaan'), 'Proses inspeksi startup')

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - HUBUNGI KAMI/input-nama lengkap'), 'ACV STAGGING')

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - HUBUNGI KAMI/input-email'), 'autotestacv@gmail.com')

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - HUBUNGI KAMI/btn-kirim pesan'))

//WebUI.delay(2)

//WebUI.verifyTextPresent('Terima kasih telah menghubungi kami', false)