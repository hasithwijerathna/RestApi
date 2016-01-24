(function(){

	var app = angular.module('myApp',[]);
	
	var mainCtrl = function($scope, $http){
				
		$scope.name = "Kamal";
		$scope.error;
		$scope.students;
		
		var onError = function(error){
			$scope.error = error;
		}
		
		var onSuccess = function(response){
			$scope.students = response.data; 
		}
		
		$http.get("http://localhost:8080/SampleDemo/rest/resource/hello").then(onSuccess, onError);
	}
	
	app.controller("mainController", mainCtrl);
}());