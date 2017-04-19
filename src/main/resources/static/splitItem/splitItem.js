angular.module('app.splitItem', ['ngRoute', 'ngStorage'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/splitItem', {
    templateUrl: './splitItem/splitItem.html',
    controller: 'SplitItemCtrl'
  })
}])
.controller('SplitItemCtrl', function($scope, $http,  $sessionStorage){
	  
});