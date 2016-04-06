var app=angular.module('single-page-app',['ngRoute']);
app.controller('AdminCtrlr', ['$scope', '$http', function ($scope,$http) {
	console.log('test') ;
	$scope.listeChats = [] ;
	
	$http.get("http://localhost:8080/appliWeb/rest/chats").then(function(data) {
		console.log(data) ;
		$scope.listeChats = data.data ;
	});
	
    $scope.supprimer = function(id){
    	console.log(id) ;
    	$http.post("http://localhost:8080/appliWeb/rest/chats/delete/" + id).then(function(data) {
    		 console.log('chat supprimé') ;
    		 $http.get("http://localhost:8080/appliWeb/rest/chats").then(function(data) {
    				console.log(data) ;
    				$scope.listeChats = data.data ;
    			});
    	}) ;
    	
    };
    
    
    $scope.modifier = function(chat){
    	console.log(id) ;
    	$http.post("http://localhost:8080/appliWeb/rest/chats/update/" + chat).then(function(data) {
    		 console.log('chat modifié') ;
    		 $http.get("http://localhost:8080/appliWeb/rest/chats").then(function(data) {
    				console.log(data) ;
    				$scope.listeChats = data.data ;
    			});
    	}) ;
    	
    };
        	
}]);