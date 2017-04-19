angular.module('app.receiptsView', ['ngRoute', 'ngStorage'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/receiptsView', {
    templateUrl: './receiptsView/receiptsView.html',
    controller: 'ReceiptsViewCtrl'
  })
}])
.controller('ReceiptsViewCtrl', function($scope, $http,  $sessionStorage){
	  
});