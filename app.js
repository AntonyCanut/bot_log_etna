var exec = require('child_process').exec;

var minutes = Math.floor((Math.random() * 30) + 1);
function myFunction() {
    exec('svn up ./js/bertea_e', function(error, stdout, stderr) {
            var myDate = new Date();
            console.log('=====================');
            console.log(stdout);
            if (error !== null) {
                console.log('exec error: ' + error);
            }
            console.log('Temps de log réalisé à : ' + myDate.getHours() + 'h' + ((myDate.getMinutes() <= 9) ? ('0'+ myDate.getMinutes()) : (myDate.getMinutes())));
            console.log('=====================');
            minutes = Math.floor((Math.random() * 30) + 1);
            console.log('Prochain temps de log automatique dans ' + minutes + ' minutes.');
	    clearInterval(refreshIntervalId);
            refreshIntervalId =setInterval(myFunction, minutes * 60000);
        });
}

console.log('Démmarage de la session de travail ETNA.');
myFunction();
var refreshIntervalId = setInterval(myFunction, minutes * 60000);
