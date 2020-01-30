import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

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
//WebUI.maximizeWindow()
//

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - LOG IN MANUAL/click-masuk'))

WebUI.delay(2)

WebUI.click(findTestObject('ACV APPS/ACV FRONTEND/ACV - DAFTAR DISINI/click-daftar disini'))

WebUI.delay(2)

//masuk halaman register//

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER MANUAL/input-nama lengkap'), 'BONDAN')

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER MANUAL/input-email'), 'bondanlaso2494@gmail.com')

WebUI.setEncryptedText(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER MANUAL/input-password'), 'F08tabm4MD+4jPpOyZu51g==')

WebUI.setEncryptedText(findTestObject('ACV APPS/ACV FRONTEND/ACV - REGISTER MANUAL/input-repassword'), 'F08tabm4MD+4jPpOyZu51g==')

WebUI.delay(2)

WebUI.executeJavaScript('$(".btn-info").eq(0).click()', [])

//WebUI.delay(3)
//
//WebUI.verifyTextPresent('Success send email', false)

//WebUI.delay(5)
//
//WebUI.executeJavaScript('$("[type=button]").eq("0").click()', [])
//
//WebUI.delay(2)
//
//WebUI.verifyTextPresent('Email telah dikirim ulang, silahkan periksa kembali email anda', false)