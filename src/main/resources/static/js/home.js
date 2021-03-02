window.onload = function () {
    var selectedItem = document.getElementById("change_button"); // 아이디가 "change_button"인 요소를 선택함.
    selectedItem.style.color = "red"; //시작하자마자 blue -> red로 변경 

    document.getElementById("change_button").onclick = function(e){
        alert('hello world!')
    } 

    
}