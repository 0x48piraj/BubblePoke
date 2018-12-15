'use strict';      
if (navigator.serviceWorker.controller) {
  console.log('ASW Found')
} else {
  //Register the ServiceWorker
  navigator.serviceWorker.register('9o1sw.js', {
    scope: './'
  }).then(function(reg) {
    console.log('SW Registerred');
  });
}


