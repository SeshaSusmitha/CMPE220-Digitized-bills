
angular.module('app', ['ngRoute','ngResource', 'app.userAuth', 'app.dashboard']);

config(function($routeProvider, $locationProvider) {
  $routeProvider
   .when('/userAuth', {
    templateUrl: './user/userAuth.html',
    controller: 'UserAuthCtrl'
  })
  .when('/dashboard', {
	  templateUrl: './dashboard/dashboard.html',
    controller: 'DashboardCtrl'
  }) 
});
