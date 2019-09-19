## Angular routing

1. Create new project directory 'navigation'
2. Create a new HTML file `loans.htm` 

    ```html
    <h3>Loans Available</h3>
    <ul>
        <li>Home Loan</li>
        <li>Personal Loan</li>
    </ul>
    ```

3.  Create a new HTML file `deposits.htm`

    ```html
    <h3>Deposits Available</h3>
    <ul>
        <li>Recurring Deposit</li>
        <li>Fixed Deposit</li>
    </ul>
    ```

4.  Create new HTML file `main.htm`

    ```html
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset='utf-8'>
        <title>Navigation demo</title>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.8/angular.min.js"></script>        
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.8/angular-route.js"></script>
        <script>
        /// Module with 1 dependency "router"
        var app1 = angular.module('app1',["ngRoute"]);
        app1.config(function($routeProvider){
            $routeProvider.when(
                '/loans',
                {templateUrl:'loans.htm'}
            ) //NO SEMI COLON HERE!
            .when(
                '/deposits',
                {templateUrl:'deposits.htm'}
            )
        });
        </script>
    </head>
    <body ng-app="app1">
        <a href="#!loans">Loans</a>
        <a href="#!deposits">Deposits</a>

        <div ng-view></div>
    </body>
    </html>
    ```
4.  All above files must be created inside `navigation` directory.
    Now, create a file `server.js` outside (in parent directory of navigation) with following lines:

    ```js
    var express = require("express");
    
    var app = express();
    
    app.use(express.static('navigation'));
    var server = app.listen(5000,function(){
        console.log("server started on port 5000");
    }); 
    ```