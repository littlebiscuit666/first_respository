import requests
import json

bookname=input("请输入希望查询的书名:")

url1="https://findcumt.libsp.com/find/unify/search"
# 这个url是提供书名，返回bookId、出版社、isbn等

data_json1={
    "searchFieldContent":bookname,
    "searchField":"keyWord"
}
# 第一个url提交post请求需要的数据（json格式）


headers={
"User-Agent":'Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) '
              'AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Mobile Safari/537.36 Edg/96.0.1054.34',
"groupCode":"200069",
"Referer":"https://findcumt.libsp.com/"}

response1=requests.post(url1,json=data_json1,headers=headers)
text1=response1.content.decode()
dict_response1=json.loads(text1)
dataneed=dict_response1["data"]["searchResult"]

for book in range(len(dataneed)):
    booklist=[]
    booklist.append(dataneed[book]["recordId"])
    booklist.append(dataneed[book]["title"])
    booklist.append(dataneed[book]["publisher"])
    booklist.append(dataneed[book]["isbn"])
    print(booklist)





