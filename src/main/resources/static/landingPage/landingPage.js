angular.module('app', ['ngRoute', 'ngStorage'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/landingPage', {
    templateUrl: './landingPage/landingPage.html',
    controller: 'LandingPageCtrl'
  })
}])
.controller('LandingPageCtrl', function($scope, $http,  $sessionStorage){
	  
});