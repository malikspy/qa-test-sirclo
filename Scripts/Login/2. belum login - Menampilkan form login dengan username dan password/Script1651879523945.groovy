import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.http.cookie.Cookie
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import internal.GlobalVariable as GlobalVariable

ResponseObject response = WS.sendRequest(((findTestObject('Login/2. belum login - Menampilkan form login dengan username dan password', [('url') : GlobalVariable.url])) as RequestObject))

WS.verifyResponseStatusCode(response, 200)

WS.comment(response.getResponseText())
