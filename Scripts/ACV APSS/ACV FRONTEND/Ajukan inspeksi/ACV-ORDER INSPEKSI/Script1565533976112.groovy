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

//WebUI.openBrowser(GlobalVariable.ACV)
//
//WebUI.maximizeWindow()
//
//WebUI.delay(3)
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
//
//WebUI.delay(3)
//
//WebUI.verifyTextPresent('AUTOTEST', false)

//WebUI.navigateToUrl(GlobalVariable.ACV + '/order-inspection')

//WebUI.delay(3)
//
WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-nomor polisi'), 'B6981ACV')

WebUI.scrollToPosition(50, 680)

WebUI.delay(1)

WebUI.executeJavaScript('$("[id=is_call_center_help]").click()', [])

WebUI.delay(2)

WebUI.scrollToPosition(680, 50)

WebUI.delay(2)

WebUI.executeJavaScript('$("[id=btn-selanjutnya]").click()', [])

WebUI.delay(3)

WebUI.executeJavaScript('$("[id=radio-button-3]").click()', [])

WebUI.sendKeys(findTestObject('ACV APPS/ACV FRONTEND/ACV - ORDER INSPEKSI/input-tanggal'), '12-09-2019')

WebUI.delay(3)

WebUI.executeJavaScript('$(".time_order_datetimepicker").eq("3").click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('$("[name=is_pool]").click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('$("[id=term_condition]").click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('$(".swal2-confirm").click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('$("[id=btn-selanjutnya-2]").click()', [])

WebUI.delay(3)

WebUI.verifyTextPresent('Appointment Success', false)