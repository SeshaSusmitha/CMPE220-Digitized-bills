angular.module('app', ['ngRoute', 'ngStorage'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/dashboard', {
    templateUrl: './dashboard/dashboard.html',
    controller: 'DashboardCtrl'
  })
}])
.controller('DashboardCtrl', function($scope, $http,  $sessionStorage){
	  
});