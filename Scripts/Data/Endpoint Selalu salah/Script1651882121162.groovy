import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable as GlobalVariable

// Global Variable RandomWord
String Time = new SimpleDateFormat('mmss').format(Calendar.getInstance().getTime())

String no = "coba" + Time + "sirclo"

GlobalVariable.randomword = no

ResponseObject response1 = WS.sendRequest(((findTestObject('Data/Endpoint Selalu salah', [('url') : GlobalVariable.url, ('RandomWord') : GlobalVariable.randomword])) as RequestObject))

WS.verifyResponseStatusCode(response1, 404)

WS.comment(response1.getResponseText())