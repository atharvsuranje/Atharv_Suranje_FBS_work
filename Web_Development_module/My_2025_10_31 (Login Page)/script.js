let isUserNameValid=false
let isPasswordValid=false

document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("userName").addEventListener("blur", validateUserName)
    document.getElementById("password").addEventListener("blur", validatePassword)
    document.getElementById("loginBtn").addEventListener("click", validateUser)
})

function validateUserName() {
    let userName = document.getElementById("userName").value
    let span = document.getElementById("userNameSpan")
    if (userName.trim().length < 5) {
        isUserNameValid=false
        toggleLoginButton()
        span.textContent = "Invalid Username"
        span.style.color = "red"
        document.getElementById("userName").style.borderColor = "red"
    }
    else {
        isUserNameValid=true
        toggleLoginButton()
        span.textContent = ""
        span.style.color = ""
        document.getElementById("userName").style.borderColor = ""
    }
}

function validatePassword() {
    let password = document.getElementById("password").value
    let span = document.getElementById("passwordSpan")
    if (password.length < 5) {
        isPasswordValid=false
        toggleLoginButton()
        span.textContent = "Invalid Password"
        span.style.color = "red"
        document.getElementById("password").style.borderColor = "red"
    }
    else {
        isPasswordValid=true
        toggleLoginButton()
        span.textContent = ""
        span.style.color = ""
        document.getElementById("password").style.borderColor = ""
    }
}

function toggleLoginButton(){
    let loginBtn=document.getElementById("loginBtn")
    if(isUserNameValid && isPasswordValid) 
        loginBtn.disabled=false
    else 
        loginBtn.disabled=true
}

function validateUser(){
    let users=getData()
    let userName=document.getElementById("userName").value
    let password=document.getElementById("password").value

    for(let i=0;i<users.length;i++){
        if(userName == users[i].username && password == users[i].password){
            localStorage.setItem("user",JSON.stringify(users[i]))
            window.location.href = "homepage.html"
            return;
        }
    }
    alert("Invalid Credientails")
    window.location.href="index.html"
}

function getData() {
    return [
        {
            username: "atharv123",
            password: "12345",
            name: "Atharv Suranje",
            email: "atharv@example.com",
            rollno: 101,
            marks: {
                english: 88,
                physics: 92,
                chemistry: 85,
                maths: 95,
                bio: 78
            }
        },
        {
            username: "kevin_brown",
            password: "kevin@1234",
            name: "Kevin Brown",
            email: "kevin@example.com",
            rollno: 102,
            marks: {
                english: 75,
                physics: 80,
                chemistry: 78,
                maths: 70,
                bio: 82
            }
        },
        {
            username: "rachel_w",
            password: "rachel@1234",
            name: "Rachel Williams",
            email: "rachel@example.com",
            rollno: 103,
            marks: {
                english: 91,
                physics: 89,
                chemistry: 93,
                maths: 87,
                bio: 90
            }
        },
        {
            username: "david_smith",
            password: "david@1234",
            name: "David Smith",
            email: "david@example.com",
            rollno: 104,
            marks: {
                english: 82,
                physics: 84,
                chemistry: 80,
                maths: 89,
                bio: 75
            }
        },
        {
            username: "sophia_j",
            password: "sophia@1234",
            name: "Sophia Johnson",
            email: "sophia@example.com",
            rollno: 105,
            marks: {
                english: 95,
                physics: 90,
                chemistry: 92,
                maths: 94,
                bio: 89
            }
        }
    ];
}
