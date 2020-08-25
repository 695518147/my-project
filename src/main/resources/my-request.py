#!/Users/kuangbendewoniu/python3-env/env3-1/bin/python
# -*- coding:UTF-8 -*-
'''
Author: zhangpeiyu
Date: 2020-08-16 00:58:25
LastEditTime: 2020-08-26 01:49:17
Description: 我不是诗人，所以，只能够把爱你写进程序，当作不可解的密码，作为我一个人知道的秘密。
'''
import requests
import logging

# 启用调试于 http.client 级别 (requests->urllib3->http.client)
# 你将能看到 REQUEST，包括 HEADERS 和 DATA，以及包含 HEADERS 但不包含 DATA 的 RESPONSE。
# 唯一缺少的是 response.body，它不会被 log 记录。
try: # for Python 3
    from http.client import HTTPConnection
except ImportError:
    from httplib import HTTPConnection
HTTPConnection.debuglevel = 1

logging.basicConfig() # 初始化 logging，否则不会看到任何 requests 的输出。
logging.getLogger().setLevel(logging.DEBUG)
requests_log = logging.getLogger("requests.packages.urllib3")
requests_log.setLevel(logging.DEBUG)
requests_log.propagate = True

data = {
    "userAge":"30"
}
response = requests.post("http://localhost:8080/argument?userName=zhangpeiyu", json=data)
print(u"==========bean==========后端bean接收：", response.text)
# response = requests.post("http://localhost:8080/model-attribute/zhangpeiyu?userEmail=695518147@qq.com", json=data)
# print(u"==========bean==========后端bean接收：", response.text)
# response = requests.post("http://localhost:8080/form/form-bean", data=data)
# print(u"==========bean==========后端bean接收：", response.text)
# response1 = requests.post("http://localhost:8080/form/form-str", data=data)
# print(u"==========string==========后端String接收：", response1.text)
# response2 = requests.post("http://localhost:8080/form/form-map", data=data)
# print(u"==========map==========后端Map接收：", response2.text)


# response = requests.post("http://localhost:8080/json/json-bean", json=data)
# print(u"==========bean==========后端bean接收：", response.text)
# response1 = requests.post("http://localhost:8080/json/json-str", json=data)
# print(u"==========string==========后端String接收：", response1.text)
# response2 = requests.post("http://localhost:8080/json/json-map", json=data)
# print(u"==========map==========后端Map接收：", response2.text)


