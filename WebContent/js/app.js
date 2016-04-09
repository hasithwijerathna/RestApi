(function(){

	var app = angular.module("restApp",[]);
	
	var mainCtrl = function($scope, $http){
				
		$scope.name = "Kamal";
		$scope.students;
		
		var onError = function(error){
			$scope.error = error;
		}
		
		var id = null;
		
		document.getElementById("btn_search").onclick = function(){
			id = document.getElementById("student_id").value;
			alert(id);
		};		
		
		var onSuccess = function(response){
			$scope.students = response.data; 
		}
		
		//id = $("#id").val();
		$http.get("http://localhost:8080/SampleDemo/rest/resource/all").then(onSuccess, onError);
			
		
	}
	app.controller("mainController", mainCtrl);	
})();



function myFunction(){
	var id = document.getElementById("student_id").value;
	alert(id);
}

