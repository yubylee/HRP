var currentTime;
var hours;
var minutes;
var seconds;

function updateCurrentTime() {
  currentTime = new Date();
  hours = currentTime.getHours();
  minutes = currentTime.getMinutes();
  seconds = currentTime.getSeconds();

  var currentTimeElement = document.getElementById("currentTime");
  currentTimeElement.textContent = "현재시간: " + hours + "시 " + minutes + "분 " + seconds + "초";
}

function markAttendance() {
  var button = document.getElementById("attendanceButton");
  var timeElement = document.getElementById("attendanceTime");

  if (button.textContent === "출석") {
    currentTime = new Date();
    hours = currentTime.getHours();
    minutes = currentTime.getMinutes();

    var formattedTime = hours + "시 " + minutes + "분";
    timeElement.textContent = "출석시간: " + formattedTime;

    button.textContent = "퇴근";
  } else {
    currentTime = new Date();
    hours = currentTime.getHours();
    minutes = currentTime.getMinutes();

    var formattedTime = hours + "시 " + minutes + "분";
    timeElement.textContent = "퇴근시간: " + formattedTime;

    button.textContent = "출석";
  }
}

setInterval(updateCurrentTime, 1000);