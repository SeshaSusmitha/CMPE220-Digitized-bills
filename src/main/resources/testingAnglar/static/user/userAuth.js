'use strict';

angular.module('app', ['ngRoute', 'ngStorage'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/userAuth', {
    templateUrl: './user/userAuth.html',
    controller: 'UserAuthCtrl'
  });
}])

.controller('UserAuthCtrl', function($scope, $http,  $sessionStorage) {
    $scope.invalid_login = true;
  	$scope.unexpected_error = true;
    $scope.registerSuccess = true;
    
    $scope.twitterLogin = function(){
    	$http({
    		method : "GET",
    		url : '/user/twitter'
    	}).success(function(data){
    		if (data.statusCode == 401) {
  				$scope.invalid_login = false;
  				$scope.unexpected_error = true;
  			} else{
  				
  				//window.location.assign("/#users");
  			}
    	}).error(function(error){
    		$scope.unexpected_error = false;
  			$scope.invalid_login = true;
    	});
    };

  	$scope.signIn = function() {
      console.log($scope.email);
      console.log($scope.password);
  		$http({
  			method : "POST",
  			url : '/users/create',
  			data : {
  				"email" : $scope.email,
  				"password" : $scope.password
  			}
  		}).success(function(data) {
  			// checking the response data for statusCode

  			if (data.statusCode == 401) {
  				$scope.invalid_login = false;
  				$scope.unexpected_error = true;
  			} else{
  				// Making a get call to the '/redirectToHomepage' API
          $sessionStorage.user = data.user;
  				window.location.assign("/#users");
        }
  		}).error(function(error) {
  			$scope.unexpected_error = false;
  			$scope.invalid_login = true;
  		});
  	};

    $scope.register = function() {

		$http({
			method : "POST",
			url : '/register',
			data : {
				"fullname" : $scope.fullname,
				"email" : $scope.email,
				"phoneNumber" : $scope.phoneNumber,
				"password" : $scope.password,
				"confirmPassword" : $scope.confirmPassword,
        "usertype": $scope.usertype
			}
		}).success(function(data) {
			// checking the response data for statusCode
			// Making a get call to the '/redirectToHomepage' API
      $sessionStorage.user = data.user;
			window.location.assign("/#users");
		}).error(function(error){
      $scope.registerSuccess = false;
			$scope.unexpected_error = false;
		});
	};



});