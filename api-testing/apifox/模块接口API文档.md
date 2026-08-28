---
title: 默认模块
language_tabs:
  - shell: Shell
  - http: HTTP
  - javascript: JavaScript
  - ruby: Ruby
  - python: Python
  - php: PHP
  - java: Java
  - go: Go
toc_footers: []
includes: []
search: true
code_clipboard: true
highlight_theme: darkula
headingLevel: 2
generator: "@tarslib/widdershins v4.0.30"

---

# 默认模块

Base URLs:

# Authentication

# 收货地址前端操作接口

## POST 新增

POST /address/add

> Body 请求参数

```json
{
  "id": 0,
  "name": "string",
  "address": "string",
  "phone": "string",
  "userId": 0,
  "userName": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Address](#schemaaddress)| 否 |none|

> 返回示例

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /address/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /address/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /address/update

> Body 请求参数

```json
{
  "id": 0,
  "name": "string",
  "address": "string",
  "phone": "string",
  "userId": 0,
  "userName": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Address](#schemaaddress)| 否 |none|

> 返回示例

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /address/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /address/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|name|query|string| 否 |联系人|
|address|query|string| 否 |联系地址|
|phone|query|string| 否 |联系电话|
|userId|query|integer| 否 |关联用户|
|userName|query|string| 否 |none|

> 返回示例

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /address/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|name|query|string| 否 |联系人|
|address|query|string| 否 |联系地址|
|phone|query|string| 否 |联系电话|
|userId|query|integer| 否 |关联用户|
|userName|query|string| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 基础前端接口

## GET hello

GET /

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## POST 登录

POST /login

> Body 请求参数

```json
{
  "username": "user1234",
  "password": "user1234",
  "role": "USER"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Account](#schemaaccount)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## POST 注册

POST /register

> Body 请求参数

```json
{
 "username": "test821",
 "password": "test821",
 "role": "USER"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|Content-Type|header|string| 否 |none|
|body|body|[Account](#schemaaccount)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改密码

PUT /updatePassword

> Body 请求参数

```json
{
  "username": "user123",
  "password": "user123",
  "newPassword": "user1234",
  "confirmPassword": "user1234",
  "role": "USER"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |none|
|Content-Type|header|string| 否 |none|
|Token|header|string| 否 |none|
|body|body|[Account](#schemaaccount)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 文件接口

## POST 文件上传

POST /files/upload

> Body 请求参数

```yaml
file: string

```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|object| 否 |none|
|» file|body|string(binary)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## POST 富文本文件上传

POST /files/editor/upload

> Body 请求参数

```yaml
file: string

```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|object| 否 |none|
|» file|body|string(binary)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Dict](#schemadict)|

## GET 获取文件

GET /files/{flag}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|flag|path|string| 是 |none|

> 返回示例

> 200 Response

```json
{}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

## DELETE 删除文件

DELETE /files/{flag}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|flag|path|string| 是 |none|

> 返回示例

> 200 Response

```json
{}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

# 求购信息前端操作接口

## POST 新增

POST /help/add

> Body 请求参数

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "img": "string",
  "status": "string",
  "userId": 0,
  "time": "string",
  "solved": "string",
  "userName": "string",
  "avatar": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Help](#schemahelp)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /help/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /help/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /help/update

> Body 请求参数

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "img": "string",
  "status": "string",
  "userId": 0,
  "time": "string",
  "solved": "string",
  "userName": "string",
  "avatar": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Help](#schemahelp)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /help/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /help/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|title|query|string| 否 |标题|
|content|query|string| 否 |内容|
|img|query|string| 否 |图片|
|status|query|string| 否 |状态|
|userId|query|integer| 否 |用户ID|
|time|query|string| 否 |发布时间|
|solved|query|string| 否 |是否解决|
|userName|query|string| 否 |none|
|avatar|query|string| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /help/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|title|query|string| 否 |标题|
|content|query|string| 否 |内容|
|img|query|string| 否 |图片|
|status|query|string| 否 |状态|
|userId|query|integer| 否 |用户ID|
|time|query|string| 否 |发布时间|
|solved|query|string| 否 |是否解决|
|userName|query|string| 否 |none|
|avatar|query|string| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET selectFrontPage

GET /help/selectFrontPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|title|query|string| 否 |标题|
|content|query|string| 否 |内容|
|img|query|string| 否 |图片|
|status|query|string| 否 |状态|
|userId|query|integer| 否 |用户ID|
|time|query|string| 否 |发布时间|
|solved|query|string| 否 |是否解决|
|userName|query|string| 否 |none|
|avatar|query|string| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 用户信息前端操作接口

## POST 新增

POST /user/add

> Body 请求参数

```json
{
  "id": 0,
  "username": "string",
  "name": "string",
  "password": "string",
  "role": "string",
  "newPassword": "string",
  "avatar": "string",
  "token": "string",
  "phone": "string",
  "email": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[User](#schemauser)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /user/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /user/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /user/update

> Body 请求参数

```json
{
  "id": 0,
  "username": "string",
  "name": "string",
  "password": "string",
  "role": "string",
  "newPassword": "string",
  "avatar": "string",
  "token": "string",
  "phone": "string",
  "email": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[User](#schemauser)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /user/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /user/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|username|query|string| 否 |用户名|
|name|query|string| 否 |姓名|
|password|query|string| 否 |密码|
|role|query|string| 否 |角色标识|
|newPassword|query|string| 否 |新密码|
|avatar|query|string| 否 |头像|
|token|query|string| 否 |none|
|phone|query|string| 否 |电话|
|email|query|string| 否 |邮箱|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /user/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|username|query|string| 否 |用户名|
|name|query|string| 否 |姓名|
|password|query|string| 否 |密码|
|role|query|string| 否 |角色标识|
|newPassword|query|string| 否 |新密码|
|avatar|query|string| 否 |头像|
|token|query|string| 否 |none|
|phone|query|string| 否 |电话|
|email|query|string| 否 |邮箱|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 管理员前端操作接口

## POST 新增

POST /admin/add

> Body 请求参数

```json
{
  "id": 0,
  "username": "string",
  "name": "string",
  "password": "string",
  "role": "string",
  "newPassword": "string",
  "avatar": "string",
  "token": "string",
  "phone": "string",
  "email": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Admin](#schemaadmin)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /admin/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /admin/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /admin/update

> Body 请求参数

```json
{
  "id": 0,
  "username": "string",
  "name": "string",
  "password": "string",
  "role": "string",
  "newPassword": "string",
  "avatar": "string",
  "token": "string",
  "phone": "string",
  "email": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Admin](#schemaadmin)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /admin/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /admin/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|username|query|string| 否 |用户名|
|name|query|string| 否 |姓名|
|password|query|string| 否 |密码|
|role|query|string| 否 |角色标识|
|newPassword|query|string| 否 |新密码|
|avatar|query|string| 否 |头像|
|token|query|string| 否 |none|
|phone|query|string| 否 |电话|
|email|query|string| 否 |邮箱|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /admin/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|username|query|string| 否 |用户名|
|name|query|string| 否 |姓名|
|password|query|string| 否 |密码|
|role|query|string| 否 |角色标识|
|newPassword|query|string| 否 |新密码|
|avatar|query|string| 否 |头像|
|token|query|string| 否 |none|
|phone|query|string| 否 |电话|
|email|query|string| 否 |邮箱|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 商品前端操作接口

## POST 新增

POST /goods/add

> Body 请求参数

```json
{
  "id": 0,
  "name": "string",
  "price": 0,
  "content": "string",
  "address": "string",
  "img": "string",
  "date": "string",
  "status": "string",
  "category": "string",
  "userId": 0,
  "saleStatus": "string",
  "userName": "string",
  "readCount": 0,
  "sort": "string",
  "userLikes": true,
  "userCollect": true,
  "likesCount": 0,
  "collectCount": 0
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Goods](#schemagoods)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /goods/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /goods/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /goods/update

> Body 请求参数

```json
{
  "id": 0,
  "name": "string",
  "price": 0,
  "content": "string",
  "address": "string",
  "img": "string",
  "date": "string",
  "status": "string",
  "category": "string",
  "userId": 0,
  "saleStatus": "string",
  "userName": "string",
  "readCount": 0,
  "sort": "string",
  "userLikes": true,
  "userCollect": true,
  "likesCount": 0,
  "collectCount": 0
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Goods](#schemagoods)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT updateReadCount

PUT /goods/updateReadCount/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /goods/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /goods/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|name|query|string| 否 |名称|
|price|query|string| 否 |价格|
|content|query|string| 否 |详情|
|address|query|string| 否 |发货地址|
|img|query|string| 否 |图片|
|date|query|string| 否 |上架日期|
|status|query|string| 否 |审核状态|
|category|query|string| 否 |分类|
|userId|query|integer| 否 |所属用户ID|
|saleStatus|query|string| 否 |上架状态|
|userName|query|string| 否 |浏览量|
|readCount|query|integer| 否 |none|
|sort|query|string| 否 |none|
|userLikes|query|boolean| 否 |none|
|userCollect|query|boolean| 否 |none|
|likesCount|query|integer| 否 |none|
|collectCount|query|integer| 否 |none|
|token|header|string| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /goods/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|name|query|string| 否 |名称|
|price|query|string| 否 |价格|
|content|query|string| 否 |详情|
|address|query|string| 否 |发货地址|
|img|query|string| 否 |图片|
|date|query|string| 否 |上架日期|
|status|query|string| 否 |审核状态|
|category|query|string| 否 |分类|
|userId|query|integer| 否 |所属用户ID|
|saleStatus|query|string| 否 |上架状态|
|userName|query|string| 否 |浏览量|
|readCount|query|integer| 否 |none|
|sort|query|string| 否 |none|
|userLikes|query|boolean| 否 |none|
|userCollect|query|boolean| 否 |none|
|likesCount|query|integer| 否 |none|
|collectCount|query|integer| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 前台分页查询

GET /goods/selectFrontPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|name|query|string| 否 |名称|
|price|query|string| 否 |价格|
|content|query|string| 否 |详情|
|address|query|string| 否 |发货地址|
|img|query|string| 否 |图片|
|date|query|string| 否 |上架日期|
|status|query|string| 否 |审核状态|
|category|query|string| 否 |分类|
|userId|query|integer| 否 |所属用户ID|
|saleStatus|query|string| 否 |上架状态|
|userName|query|string| 否 |浏览量|
|readCount|query|integer| 否 |none|
|sort|query|string| 否 |none|
|userLikes|query|boolean| 否 |none|
|userCollect|query|boolean| 否 |none|
|likesCount|query|integer| 否 |none|
|collectCount|query|integer| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# LikesController

## POST add

POST /likes/add

> Body 请求参数

```json
{
  "id": 0,
  "fid": 0,
  "userId": 0,
  "module": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Likes](#schemalikes)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 帖子前端操作接口

## POST 新增

POST /posts/add

> Body 请求参数

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "img": "string",
  "userId": 0,
  "time": "string",
  "circle": "string",
  "descr": "string",
  "readCount": 0,
  "userName": "string",
  "status": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Posts](#schemaposts)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /posts/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /posts/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /posts/update

> Body 请求参数

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "img": "string",
  "userId": 0,
  "time": "string",
  "circle": "string",
  "descr": "string",
  "readCount": 0,
  "userName": "string",
  "status": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Posts](#schemaposts)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT updateCount

PUT /posts/updateCount/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /posts/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /posts/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|title|query|string| 否 |标题|
|content|query|string| 否 |内容|
|img|query|string| 否 |图片|
|userId|query|integer| 否 |用户ID|
|time|query|string| 否 |发布时间|
|circle|query|string| 否 |圈子|
|descr|query|string| 否 |简介|
|readCount|query|integer| 否 |浏览量|
|userName|query|string| 否 |none|
|status|query|string| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /posts/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|title|query|string| 否 |标题|
|content|query|string| 否 |内容|
|img|query|string| 否 |图片|
|userId|query|integer| 否 |用户ID|
|time|query|string| 否 |发布时间|
|circle|query|string| 否 |圈子|
|descr|query|string| 否 |简介|
|readCount|query|integer| 否 |浏览量|
|userName|query|string| 否 |none|
|status|query|string| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 前台分页查询

GET /posts/selectFrontPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|title|query|string| 否 |标题|
|content|query|string| 否 |内容|
|img|query|string| 否 |图片|
|userId|query|integer| 否 |用户ID|
|time|query|string| 否 |发布时间|
|circle|query|string| 否 |圈子|
|descr|query|string| 否 |简介|
|readCount|query|integer| 否 |浏览量|
|userName|query|string| 否 |none|
|status|query|string| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# AliPayController

## GET pay

GET /alipay/pay

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|orderNo|query|string| 否 |none|

> 返回示例

> 200 Response

```json
{}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

## POST payNotify

POST /alipay/notify

> 返回示例

> 200 Response

```json
{}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

# 公告信息表前端操作接口

## POST 新增

POST /notice/add

> Body 请求参数

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "time": "string",
  "user": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Notice](#schemanotice)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /notice/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /notice/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /notice/update

> Body 请求参数

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "time": "string",
  "user": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Notice](#schemanotice)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /notice/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /notice/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|title|query|string| 否 |标题|
|content|query|string| 否 |内容|
|time|query|string| 否 |创建时间|
|user|query|string| 否 |创建人|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /notice/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|title|query|string| 否 |标题|
|content|query|string| 否 |内容|
|time|query|string| 否 |创建时间|
|user|query|string| 否 |创建人|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 订单信息前端操作接口

## POST 新增

POST /orders/add

> Body 请求参数

```json
{
  "id": 0,
  "goodsName": "string",
  "goodsImg": "string",
  "orderNo": "string",
  "total": 0,
  "time": "string",
  "payNo": "string",
  "payTime": "string",
  "userId": 0,
  "address": "string",
  "phone": "string",
  "userName": "string",
  "status": "string",
  "saleId": 0,
  "goodsId": 0,
  "addressId": 0,
  "user": "string",
  "saleName": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Orders](#schemaorders)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /orders/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /orders/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /orders/update

> Body 请求参数

```json
{
  "id": 0,
  "goodsName": "string",
  "goodsImg": "string",
  "orderNo": "string",
  "total": 0,
  "time": "string",
  "payNo": "string",
  "payTime": "string",
  "userId": 0,
  "address": "string",
  "phone": "string",
  "userName": "string",
  "status": "string",
  "saleId": 0,
  "goodsId": 0,
  "addressId": 0,
  "user": "string",
  "saleName": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Orders](#schemaorders)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /orders/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /orders/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|goodsName|query|string| 否 |商品名称|
|goodsImg|query|string| 否 |商品图片|
|orderNo|query|string| 否 |订单编号|
|total|query|string| 否 |总价|
|time|query|string| 否 |下单时间|
|payNo|query|string| 否 |支付单号|
|payTime|query|string| 否 |支付时间|
|userId|query|integer| 否 |下单人ID|
|address|query|string| 否 |收货地址|
|phone|query|string| 否 |联系方式|
|userName|query|string| 否 |收货人名称|
|status|query|string| 否 |订单状态|
|saleId|query|integer| 否 |卖家ID|
|goodsId|query|integer| 否 |none|
|addressId|query|integer| 否 |none|
|user|query|string| 否 |none|
|saleName|query|string| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /orders/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|goodsName|query|string| 否 |商品名称|
|goodsImg|query|string| 否 |商品图片|
|orderNo|query|string| 否 |订单编号|
|total|query|string| 否 |总价|
|time|query|string| 否 |下单时间|
|payNo|query|string| 否 |支付单号|
|payTime|query|string| 否 |支付时间|
|userId|query|integer| 否 |下单人ID|
|address|query|string| 否 |收货地址|
|phone|query|string| 否 |联系方式|
|userName|query|string| 否 |收货人名称|
|status|query|string| 否 |订单状态|
|saleId|query|integer| 否 |卖家ID|
|goodsId|query|integer| 否 |none|
|addressId|query|integer| 否 |none|
|user|query|string| 否 |none|
|saleName|query|string| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 卖家的分页查询

GET /orders/selectSalePage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|goodsName|query|string| 否 |商品名称|
|goodsImg|query|string| 否 |商品图片|
|orderNo|query|string| 否 |订单编号|
|total|query|string| 否 |总价|
|time|query|string| 否 |下单时间|
|payNo|query|string| 否 |支付单号|
|payTime|query|string| 否 |支付时间|
|userId|query|integer| 否 |下单人ID|
|address|query|string| 否 |收货地址|
|phone|query|string| 否 |联系方式|
|userName|query|string| 否 |收货人名称|
|status|query|string| 否 |订单状态|
|saleId|query|integer| 否 |卖家ID|
|goodsId|query|integer| 否 |none|
|addressId|query|integer| 否 |none|
|user|query|string| 否 |none|
|saleName|query|string| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询折线图数据

GET /orders/selectLine

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询柱状图数据

GET /orders/selectBar

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 圈子前端操作接口

## POST 新增

POST /circles/add

> Body 请求参数

```json
{
  "id": 0,
  "img": "string",
  "name": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Circles](#schemacircles)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /circles/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /circles/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /circles/update

> Body 请求参数

```json
{
  "id": 0,
  "img": "string",
  "name": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Circles](#schemacircles)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /circles/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /circles/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|img|query|string| 否 |缩略图|
|name|query|string| 否 |名称|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /circles/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|img|query|string| 否 |缩略图|
|name|query|string| 否 |名称|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# CollectController

## POST add

POST /collect/add

> Body 请求参数

```json
{
  "id": 0,
  "fid": 0,
  "userId": 0,
  "module": "string",
  "goodsName": "string",
  "goodsImg": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Collect](#schemacollect)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /collect/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /collect/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /collect/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 评论表前端操作接口

## POST 新增

POST /comment/add

> Body 请求参数

```json
{
  "id": 0,
  "content": "string",
  "userId": 0,
  "pid": 0,
  "time": "string",
  "fid": 0,
  "module": "string",
  "rootId": 0,
  "userName": "string",
  "avatar": "string",
  "parentUserName": "string",
  "children": [
    {
      "id": 0,
      "content": "string",
      "userId": 0,
      "pid": 0,
      "time": "string",
      "fid": 0,
      "module": "string",
      "rootId": 0,
      "userName": "string",
      "avatar": "string",
      "parentUserName": "string",
      "children": [
        {
          "id": 0,
          "content": "string",
          "userId": 0,
          "pid": 0,
          "time": "string",
          "fid": 0,
          "module": "string",
          "rootId": 0,
          "userName": "string",
          "avatar": "string",
          "parentUserName": "string",
          "children": [
            {}
          ]
        }
      ]
    }
  ]
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Comment](#schemacomment)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /comment/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 递归删除

DELETE /comment/deleteDeep/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /comment/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /comment/update

> Body 请求参数

```json
{
  "id": 0,
  "content": "string",
  "userId": 0,
  "pid": 0,
  "time": "string",
  "fid": 0,
  "module": "string",
  "rootId": 0,
  "userName": "string",
  "avatar": "string",
  "parentUserName": "string",
  "children": [
    {
      "id": 0,
      "content": "string",
      "userId": 0,
      "pid": 0,
      "time": "string",
      "fid": 0,
      "module": "string",
      "rootId": 0,
      "userName": "string",
      "avatar": "string",
      "parentUserName": "string",
      "children": [
        {
          "id": 0,
          "content": "string",
          "userId": 0,
          "pid": 0,
          "time": "string",
          "fid": 0,
          "module": "string",
          "rootId": 0,
          "userName": "string",
          "avatar": "string",
          "parentUserName": "string",
          "children": [
            {}
          ]
        }
      ]
    }
  ]
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Comment](#schemacomment)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /comment/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /comment/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|content|query|string| 否 |内容|
|userId|query|integer| 否 |评论人|
|pid|query|integer| 否 |父级ID|
|time|query|string| 否 |评论时间|
|fid|query|integer| 否 |关联ID|
|module|query|string| 否 |模块|
|rootId|query|integer| 否 |根节点ID|
|userName|query|string| 否 |none|
|avatar|query|string| 否 |none|
|parentUserName|query|string| 否 |none|
|children[0].id|query|integer| 否 |ID|
|children[0].content|query|string| 否 |内容|
|children[0].userId|query|integer| 否 |评论人|
|children[0].pid|query|integer| 否 |父级ID|
|children[0].time|query|string| 否 |评论时间|
|children[0].fid|query|integer| 否 |关联ID|
|children[0].module|query|string| 否 |模块|
|children[0].rootId|query|integer| 否 |根节点ID|
|children[0].userName|query|string| 否 |none|
|children[0].avatar|query|string| 否 |none|
|children[0].parentUserName|query|string| 否 |none|
|children[0].children[0].id|query|integer| 否 |ID|
|children[0].children[0].content|query|string| 否 |内容|
|children[0].children[0].userId|query|integer| 否 |评论人|
|children[0].children[0].pid|query|integer| 否 |父级ID|
|children[0].children[0].time|query|string| 否 |评论时间|
|children[0].children[0].fid|query|integer| 否 |关联ID|
|children[0].children[0].module|query|string| 否 |模块|
|children[0].children[0].rootId|query|integer| 否 |根节点ID|
|children[0].children[0].userName|query|string| 否 |none|
|children[0].children[0].avatar|query|string| 否 |none|
|children[0].children[0].parentUserName|query|string| 否 |none|
|children[0].children[0].children[0]|query|string| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /comment/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|content|query|string| 否 |内容|
|userId|query|integer| 否 |评论人|
|pid|query|integer| 否 |父级ID|
|time|query|string| 否 |评论时间|
|fid|query|integer| 否 |关联ID|
|module|query|string| 否 |模块|
|rootId|query|integer| 否 |根节点ID|
|userName|query|string| 否 |none|
|avatar|query|string| 否 |none|
|parentUserName|query|string| 否 |none|
|children[0].id|query|integer| 否 |ID|
|children[0].content|query|string| 否 |内容|
|children[0].userId|query|integer| 否 |评论人|
|children[0].pid|query|integer| 否 |父级ID|
|children[0].time|query|string| 否 |评论时间|
|children[0].fid|query|integer| 否 |关联ID|
|children[0].module|query|string| 否 |模块|
|children[0].rootId|query|integer| 否 |根节点ID|
|children[0].userName|query|string| 否 |none|
|children[0].avatar|query|string| 否 |none|
|children[0].parentUserName|query|string| 否 |none|
|children[0].children[0].id|query|integer| 否 |ID|
|children[0].children[0].content|query|string| 否 |内容|
|children[0].children[0].userId|query|integer| 否 |评论人|
|children[0].children[0].pid|query|integer| 否 |父级ID|
|children[0].children[0].time|query|string| 否 |评论时间|
|children[0].children[0].fid|query|integer| 否 |关联ID|
|children[0].children[0].module|query|string| 否 |模块|
|children[0].children[0].rootId|query|integer| 否 |根节点ID|
|children[0].children[0].userName|query|string| 否 |none|
|children[0].children[0].avatar|query|string| 否 |none|
|children[0].children[0].parentUserName|query|string| 否 |none|
|children[0].children[0].children[0]|query|string| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET selectTree

GET /comment/selectTree/{fid}/{module}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|fid|path|integer| 是 |none|
|module|path|string| 是 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET selectCount

GET /comment/selectCount/{fid}/{module}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|fid|path|integer| 是 |none|
|module|path|string| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 分类前端操作接口

## POST 新增

POST /category/add

> Body 请求参数

```json
{
  "id": 0,
  "name": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Category](#schemacategory)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /category/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /category/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /category/update

> Body 请求参数

```json
{
  "id": 0,
  "name": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Category](#schemacategory)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /category/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /category/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|name|query|string| 否 |名称|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /category/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|name|query|string| 否 |名称|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 聊天信息前端操作接口

## POST 新增

POST /chatInfo/add

> Body 请求参数

```json
{
  "id": 0,
  "chatUserId": 0,
  "userId": 0,
  "text": "string",
  "isread": "string",
  "time": "string",
  "chatUserName": "string",
  "chatUserAvatar": "string",
  "userName": "string",
  "userAvatar": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[ChatInfo](#schemachatinfo)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /chatInfo/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /chatInfo/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /chatInfo/update

> Body 请求参数

```json
{
  "id": 0,
  "chatUserId": 0,
  "userId": 0,
  "text": "string",
  "isread": "string",
  "time": "string",
  "chatUserName": "string",
  "chatUserAvatar": "string",
  "userName": "string",
  "userAvatar": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[ChatInfo](#schemachatinfo)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT updateRead

PUT /chatInfo/updateRead/{chatUserId}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|chatUserId|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /chatInfo/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /chatInfo/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|chatUserId|query|integer| 否 |聊天用户ID|
|userId|query|integer| 否 |当前用户ID|
|text|query|string| 否 |聊天内容|
|isread|query|string| 否 |是否已读|
|time|query|string| 否 |时间|
|chatUserName|query|string| 否 |none|
|chatUserAvatar|query|string| 否 |none|
|userName|query|string| 否 |none|
|userAvatar|query|string| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /chatInfo/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|chatUserId|query|integer| 否 |聊天用户ID|
|userId|query|integer| 否 |当前用户ID|
|text|query|string| 否 |聊天内容|
|isread|query|string| 否 |是否已读|
|time|query|string| 否 |时间|
|chatUserName|query|string| 否 |none|
|chatUserAvatar|query|string| 否 |none|
|userName|query|string| 否 |none|
|userAvatar|query|string| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询聊天记录

GET /chatInfo/selectUserChat/{chatUserId}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|chatUserId|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 反馈信息前端操作接口

## POST 新增

POST /feedback/add

> Body 请求参数

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "phone": "string",
  "email": "string",
  "reply": "string",
  "createtime": "string",
  "userId": 0,
  "userName": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Feedback](#schemafeedback)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /feedback/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /feedback/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /feedback/update

> Body 请求参数

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "phone": "string",
  "email": "string",
  "reply": "string",
  "createtime": "string",
  "userId": 0,
  "userName": "string"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[Feedback](#schemafeedback)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /feedback/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /feedback/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|title|query|string| 否 |主题|
|content|query|string| 否 |内容|
|phone|query|string| 否 |联系方式|
|email|query|string| 否 |邮箱|
|reply|query|string| 否 |回复|
|createtime|query|string| 否 |创建时间|
|userId|query|integer| 否 |提交人ID|
|userName|query|string| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /feedback/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|title|query|string| 否 |主题|
|content|query|string| 否 |内容|
|phone|query|string| 否 |联系方式|
|email|query|string| 否 |邮箱|
|reply|query|string| 否 |回复|
|createtime|query|string| 否 |创建时间|
|userId|query|integer| 否 |提交人ID|
|userName|query|string| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 聊天组前端操作接口

## POST 新增

POST /chatGroup/add

> Body 请求参数

```json
{
  "id": 0,
  "chatUserId": 0,
  "userId": 0,
  "chatUserName": "string",
  "chatUserAvatar": "string",
  "chatNum": 0
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[ChatGroup](#schemachatgroup)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 删除

DELETE /chatGroup/delete/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## DELETE 批量删除

DELETE /chatGroup/delete/batch

> Body 请求参数

```json
[
  0
]
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|array[integer]| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## PUT 修改

PUT /chatGroup/update

> Body 请求参数

```json
{
  "id": 0,
  "chatUserId": 0,
  "userId": 0,
  "chatUserName": "string",
  "chatUserAvatar": "string",
  "chatNum": 0
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|[ChatGroup](#schemachatgroup)| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 根据ID查询

GET /chatGroup/selectById/{id}

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|path|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 查询所有

GET /chatGroup/selectAll

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|chatUserId|query|integer| 否 |聊天用户ID|
|userId|query|integer| 否 |当前用户ID|
|chatUserName|query|string| 否 |none|
|chatUserAvatar|query|string| 否 |none|
|chatNum|query|integer| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 分页查询

GET /chatGroup/selectPage

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID|
|chatUserId|query|integer| 否 |聊天用户ID|
|userId|query|integer| 否 |当前用户ID|
|chatUserName|query|string| 否 |none|
|chatUserAvatar|query|string| 否 |none|
|chatNum|query|integer| 否 |none|
|pageNum|query|integer| 是 |none|
|pageSize|query|integer| 是 |none|

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

## GET 聊天列表

GET /chatGroup/selectUserGroup

> 返回示例

> 200 Response

```json
{
  "code": "",
  "msg": "",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Result](#schemaresult)|

# 数据模型

<h2 id="tocS_Result">Result</h2>

<a id="schemaresult"></a>
<a id="schema_Result"></a>
<a id="tocSresult"></a>
<a id="tocsresult"></a>

```json
{
  "code": "string",
  "msg": "string",
  "data": {}
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|code|string|false|none||none|
|msg|string|false|none||none|
|data|object|false|none||none|

<h2 id="tocS_Address">Address</h2>

<a id="schemaaddress"></a>
<a id="schema_Address"></a>
<a id="tocSaddress"></a>
<a id="tocsaddress"></a>

```json
{
  "id": 0,
  "name": "string",
  "address": "string",
  "phone": "string",
  "userId": 0,
  "userName": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|name|string|false|none||联系人|
|address|string|false|none||联系地址|
|phone|string|false|none||联系电话|
|userId|integer|false|none||关联用户|
|userName|string|false|none||none|

<h2 id="tocS_Account">Account</h2>

<a id="schemaaccount"></a>
<a id="schema_Account"></a>
<a id="tocSaccount"></a>
<a id="tocsaccount"></a>

```json
{
  "id": 0,
  "username": "string",
  "name": "string",
  "password": "string",
  "role": "string",
  "newPassword": "string",
  "avatar": "string",
  "token": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||none|
|username|string|false|none||用户名|
|name|string|false|none||名称|
|password|string|false|none||密码|
|role|string|false|none||角色标识|
|newPassword|string|false|none||新密码|
|avatar|string|false|none||头像|
|token|string|false|none||none|

<h2 id="tocS_Dict">Dict</h2>

<a id="schemadict"></a>
<a id="schema_Dict"></a>
<a id="tocSdict"></a>
<a id="tocsdict"></a>

```json
{
  "key": {}
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|key|object|false|none||none|

<h2 id="tocS_Help">Help</h2>

<a id="schemahelp"></a>
<a id="schema_Help"></a>
<a id="tocShelp"></a>
<a id="tocshelp"></a>

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "img": "string",
  "status": "string",
  "userId": 0,
  "time": "string",
  "solved": "string",
  "userName": "string",
  "avatar": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|title|string|false|none||标题|
|content|string|false|none||内容|
|img|string|false|none||图片|
|status|string|false|none||状态|
|userId|integer|false|none||用户ID|
|time|string|false|none||发布时间|
|solved|string|false|none||是否解决|
|userName|string|false|none||none|
|avatar|string|false|none||none|

<h2 id="tocS_User">User</h2>

<a id="schemauser"></a>
<a id="schema_User"></a>
<a id="tocSuser"></a>
<a id="tocsuser"></a>

```json
{
  "id": 0,
  "username": "string",
  "name": "string",
  "password": "string",
  "role": "string",
  "newPassword": "string",
  "avatar": "string",
  "token": "string",
  "phone": "string",
  "email": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|username|string|false|none||用户名|
|name|string|false|none||姓名|
|password|string|false|none||密码|
|role|string|false|none||角色标识|
|newPassword|string|false|none||新密码|
|avatar|string|false|none||头像|
|token|string|false|none||none|
|phone|string|false|none||电话|
|email|string|false|none||邮箱|

<h2 id="tocS_Admin">Admin</h2>

<a id="schemaadmin"></a>
<a id="schema_Admin"></a>
<a id="tocSadmin"></a>
<a id="tocsadmin"></a>

```json
{
  "id": 0,
  "username": "string",
  "name": "string",
  "password": "string",
  "role": "string",
  "newPassword": "string",
  "avatar": "string",
  "token": "string",
  "phone": "string",
  "email": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|username|string|false|none||用户名|
|name|string|false|none||姓名|
|password|string|false|none||密码|
|role|string|false|none||角色标识|
|newPassword|string|false|none||新密码|
|avatar|string|false|none||头像|
|token|string|false|none||none|
|phone|string|false|none||电话|
|email|string|false|none||邮箱|

<h2 id="tocS_Goods">Goods</h2>

<a id="schemagoods"></a>
<a id="schema_Goods"></a>
<a id="tocSgoods"></a>
<a id="tocsgoods"></a>

```json
{
  "id": 0,
  "name": "string",
  "price": 0,
  "content": "string",
  "address": "string",
  "img": "string",
  "date": "string",
  "status": "string",
  "category": "string",
  "userId": 0,
  "saleStatus": "string",
  "userName": "string",
  "readCount": 0,
  "sort": "string",
  "userLikes": true,
  "userCollect": true,
  "likesCount": 0,
  "collectCount": 0
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|name|string|false|none||名称|
|price|number|false|none||价格|
|content|string|false|none||详情|
|address|string|false|none||发货地址|
|img|string|false|none||图片|
|date|string|false|none||上架日期|
|status|string|false|none||审核状态|
|category|string|false|none||分类|
|userId|integer|false|none||所属用户ID|
|saleStatus|string|false|none||上架状态|
|userName|string|false|none||浏览量|
|readCount|integer|false|none||none|
|sort|string|false|none||none|
|userLikes|boolean|false|none||none|
|userCollect|boolean|false|none||none|
|likesCount|integer|false|none||none|
|collectCount|integer|false|none||none|

<h2 id="tocS_Likes">Likes</h2>

<a id="schemalikes"></a>
<a id="schema_Likes"></a>
<a id="tocSlikes"></a>
<a id="tocslikes"></a>

```json
{
  "id": 0,
  "fid": 0,
  "userId": 0,
  "module": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||none|
|fid|integer|false|none||none|
|userId|integer|false|none||none|
|module|string|false|none||none|

<h2 id="tocS_Posts">Posts</h2>

<a id="schemaposts"></a>
<a id="schema_Posts"></a>
<a id="tocSposts"></a>
<a id="tocsposts"></a>

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "img": "string",
  "userId": 0,
  "time": "string",
  "circle": "string",
  "descr": "string",
  "readCount": 0,
  "userName": "string",
  "status": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|title|string|false|none||标题|
|content|string|false|none||内容|
|img|string|false|none||图片|
|userId|integer|false|none||用户ID|
|time|string|false|none||发布时间|
|circle|string|false|none||圈子|
|descr|string|false|none||简介|
|readCount|integer|false|none||浏览量|
|userName|string|false|none||none|
|status|string|false|none||none|

<h2 id="tocS_Notice">Notice</h2>

<a id="schemanotice"></a>
<a id="schema_Notice"></a>
<a id="tocSnotice"></a>
<a id="tocsnotice"></a>

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "time": "string",
  "user": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|title|string|false|none||标题|
|content|string|false|none||内容|
|time|string|false|none||创建时间|
|user|string|false|none||创建人|

<h2 id="tocS_Orders">Orders</h2>

<a id="schemaorders"></a>
<a id="schema_Orders"></a>
<a id="tocSorders"></a>
<a id="tocsorders"></a>

```json
{
  "id": 0,
  "goodsName": "string",
  "goodsImg": "string",
  "orderNo": "string",
  "total": 0,
  "time": "string",
  "payNo": "string",
  "payTime": "string",
  "userId": 0,
  "address": "string",
  "phone": "string",
  "userName": "string",
  "status": "string",
  "saleId": 0,
  "goodsId": 0,
  "addressId": 0,
  "user": "string",
  "saleName": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|goodsName|string|false|none||商品名称|
|goodsImg|string|false|none||商品图片|
|orderNo|string|false|none||订单编号|
|total|number|false|none||总价|
|time|string|false|none||下单时间|
|payNo|string|false|none||支付单号|
|payTime|string|false|none||支付时间|
|userId|integer|false|none||下单人ID|
|address|string|false|none||收货地址|
|phone|string|false|none||联系方式|
|userName|string|false|none||收货人名称|
|status|string|false|none||订单状态|
|saleId|integer|false|none||卖家ID|
|goodsId|integer|false|none||none|
|addressId|integer|false|none||none|
|user|string|false|none||none|
|saleName|string|false|none||none|

<h2 id="tocS_Circles">Circles</h2>

<a id="schemacircles"></a>
<a id="schema_Circles"></a>
<a id="tocScircles"></a>
<a id="tocscircles"></a>

```json
{
  "id": 0,
  "img": "string",
  "name": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|img|string|false|none||缩略图|
|name|string|false|none||名称|

<h2 id="tocS_Collect">Collect</h2>

<a id="schemacollect"></a>
<a id="schema_Collect"></a>
<a id="tocScollect"></a>
<a id="tocscollect"></a>

```json
{
  "id": 0,
  "fid": 0,
  "userId": 0,
  "module": "string",
  "goodsName": "string",
  "goodsImg": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||none|
|fid|integer|false|none||none|
|userId|integer|false|none||none|
|module|string|false|none||none|
|goodsName|string|false|none||none|
|goodsImg|string|false|none||none|

<h2 id="tocS_Comment">Comment</h2>

<a id="schemacomment"></a>
<a id="schema_Comment"></a>
<a id="tocScomment"></a>
<a id="tocscomment"></a>

```json
{
  "id": 0,
  "content": "string",
  "userId": 0,
  "pid": 0,
  "time": "string",
  "fid": 0,
  "module": "string",
  "rootId": 0,
  "userName": "string",
  "avatar": "string",
  "parentUserName": "string",
  "children": [
    {
      "id": 0,
      "content": "string",
      "userId": 0,
      "pid": 0,
      "time": "string",
      "fid": 0,
      "module": "string",
      "rootId": 0,
      "userName": "string",
      "avatar": "string",
      "parentUserName": "string",
      "children": [
        {
          "id": 0,
          "content": "string",
          "userId": 0,
          "pid": 0,
          "time": "string",
          "fid": 0,
          "module": "string",
          "rootId": 0,
          "userName": "string",
          "avatar": "string",
          "parentUserName": "string",
          "children": [
            {}
          ]
        }
      ]
    }
  ]
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|content|string|false|none||内容|
|userId|integer|false|none||评论人|
|pid|integer|false|none||父级ID|
|time|string|false|none||评论时间|
|fid|integer|false|none||关联ID|
|module|string|false|none||模块|
|rootId|integer|false|none||根节点ID|
|userName|string|false|none||none|
|avatar|string|false|none||none|
|parentUserName|string|false|none||none|
|children|[[Comment](#schemacomment)]|false|none||none|

<h2 id="tocS_Category">Category</h2>

<a id="schemacategory"></a>
<a id="schema_Category"></a>
<a id="tocScategory"></a>
<a id="tocscategory"></a>

```json
{
  "id": 0,
  "name": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|name|string|false|none||名称|

<h2 id="tocS_ChatInfo">ChatInfo</h2>

<a id="schemachatinfo"></a>
<a id="schema_ChatInfo"></a>
<a id="tocSchatinfo"></a>
<a id="tocschatinfo"></a>

```json
{
  "id": 0,
  "chatUserId": 0,
  "userId": 0,
  "text": "string",
  "isread": "string",
  "time": "string",
  "chatUserName": "string",
  "chatUserAvatar": "string",
  "userName": "string",
  "userAvatar": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|chatUserId|integer|false|none||聊天用户ID|
|userId|integer|false|none||当前用户ID|
|text|string|false|none||聊天内容|
|isread|string|false|none||是否已读|
|time|string|false|none||时间|
|chatUserName|string|false|none||none|
|chatUserAvatar|string|false|none||none|
|userName|string|false|none||none|
|userAvatar|string|false|none||none|

<h2 id="tocS_Feedback">Feedback</h2>

<a id="schemafeedback"></a>
<a id="schema_Feedback"></a>
<a id="tocSfeedback"></a>
<a id="tocsfeedback"></a>

```json
{
  "id": 0,
  "title": "string",
  "content": "string",
  "phone": "string",
  "email": "string",
  "reply": "string",
  "createtime": "string",
  "userId": 0,
  "userName": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|title|string|false|none||主题|
|content|string|false|none||内容|
|phone|string|false|none||联系方式|
|email|string|false|none||邮箱|
|reply|string|false|none||回复|
|createtime|string|false|none||创建时间|
|userId|integer|false|none||提交人ID|
|userName|string|false|none||none|

<h2 id="tocS_ChatGroup">ChatGroup</h2>

<a id="schemachatgroup"></a>
<a id="schema_ChatGroup"></a>
<a id="tocSchatgroup"></a>
<a id="tocschatgroup"></a>

```json
{
  "id": 0,
  "chatUserId": 0,
  "userId": 0,
  "chatUserName": "string",
  "chatUserAvatar": "string",
  "chatNum": 0
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|id|integer|false|none||ID|
|chatUserId|integer|false|none||聊天用户ID|
|userId|integer|false|none||当前用户ID|
|chatUserName|string|false|none||none|
|chatUserAvatar|string|false|none||none|
|chatNum|integer|false|none||none|

