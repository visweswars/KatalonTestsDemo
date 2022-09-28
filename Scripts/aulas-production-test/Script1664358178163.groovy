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

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - UPDATE NOW'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - RESTART AULAS'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/aulas-productiontest/android.widget.EditText - Mobile Number'), '9399613815')

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - CONTINUE'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.view.ViewGroup (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/aulas-productiontest/android.widget.EditText'), '592726')

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - VERIFY'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - Production testing'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - Fee'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.ScrollView'), 0)

Mobile.pressBack()

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot2528524952163619496.png')

Mobile.pressBack()

Mobile.tap(findTestObject('aulas-productiontest/android.widget.TextView - Fee'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -  0 1 payment pending'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -  0 28 payments paid'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -  0 7 payments overdue'), 0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - Prashant student 1'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot1604467767696490333.png')

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - ONGOING'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - TIMETABLE'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.view.ViewGroup (5)'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot5852902337634362331.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - SCHEDULED'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - CANCELLED'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('aulas-productiontest/android.widget.TextView - Fee'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - VIEW MORE'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot6319685372876391759.png')

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -  0 7 payments overdue (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -  0 2 payments refunded'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView -  0 28 payments paid (1)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - Week'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - More'), 0)

Mobile.tap(findTestObject('Object Repository/aulas-productiontest/android.widget.TextView - LOG OUT'), 0)

Mobile.closeApplication()

