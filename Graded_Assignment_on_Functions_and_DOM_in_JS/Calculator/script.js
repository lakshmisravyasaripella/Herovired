let a=document.getElementsByClassName('display')[0];
function func(o){
    a.innerHTML+=o;
}
function clear(){
    a.innerHTML="";
}
function back(){
    a.innerHTML=a.innerHTML.substring(0, a.innerHTML.length - 1);
}
function equals(){
    a.innerHTML=eval(a.innerHTML);
}