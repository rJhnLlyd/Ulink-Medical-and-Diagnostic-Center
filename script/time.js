/**
 * 
 */
 var today = new Date();  /* new date object */
    var date = today.getDate() + ' / ' + (today.getMonth() + 1) + ' / ' + today.getFullYear();
    /* display current date */
    document.getElementById("currentDate").innerHTML = date;
 
    /* Auto refreshing clock time */
    function startTime() {
      var today = new Date(); /* new date object */
      /* getting minutes hours and seconds from date object */
      var hours = today.getHours();
      var minutes = today.getMinutes();
      var seconds = today.getSeconds();
      /* 12 hour time formate */
      var amPm = "AM";
      if ( hours > 13 ) {
        amPm = "PM";
        hours = hours-12;
      }
      /* put zero before numbers < 10 */
      if (minutes < 10) {
        minutes = "0" + minutes;
      }
      if (seconds < 10) {
        seconds = "0" + seconds;
      }
 
      var time = hours + ' : ' + minutes + ' : ' + seconds + '  ' + amPm;
       /* display current time */
       document.getElementById("currentTime").innerHTML = time;
 
       /* Auto refreshing time every 1 second */
       setTimeout(function(){startTime()}, 1000 );
 
       /* Time with date and current location */
       document.getElementById("DateTime").innerHTML = today;
 
    }