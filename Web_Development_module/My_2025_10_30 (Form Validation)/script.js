    document.addEventListener("DOMContentLoaded",function(){
        document.getElementById("userName").addEventListener("blur",validateUserName)
        document.getElementById("password").addEventListener("blur",validatePassword)
        document.getElementById("age").addEventListener("blur",validateAge)
        let subjects=document.getElementsByClassName("subjects")
        for(let i=0;i<subjects.length;i++) 
            subjects[i].addEventListener("blur",validateSubjects)
    })

    function validateUserName(){
        let userName=document.getElementById("userName").value
        let span=document.getElementById("userNameSpan")
        if(userName.trim().length <5){
            span.textContent="Use atleast 5 characters"
            span.style.color="red"
        }
        else{
            span.textContent="OK"
            span.style.color="green"
        }
    }

    function validatePassword(){
        let password=document.getElementById("password").value
        let span=document.getElementById("passwordSpan")
        if(password.length<=8){
            span.textContent="Use atleast 8 characters"
            span.style.color="red"
        }
        else if(!/[A-Z]/.test(password)){
            span.textContent="Use atleast 1 Uppercase Character"
            span.style.color="red"
        }
        else if(!/\d/.test(password)){
            span.textContent="Use atleast 1 Digit"
            span.style.color="red"
        }
        else{
            span.textContent="OK"
            span.style.color="green"
        }
    }

    function validateAge(){
        let age=document.getElementById("age").value
        let span=document.getElementById("ageSpan")
        if(age<=0){
            span.textContent="Use Valid Age"
            span.style.color="red"
        }
        else{
            span.textContent="OK"
            span.style.color="green"
        }
    }

    function validateSubjects(){
        let subjects=document.getElementsByClassName("subjects")
        let span=document.getElementById("subjectsSpan")
        let checkedCount=0;
        for(let i=0;i<subjects.length;i++)
            if(subjects[i].checked) checkedCount++
        
        if(checkedCount<2){
            span.textContent="Select at least 2 subjects"
            span.style.color="red"
        }
        else{
            span.textContent="OK"
            span.style.color="green"
        }
    }