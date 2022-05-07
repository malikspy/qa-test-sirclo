import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.http.cookie.Cookie
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import internal.GlobalVariable as GlobalVariable

ResponseObject response1 = WS.sendRequest(((findTestObject('Login/1. sudah login - Mengembalikan redirect 3XX ke url utama', [('url') : GlobalVariable.url])) as RequestObject))

WS.verifyResponseStatusCode(response1, 302)

WS.comment(response1.getResponseText())