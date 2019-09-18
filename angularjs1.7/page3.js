'use strict';
var myapp = angular.module('myapp',[]);     
    
myapp.controller(
    //controller
    "helloCtrl",function helloController($scope){
            ///model component
            $scope.people = [
                {firstName: "Donald", lastName: "Trump"},
                {firstName: "Kim Jon", lastName: "Ung"}
            ];
    }
);