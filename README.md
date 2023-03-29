# crud_springboot_mongo
Task 1

/bean

used to check the body formats of requests during seding and receiving from endpoints .

/controller

The Controller layer is the conductor of operations for a request. It controls the transaction scope and manages the session related information for the request. The controller first dispatches to a command and then calls the appropriate view processing logic to render the response.

/entity

Provided schema to communicate with database(MongoDb) and to handle the data layer.

/respository

Created DAO(Data Access Objects) to perfrom CRUD operations on the data base.

/service

Written logics that are used by controller to perform actions requested by clients to perform CRUD operations.

/serviceApiApllication.java

Main driver class to load application contexts.

Innput and Output results

Get without id

![image](https://user-images.githubusercontent.com/85479401/228587470-669ef1fc-a7c0-4ecc-b828-3128eeffc189.png)

Get with id

![image](https://user-images.githubusercontent.com/85479401/228587515-6eb0f310-f58b-4601-8756-7a881f5cb107.png)

404

![image](https://user-images.githubusercontent.com/85479401/228587565-d9c299c8-75bc-4d77-a309-55a76f4eab45.png)

PUT

![image](https://user-images.githubusercontent.com/85479401/228588687-0458a324-5587-4bb5-ae56-56b23b49b0a9.png)


Delete by id

![image](https://user-images.githubusercontent.com/85479401/228587661-81e61e31-1885-430d-8dcd-6318a81efe1e.png)

Server by name

![image](https://user-images.githubusercontent.com/85479401/228587760-10438bf2-c497-49d7-9fa4-041a271faccc.png)

![image](https://user-images.githubusercontent.com/85479401/228587798-544bde5d-8cfb-4145-893b-59074d00a012.png)


