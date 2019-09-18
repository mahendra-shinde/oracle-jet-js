'use strict';
var myapp = angular.module('myapp',[]);     
//Combine View and Controller as COMPONENT
// component('Name', 'Template', 'Controller')
myapp.component('listPeople',{
    template:
    '<ul>'+
    '<li ng-repeat="p in people">'+
        '{{ p.firstName }} {{ p.lastName }}'+
    '</li>'+
    '</ul>',
    controller:
        function helloController($scope){
                ///model component
                $scope.people = [
                    {firstName: 'Donald', lastName: 'Trump'},
                    {firstName: 'Kim Jon', lastName: 'Ung'}
                ];
        }
});