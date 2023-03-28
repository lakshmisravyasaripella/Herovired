ques = [
    {
        question:"What is the date of birth of Virat Kohli?",
        options:['5 November 1988','6 December 1987','7 November 1988','8 December 1987'],
        ans:0
    },
    {
        question:"What is the Jersey number of Virat Kohli?",
        options:['8','18','9','100'],
        ans:1
    },
    {
        question:"Which year did Virat Kohli receive the Arjuna Award?",
        options:['2018','2013','2009','2012'],
        ans:1
    },
    {
        question:"Which year Virat Kohli made his T20 debut?",
        options:['2008','2009','2010','2011'],
        ans:2
    },
    {
        question:"Which award did Virat Kohli received in 2018?",
        options:['Padma Shri','Arjuna Award','Rajiv Gandhi Khel Ratna','Bharat Ratna'],
        ans:2
    }
]
let c = 0;
let question = document.querySelector('.ques');
let button = document.querySelector('#submit');
let option = document.querySelector('.option');
let ind = 0;
let user = '';
button.addEventListener('click',()=>{
    if(user === ques[ind].ans)
        c+=1;
    ind++;
    user = "";
    question.innerHTML = '';
    option.innerHTML = '';
    next();
})
let next = ()=>{
    if(ind == 5){
        document.querySelector('.body').innerHTML = '<h1 style="color:green">Result</h1><br/><span>'+c+'/5</span><br><button onclick="window.location.reload()">Restart</button>';
        return "";
    }
    question.innerHTML = ques[ind].question;
    ques[ind].options.forEach((ele,i)=>{
        option.innerHTML+="<div class='ans'> <input type='radio' name='opt' id='opt"+i+"'/><label for='opt"+i+"'>  "+ele+"</label></div> <br/>";
    })
    let ans = document.querySelectorAll('.ans')
    ans.forEach((ele,i)=>{
        ele.addEventListener('click',()=>{
            user = i;
        })
    })
}
next();