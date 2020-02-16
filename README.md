# Money Transfer REST API - A simple Java REST API (without Spring) <br> to transfer money between accounts <br>
### Requirements
> Java 8+
> Spark
### Quick Start - Run
1.In Project Root Directory,type <br/>
```$xslt
 java -jar money-transfer-api-1.0.jar (App will be running on http://localhost:8080 ,if nothing is running on 8080)
```
or
```$xslt
1) ./gradlew build
2) ./gradlew startApp (App will be running on http://localhost:8080 ,if nothing is running on 8080)
```
### Run All Tests[Make sure nothing is running on port 8080]
```$xslt
./gradlew test
```

## Application usage
### Accounts
#### Create an account
The following request creates an account and returns empty body with 201 status code
```
    POST localhost:8080/api/accounts
    { 
    "name":"nickname", 
    "emailAddress":"nickname@g.com", 
    "accountBalance":5000 
    }
```
Response:
```
    HTTP 201 Created
    <Response body is empty>
```
#### Get All Accounts 
The following request gets all accounts :
```
    GET http://localhost:8080/accounts
    
```
Response:
```
    HTTP 200 OK
   [
     {
       "id": 1,
       "name": "nickname",
       "emailAddress": "nickname@g.com",
       "accountBalance": 5000
     }
   ]
```

#### Delete an account
The following request deletes an account:
```
    DELETE localhost:8080/api/accounts/0
```
Response:
```
    HTTP 204 No Content
```


#### Create Money Transfer Transaction
Transfer money from one account to another:
```
    POST http://localhost:8080/accounts/1/transactions [Account with id =1 will be debited 1 and recieving account will be credited 1 
    
    { 
    "sendingAccountId":1, 
    "receivingAccountId":2, 
    "transactionAmount":1 
    }
```
Response:
```
    HTTP 201 No Content
```
#### Retrieve all money transfer transactions on specific account id
The folowing request retrieves all money transfer transactions on specific account id
```
    GET http://localhost:8080/accounts/1/transactions
```
Response:
```
    HTTP 200 OK
    [
      {
        "id": 3,
        "sendingAccountId": 1,
        "receivingAccountId": 2,
        "transactionAmount": 1,
        "transactionStatus": "SUCCESS",
        "dateOfTransaction": "Aug 27, 2019",
        "reason": ""
      },
      {
        "id": 4,
        "sendingAccountId": 1,
        "receivingAccountId": 2,
        "transactionAmount": 100000,
        "transactionStatus": "FAILED",
        "dateOfTransaction": "Aug 27, 2019",
        "reason": "Not Enough Balance to initiate transaction"
      }
    ]

```
#### Retrieve one account
The following request retrieves one account in the datastore
```
    GET http://localhost:8080/accounts/1
```
Response:
```
    HTTP 200 OK
{
  "id": 1,
  "name": "nickname",
  "emailAddress": "nickname@g.com",
  "accountBalance": 4999
}
```
### Delete
#### Delete Account
The following request deletes an account by its id
```
    DELETE http://localhost:8080/accounts/1
   
```
Response:
```
    HTTP 204 No Content
 
```