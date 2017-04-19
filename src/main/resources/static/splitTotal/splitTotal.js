angular.module('app.splitTotal', ['ngRoute', 'ngStorage'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/splitTotal', {
    templateUrl: './splitTotal/splitTotal.html',
    controller: 'SplitTotalCtrl'
  })
}])
.controller('SplitTotalCtrl', function($scope, $http,  $sessionStorage){
	  
});