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

WebUI.navigateToUrl(GlobalVariable.ACV + '/backend/list-order')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST ORDER/search-list order'), 'dusty')

WebUI.delay(3)

WebUI.executeJavaScript('$(".os-icon-pencil-12").eq("0").click()', [])

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/select-jenis inspeksi'), '0', false)

WebUI.clearText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-tgl inspeksi'))

WebUI.clearText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-jam'))

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-jam'), '16:00')

WebUI.clearText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-kota'))

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-kota'), 'Tangerang Selatan')

WebUI.clearText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-alamat'))

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-alamat'), 'Jl. Ciputat Raya No.100, RT.11/RW.1, Daerah Khusus Ibukota Jakarta 12240')

WebUI.clearText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-nopol'))

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input-nopol'), 'B 82 TEST')

WebUI.delay(1)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/combo box-merk'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), 'TOYOTA')

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/combo box-seri'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), 'AVANZA')

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/combo box-silinder'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), '1.5')

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - TAB ORDER/input text-search'), Keys.chord(Keys.ENTER))