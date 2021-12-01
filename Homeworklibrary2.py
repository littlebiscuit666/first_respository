import requests
import json
bookId=input("请输入图书的bookId:")

url2="https://findcumt.libsp.com/find/physical/groupitems"
# 这个url是提供图书recordId，返回馆藏、条码、属性

headers={
"User-Agent":'Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) '
              'AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Mobile Safari/537.36 Edg/96.0.1054.34',
"groupCode":"200069",
"Referer":"https://findcumt.libsp.com/"}


data_json2={
    "page": "1",
    "recordId": bookId,
    "rows": "20"
}
# 第二个url提交post需要的数据

response2=requests.post(url2,json=data_json2,headers=headers)
text2=response2.content.decode()
dict_response2=json.loads(text2)

dataneed2=dict_response2["data"]
for book in range(len(dataneed2)):
    blist=[]
    blist.append(dataneed2[book]["barcode"])
    blist.append(dataneed2[book]["locationName"])
    blist.append(dataneed2[book]["processType"])
    print(blist)