let email = document.querySelector(".user_email");
let passwd = document.querySelector(".user_passwd");

function checkfrm() {
  if(email.value == "") {
    alert("아이디(이메일)를 입력해 주세요.");
    email.focus();
    return false;
  }
  if(passwd.value == "") {
    alert("비밀번호를 입력해 주세요.");
    passwd.focus();
    return false;
  }
}