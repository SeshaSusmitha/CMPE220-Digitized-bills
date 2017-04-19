
angular.module('app', ['ngRoute','ngResource', 'app.userAuth', 'app.dashboard','app.landingPage'])
.config(function($routeProvider, $locationProvider) {
  $routeProvider
  .when('/', {
	templateUrl: './landingPage/landingPage.html',
    controller: 'LandingPageCtrl'
  }) 
  .when('/userAuth', {
    templateUrl: './user/userAuth.html',
    controller: 'UserAuthCtrl'
  })
  .when('/dashboard', {
	  templateUrl: './dashboard/dashboard.html',
    controller: 'DashboardCtrl'
  }) 
});
