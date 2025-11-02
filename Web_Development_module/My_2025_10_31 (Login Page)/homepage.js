const user=JSON.parse(localStorage.getItem("user"))

document.addEventListener("DOMContentLoaded",function(){
    document.getElementById("name").textContent=user.name
    document.getElementById("details").addEventListener("click",toggleDetails)
    document.getElementById("marks").addEventListener("click",toggleMarks)
    document.getElementById("percentage").addEventListener("click",togglePercentage)
})

function toggleDetails(){
    const details=document.getElementById("detailsSpan")
    const btn=document.getElementById("details")

    if(details.innerHTML === ""){
        showDetails()
        btn.textContent="Hide Details"
    }
    else{
        details.innerHTML=""
        btn.textContent="Show Details"
    }
}

function showDetails(){
    document.getElementById("detailsSpan").innerHTML=
    `<h4>Details</h4>
    Name : ${user.name} <br>
    Username : ${user.username}<br>
    Email : ${user.email}<br>
    Roll No : ${user.rollno}`
}

function toggleMarks(){
    const marks=document.getElementById("marksSpan")
    const btn=document.getElementById("marks")

    if(marks.innerHTML === ""){
        showMarks()
        btn.textContent="Hide Marks"
    }
    else{
        marks.innerHTML=""
        btn.textContent="Show Marks"
    }
}

function showMarks(){
    document.getElementById("marksSpan").innerHTML=
    `<h4>Marks</h4>
    English : ${user.marks.english} <br>
    Physics : ${user.marks.physics}<br>
    Chemistry : ${user.marks.chemistry}<br>
    Mathematics : ${user.marks.maths}<br>
    Biology: ${user.marks.bio}`
}

function togglePercentage(){
    const percentage=document.getElementById("percentageSpan")
    const btn=document.getElementById("percentage")

    if(percentage.innerHTML === ""){
        showPercentage()
        btn.textContent="Hide Percentage"
    }
    else{
        percentage.innerHTML=""
        btn.textContent="Show Percentage"
    }
}

function showPercentage(){
    let total= user.marks.english + user.marks.physics + user.marks.chemistry + user.marks.maths + user.marks.bio
    let percentage=(total*100)/500
    document.getElementById("percentageSpan").innerHTML=
    `<h4>Percentage : ${percentage}</h4>`
}