var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider,$locationProvider){
    $routeProvider
        .when('/users',{
            templateUrl: './views/users.html',
            controller: 'usersController'
        })
        .when('/roles',{
            templateUrl: './views/roles.html',
            controller: 'rolesController'
        })
        .when('/login',{
            templateUrl: './views/login.html',
            controller: 'rolesController'
        })
        .when('/userAuth', {
        	templateUrl: './user/userAuth.html',
        	controller: 'UserAuthCtrl'
        })
        .otherwise(
            { redirectTo: '/'}
        );
    $locationProvider.hashPrefix('');
});

