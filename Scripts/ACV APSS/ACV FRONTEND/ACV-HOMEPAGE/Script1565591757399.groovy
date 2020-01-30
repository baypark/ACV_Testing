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

WebUI.openBrowser(GlobalVariable.STAGGINGACVFRONTEND)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.executeJavaScript('$(".fa-play").click()', [])

WebUI.delay(8)

WebUI.executeJavaScript('$(".close").click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('$(".fa-arrow-right").click()', [])

WebUI.delay(2)

WebUI.verifyTextPresent('TENTANG ACV', false)

//WebUI.executeJavaScript('$("[type=video/mp4]").click()', [])