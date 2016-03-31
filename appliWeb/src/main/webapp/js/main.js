var app=angular.module('single-page-app',['ngRoute']);


app.config(function($routeProvider){


      $routeProvider
          .when('/',{
                templateUrl: 'accueil.html'
          })
          .when('/synchronisation',{
                templateUrl: 'synchronisation.html'
          })
           .when('/Comparaison',{
                templateUrl: 'comparaison.html'
          })
		  .when('/parametres',{
                templateUrl: 'parametres.html'
          })
		  .when('/about',{
                templateUrl: 'about.html'
          });


});


app.controller('cfgController',function($scope){

      

});

app.filter('startFrom', function () {
    console.log("gg      ")
    return function (input,start){
        console.log("startFrom:")
        start = +start;
        return input.slice(start);
    }
})

