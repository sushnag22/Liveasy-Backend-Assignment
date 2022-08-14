# Liveasy-Backend-Assignment
RESTful API for Payload details built with Spring Boot in the Java programming language for Liveasy back-end developer internship assignment.

<h2>REST API for Liveasy Payloads</h2>
<p>The <b>Load</b> entity has the following attributes:</p>
<ul>
    <li>loadingPoint</li>
    <li>unloadingPoint</li>
    <li>productType</li>
    <li>truckType</li>
    <li>noOfTrucks</li>
    <li>weight</li>
    <li>comment</li>
    <li>shipperId</li>
    <li>date</li>
</ul>
<p>The endpoints are:</p>
<ol>
    <li>POST (/load) - To create a new load</li>
    <li>GET (/load/1) - To retrieve a load using its ID</li>
    <li>GET (/load?shipperId=1) - To retrieve a load with the query parameter as shipper ID</li>
    <li>PUT (/load/1) - To update a load with a given ID</li>
    <li>DELETE (/load/1) - To delete a load with a given ID</li>
</ol>
<h4>Postman collection link : https://www.getpostman.com/collections/8df2b067cb6d5406d5e7</h4>
</body>
