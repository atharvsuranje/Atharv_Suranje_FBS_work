let isMobileNoValid=false
let isOtpValid=false
let timer=null
const otp=1234

document.addEventListener("DOMContentLoaded", function () {
    const sendOtpBtn = document.getElementById("sendOtpBtn");
    const verifyOtpBtn =document.getElementById("verifyOtpBtn")
    document.getElementById("mobileNo").addEventListener("blur", validateMobileNo)
    document.getElementById("otp").addEventListener("blur", validateOtp)
    sendOtpBtn.addEventListener("click",validate)
    verifyOtpBtn.addEventListener("click",verifyOtp)
})

function toggleLoginButton(){
    let sendOtpBtn = document.getElementById("sendOtpBtn");
    sendOtpBtn.disabled = !isMobileNoValid;
}

function validateMobileNo(){
    let mobileNo=document.getElementById("mobileNo")
    let span=document.getElementById("mobileNoSpan")
    const indianMobileRegex = /^(?:\+?91[\s-]?|0)?[6-9]\d{9}$/;
    if (indianMobileRegex.test(mobileNo.value)) {
        isMobileNoValid = true;
        span.textContent = "";
        span.style.color = "";
        mobileNo.style.borderColor = "";
    }
    else {
        isMobileNoValid = false;
        span.textContent = "Invalid mobile number";
        span.style.color = "red";
        mobileNo.style.borderColor = "red";
    }
    toggleLoginButton()
}

function validateOtp(){
    let otp=document.getElementById("otp")
    let span=document.getElementById("otpSpan")

    if (otp.value.trim().length == 4) {
        isOtpValid = true;
        span.textContent = "";
        span.style.color = "";
        otp.style.borderColor = "";
    }
    else {
        isOtpValid = false;
        span.textContent = "Invalid Otp";
        span.style.color = "red";
        otp.style.borderColor = "red";
    }
    toggleLoginButton()
}

function validate(){
    document.getElementById("otpLabel").style.display = "block";
    document.getElementById("otp").style.display = "block";
    document.getElementById("otpSpan").style.display = "inline";
    document.getElementById("verifyOtpBtn").style.display = "block";
    startOtpTimer()
}

function startOtpTimer(){
    let sendOtpBtn = document.getElementById("sendOtpBtn")
    let timerSpan = document.getElementById("timerSpan");
    let time=10
    sendOtpBtn.disabled=true;
    sendOtpBtn.textContent = "OTP Sent";

    timerSpan.style.display = "block";
    timerSpan.textContent = `Resend OTP in ${time} seconds`;

    timer = setInterval(() => {
        time--
        if(time>0) timerSpan.textContent=`Resend OTP in ${time} seconds`
        else{
            clearInterval(timer)
            timerSpan.textContent = "";
            sendOtpBtn.textContent="Resend OTP"
            sendOtpBtn.disabled=false
        }
    },1000)
}

function verifyOtp(){
    let otpInput=document.getElementById("otp")
    if(otpInput.value == otp){
        let span=document.getElementById("verifyOtpSpan")
        span.textContent="OTP Verified"
        span.style.color = "green";
    }
    else{
        span.textContent=""
    }
}