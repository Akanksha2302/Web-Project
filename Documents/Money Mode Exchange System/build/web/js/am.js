function aswer()
{
    var name=document.f1.t1.value;
    var email=document.f1.t2.value;
    var phone=document.f1.t3.value;
    var msg=document.f1.t4.value;
    var ll=/^[a-zA-Z ]+$/;
    var patt=/^[a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if(ll.test(name)=== false){
        alert("Invalid Name");
        return false;
    }
    else if(patt.test(email)=== false){
        alert("Invalid E-Mail");
        return false;
    }
    else if(isNaN(phone) || phone.length!==10){  
        alert("Invalid Mobile number");
        return false; 
    }
    else{
        return true;
    }
    
}
