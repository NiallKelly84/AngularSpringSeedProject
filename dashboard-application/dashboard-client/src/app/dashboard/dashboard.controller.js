angular
    .module('app.dashboard')
    .controller('dashboardController', dashboardController);

function dashboardController($scope, DashboardService) {
    //var vm = this;
    testGetMethod();

    function testGetMethod() {
        DashboardService.getTestData();
    }
}
