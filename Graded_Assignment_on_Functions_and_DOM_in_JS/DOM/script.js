function onparaOver(){
    document.getElementById('p1').style.color='red';
}
function onparaOut(){
    document.getElementById('p1').style.color='black';
}
function onbtnOver(){
    document.getElementById('btn').innerHTML='Click Now';
}
function onbtnOut(){
    document.getElementById('btn').innerHTML='Hello!';
}
function paragraph(){
    let a=document.getElementById('txt').value;
    document.getElementById('p1').innerHTML=a;
}
function onlistOver1(){
    let b=document.getElementById('item1');
    b.style.color='red';
    b.style.fontWeight='bold';
}
function onlistOut1(){
    let b=document.getElementById('item1');
    b.style.color='black';
    b.style.fontWeight='normal';
}
function onlistOver2(){
    let b=document.getElementById('item2');
    b.style.color='yellow';
    b.style.fontWeight='bold';
}
function onlistOut2(){
    let b=document.getElementById('item2');
    b.style.color='black';
    b.style.fontWeight='normal';
}
function onlistOver3(){
    let b=document.getElementById('item3');
    b.style.color='green';
    b.style.fontWeight='bold';
}
function onlistOut3(){
    let b=document.getElementById('item3');
    b.style.color='black';
    b.style.fontWeight='normal';
}