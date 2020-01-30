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
//WebUI.maximizeWindow()
//
//WebUI.delay(5)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/input-email'), 'admin@admin.com')
//
//WebUI.delay(3)
//
//WebUI.setEncryptedText(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/input-password'), '373N5QL8KVQ=')
////
//WebUI.delay(3)
//
//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LOGIN/klik-login'))

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.BACKENDACV + '/list-customer')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST USER/search-list customer'), 'autotestacv@yahoo.com')

WebUI.delay(5)

//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST CUSTOMER/clcik-next'))

//WebUI.executeJavaScript('$("#myTable_next").click()', [])
//
//WebUI.delay(5)
//
//WebUI.executeJavaScript('$("#myTable_previous").click()', [])

//WebUI.click(findTestObject('ACV APPS/ACV BACKEND/BACKEND - LIST CUSTOMER/clcik-previous'))