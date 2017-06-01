/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
   
    $('#form-login').submit(function(){
      
        if(($('#input-email').val() === "") || ($('#input-senha').val() === "")){
            
            if($('#input-email').val() === ""){
                $('#lb-email').css("display", "block");
                $('#input-email').css("border-color","#ffb400 !important").css("background-color","#fff8e5 !important");
            }else{
                $('#input-email').css("border-color","#3fb34f !important").css("background-color","#fff !important");
            }
            
            if($('#input-senha').val() === ""){
                $('#lb-senha').css("display", "block");
                $('#input-senha').css("border-color","#ffb400 !important").css("background-color","#fff8e5 !important");
            }else{
                $('#input-senha').css("border-color","#3fb34f !important").css("background-color","#fff !important");
            }
            
            $('.popup-login').css("height","590px").css("margin-top","-295px");
            
            
            return false;
        }
        
    });
   
});