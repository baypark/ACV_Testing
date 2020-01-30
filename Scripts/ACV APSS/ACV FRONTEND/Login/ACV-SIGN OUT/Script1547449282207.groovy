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
//WebUI.delay(3)
//
//WebUI.maximizeWindow()
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/click-masuk'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN GOOGLE/click-google'))
//
//WebUI.delay(3)
//
//WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/input-email google'), 'autotestacv@gmail.com')
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/click-next'))
//
//WebUI.delay(3)
//
//WebUI.setEncryptedText(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN GOOGLE/input-password'), 'RigbBhfdqODDCrBgcI6gOA==')
//
//WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER GOOGLE/click-passnext'))

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - SIGN OUT/click-pengguna'))

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - SIGN OUT/click-sign out'))

WebUI.delay(3)

WebUI.verifyTextPresent('MASUK', false)