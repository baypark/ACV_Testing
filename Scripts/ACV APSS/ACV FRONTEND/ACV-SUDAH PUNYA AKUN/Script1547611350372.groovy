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
//WebUI.maximizeWindow()
//

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.STAGGINGACVFRONTEND + '/register')

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - SUDAH PUNYA AKUN/click-masuk disini'))

WebUI.delay(3)

//masuk log in manual//

WebUI.executeJavaScript('$("[name=email]").eq("1").val("autotestacv@yahoo.com")', [])

WebUI.delay(1)

WebUI.executeJavaScript('$("[name=password]").eq("1").val("12345678acv")', [])

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/click-btn login'))

//WebUI.executeJavaScript('$("[id=btn-login]").click', [])

WebUI.delay(3)

WebUI.verifyTextPresent('AUTO', false)

//masuk log in by google//

//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN GOOGLE/click-google'))
//
//WebUI.delay(5)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/input-email google'), 'baypark2494@gmail.com')
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/click-next'))
//
//WebUI.delay(3)
//
//WebUI.setEncryptedText(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/input-pass google'), 'q0uvPSkFiBifybhZfku3DA==')

//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/click-passnext'))
//
//WebUI.delay(4)