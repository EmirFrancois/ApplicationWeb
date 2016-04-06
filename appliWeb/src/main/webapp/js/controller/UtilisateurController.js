var app=angular.module('single-page-app',['ngRoute']);
app.controller('UtilisateurCtrlr', ['$scope', '$http', function ($scope,$http) {
	console.log('test') ;
$scope.listeChats = [] ;
	
	$http.get("http://localhost:8080/appliWeb/rest/chats").then(function(data) {
		console.log(data) ;
		$scope.listeChats = data.data ;
	});
        	
}]) ;