angular.module('app.landingPage', ['ngRoute', 'ngStorage'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {
    templateUrl: './landingPage/landingPage.html',
    controller: 'LandingPageCtrl'
  })
}])
.controller('LandingPageCtrl', function($scope, $http,  $sessionStorage){
	  
});