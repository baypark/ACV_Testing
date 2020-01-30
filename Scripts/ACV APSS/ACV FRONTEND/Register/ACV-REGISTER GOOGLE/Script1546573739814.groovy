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

WebUI.openBrowser(GlobalVariable.ACV + '/register')

WebUI.delay(8)

WebUI.maximizeWindow()

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/click-daftar google'))

WebUI.delay(8)

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/input-email google'), 'bondanlaso2494@gmail.com')

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/click-next'))

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/input-pass google'), 'F08tabm4MD+4jPpOyZu51g==')

WebUI.delay(3)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/click-passnext'))