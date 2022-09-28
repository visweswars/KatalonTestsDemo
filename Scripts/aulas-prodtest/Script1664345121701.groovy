import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\Aulas.apk', true)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - UPDATE NOW'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - RESTART AULAS'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/aulas-Prodtest/android.widget.EditText - Mobile Number'), '9399613815')

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - CONTINUE'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.view.ViewGroup (2)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/aulas-Prodtest/android.widget.EditText'), '592726')

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - VERIFY'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - Production testing'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - Fee'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.view.ViewGroup (5)'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot8458538471690991985.png')

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView -  0 0 payments pending'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView -  0 28 payments paid'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - VIEW MORE'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot6841504453336767368.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - Prashant student 1'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot1578529735162712469.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - (2)'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot5667410373166567332.png')

Mobile.pressBack()

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - All Students'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView -  0    42 payment(s) requested'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - Schedule'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - More'), 0)

Mobile.pressBack()

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot2682931693263317312.png')

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.view.ViewGroup (7)'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot8713455340372307389.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/aulas-Prodtest/android.widget.TextView - LOG OUT'), 0)

Mobile.closeApplication()

