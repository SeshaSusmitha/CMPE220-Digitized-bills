angular.module('app.receiptsViewWithOption', ['ngRoute', 'ngStorage'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/receiptsViewWithOption', {
    templateUrl: './receiptsViewWithOption/receiptsViewWithOption.html',
    controller: 'ReceiptsViewWithOptionCtrl'
  })
}])
.controller('ReceiptsViewWithOptionCtrl', function($scope, $http,  $sessionStorage){
	  
});