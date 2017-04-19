
angular.module('app', ['ngRoute','ngResource', 'app.userAuth', 'app.dashboard','app.landingPage','app.receiptsView','app.receiptsViewWithOption','app.splitItem','app.splitTotal'])
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
  .when('/receiptsView', {
	templateUrl: './receiptsView/receiptsView.html',
	controller: 'ReceiptsViewCtrl'
  })
  .when('/receiptsViewWithOption', {
	templateUrl: './receiptsViewWithOption/receiptsViewWithOption.html',
	controller: 'ReceiptsViewWithOptionCtrl'
  }) 
  .when('/splitItem', {
	templateUrl: './splitItem/splitItem.html',
	controller: 'SplitItemCtrl'
  }) 
  .when('/splitTotal', {
	templateUrl: './splitTotal/splitTotal.html',
	controller: 'SplitTotalCtrl'
  }) 
  
});
