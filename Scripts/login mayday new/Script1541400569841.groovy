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

WebUI.openBrowser('http://mayday.ibid.astra.co.id/login')

WebUI.maximizeWindow()

WebUI.delay(1)

WebUI.sendKeys(findTestObject('IBID - LOGIN/email'), 'admin@admin.com')

WebUI.setEncryptedText(findTestObject('IBID - LOGIN/password'), 'HaDILDpcf1xkQmZMAxMqoQ==')

WebUI.click(findTestObject('IBID - LOGIN/login'))

WebUI.delay(2)

WebUI.click(findTestObject('IBID - LOGIN/area'))

WebUI.navigateToUrl('http://mayday.ibid.astra.co.id/cari-lelang')

WebUI.navigateToUrl('http://mayday.ibid.astra.co.id/jadwal-lelang')

WebUI.navigateToUrl('http://mayday.ibid.astra.co.id/live-auction')

WebUI.navigateToUrl('http://mayday.ibid.astra.co.id/beli-npl')

WebUI.navigateToUrl('http://mayday.ibid.astra.co.id/titip-lelang-booking')

WebUI.navigateToUrl('http://mayday.ibid.astra.co.id/comingsoon')

WebUI.navigateToUrl('http://mayday.ibid.astra.co.id/panduan-lelang')