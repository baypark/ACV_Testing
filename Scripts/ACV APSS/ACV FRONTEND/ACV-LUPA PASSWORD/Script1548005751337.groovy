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

//WebUI.openBrowser(GlobalVariable.STAGGINGACVFRONTEND)
//
//WebUI.delay(5)
//
//WebUI.maximizeWindow()
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/click-masuk'))

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.STAGGINGACVFRONTEND + '/forgot-password')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - LUPA PASSWORD/input-email'), 'autotestacv@yahoo.com')

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LUPA PASSWORD/btn-kirim'))

WebUI.delay(2)

WebUI.verifyTextPresent('Berhasil mengirim link reset password', false)