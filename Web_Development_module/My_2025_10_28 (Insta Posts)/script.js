function showPosts(){
    document.getElementById("btn").style.display="none";
    posts=getData().posts
    str=""
    for(let i=0;i<posts.length;i++){
        str+=`<div class="post">
        <div class="header">
            <div class="profilePic">
                <img src="${posts[i].profilePic}" alt="">
            </div>
            <div class="details">
                <div class="userName">
                    <p>${posts[i].userName}</p>
                </div>
                <div class="location">
                    <p>${posts[i].location}</p>
                </div>
            </div>
            <div class="menu">
                <img src="svg/ellipsis-vertical-solid.svg"></img>
            </div>
        </div>

        <div class="postPic">
            <img src="${posts[i].postPic}" alt="">
        </div>

        <div class="utilities">
            <div class="LCS">
                <img src="svg/heart-regular.svg" alt="" class="like">
                <img src="svg/comment-regular.svg" alt="">
                <img src="svg/instagram-share-icon.svg" alt="">
            </div>
            <div class="save">
                <img src="svg/bookmark-regular.svg" alt="">
            </div>
        </div>

        <div class="likedBy">
            <p>Liked By ${posts[i].likedBy[0]} and ${posts[i].likes-1} others</p>
        </div>

        <div class="caption">
            <p>${posts[i].caption}</p>
        </div>
    </div>`
    }
    document.getElementsByClassName("main")[0].innerHTML=str
}

function getData() {
    return {
        "posts": [
            {
                "userName": "jessica_lee",
                "location": "New York, USA",
                "profilePic": "https://images.unsplash.com/photo-1535713875002-d1d0cf377fde",
                "postPic": "https://images.unsplash.com/photo-1506744038136-46273834b3fb",
                "caption": "Chasing sunsets 🌇",
                "likes": 412,
                "likedBy": ["mike_anderson", "sophie_clark"],
                "comments": 25,
                "saved": false,
                "timePosted": "2 hours ago"
            },
            {
                "userName": "daniel_ross",
                "location": "Paris, France",
                "profilePic": "https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e",
                "postPic": "https://images.unsplash.com/photo-1502602898657-3e91760cbb34",
                "caption": "Morning coffee hits different in Paris ☕️🇫🇷",
                "likes": 589,
                "likedBy": ["amy_taylor", "luke_morris"],
                "comments": 48,
                "saved": true,
                "timePosted": "5 hours ago"
            },
            {
                "userName": "maria_gomez",
                "location": "Barcelona, Spain",
                "profilePic": "https://images.unsplash.com/photo-1544005313-94ddf0286df2",
                "postPic": "https://images.unsplash.com/photo-1507525428034-b723cf961d3e",
                "caption": "Beach days are the best days 🏖️",
                "likes": 732,
                "likedBy": ["carl_roberts", "emma_white"],
                "comments": 61,
                "saved": true,
                "timePosted": "1 day ago"
            },
            {
                "userName": "kevin_brown",
                "location": "Tokyo, Japan",
                "profilePic": "https://images.unsplash.com/photo-1506794778202-cad84cf45f1d",
                "postPic": "https://images.unsplash.com/photo-1601042879364-f3947d3f9c16?ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&q=80&w=1974",
                "caption": "Neon nights and city lights 🌃",
                "likes": 1024,
                "likedBy": ["lucy_hall", "andrew_miller"],
                "comments": 77,
                "saved": false,
                "timePosted": "2 days ago"
            },
            {
                "userName": "olivia_smith",
                "location": "Sydney, Australia",
                "profilePic": "https://images.unsplash.com/photo-1544723795-3fb6469f5b39",
                "postPic": "https://images.unsplash.com/photo-1500530855697-b586d89ba3ee",
                "caption": "Woke up to this view 🌅💛",
                "likes": 845,
                "likedBy": ["ryan_lee", "isabella_jones"],
                "comments": 58,
                "saved": true,
                "timePosted": "3 days ago"
            }
        ]
    }
}