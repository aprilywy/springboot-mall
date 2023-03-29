/* 會員帳號登入檢查開始 */
/*function check(){
    $.ajax({
        url: "check",
        data:{"userName":$("#userName").val(),"password":$("#password").val()},
        cache:false ,
        type: "GET",
        dataType: 'text',
        success: function (msg) {
            alert(msg);
            window.location.reload();
            $('#myModalMem').modal('hide');
        },
        error: function (xhr, ajaxOptions, thrownError) {
            alert(xhr.status);
            alert(thrownError);
        }
    });
    return false;
}*/

/*function login(){
    var username = $("#input_username").val();
    var password = $("#input_password").val();
    var params = {
        username: username,
        password: password
    };
    console.log("帳號" +　username);
    console.log("密碼" +　password);
    console.log("參數" + JSON.stringify(params));

    $.ajax({
        url:"/users/login",
        type:"POST",
        contentType:"application/json; charset=utf-8",
        data:JSON.stringify({
            username:username
        }),
        success:function (data) {
            if(data  == true){
                $.ajax({
                    url:"/users/login",
                    type:"POST",
                    contentType:"application/json; charset=utf-8",
                    data:JSON.stringify({
                        username:username,
                        password:password
                    }),
                    success:function (data) {
                        if(data){
                            console.log("1" +　data)
                            window.location.href ="/product.html"
                        }else {
                            console.log("2" +　data)
                            $("#input_password").val("");
                            alert("密碼錯誤！！");

                        }
                    }
                });
            }else{
                $("#input_username").val("");
                $("#input_password").val("");
                alert("帳號不存在，請重新輸入！");
            }
        }
    });}*/
/* 會員帳號登入檢查結束 */

/* 會員帳號登入顯示開始 */
/* 	var account = $("input[name='userName']").val(); */
/* 會員帳號登入顯示結束 */

/* 會員帳號註冊檢查開始 */
// function addAccount(){
//     $.ajax({
//         url: "addAccount",
//         data:{"userName":$("#userName").val(),"email":$("#email").val(),"password":$("#password").val(),"confirmPassword":$("#confirmPassword").val()},
//         cache:false ,
//         type: "GET",
//         dataType: 'text',
//         success: function (msg) {
//             alert(msg);
//             $('#myModalReg').modal('hide');
//             window.location.reload();

            /* var result = data.trim();

        if(result == "true"){
            //alert("此帳號已被申請");
            $('#accountChkInfo').text("此帳號已被申請");
        }else if(result == "false"){
            //alert("此帳號可以申請註冊");
            $('#accountChkInfo').text("此帳號可以申請註冊");
        }else{
            $('#accountChkInfo').text("請稍後再重試");
        }
    },complete : function () {
        //location.reload();
    }, beforeSend:function(){
        $('#accountChkInfo').text("");
        var emailRegxp = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
        var accountRegExp = /^[\d|a-zA-Z]+$/;

        if (!$("input[name='regAccount']").val()) {
            alert('請填寫帳號!');
            return false;
        }

        if (accountRegExp.test($("input[name='regAccount']").val()) == false){
            alert('帳號只能為數字加英文的組合!');
            return false;
        }

        if ($("input[name='regAccount']").val().length > 50) {
            alert('帳號請填入50個字元內，小寫或大寫英文字母(a~z，A~Z)、數字(0~9)');
            return false;
        }

        if (!$("input[name='regEmail']").val()) {
            alert('請填寫email!');
            return false;
        }

        if (!$("input[name='regPassword']").val()) {
            alert('請輸入密碼!');
            return false;
        }

        if (!$("input[name='regConfirmPassword']").val()) {
            alert('請再次確認密碼!');
            return false;
        }

        if($("input[name='regPassword']").val() != $("input[name='regConfirmPassword']").val()){
            alert('兩次輸入的密碼不相同，請重新確認!');
            return false;
        }

         $('#regForm').submit();
     }
    },
    error: function (xhr, ajaxOptions, thrownError) {
        alert(xhr.status);
        alert(thrownError);
    }
});
return false;
} */
            /* 會員帳號註冊檢查結束 */


            /* 商品框架開始 */
            // function show(arry){
            //     var picPage=0;
            //     if(arry.length%3==0)
            //         picPage=   arry.length/3;
            //     else
            //         picPage=   arry.length/3+1;
            //     $('#page-selection').bootpag({
            //         maxVisible: 5,
            //         total: picPage
            //     }).on("page", function(event,  pgnum){
            //         display(arry , pgnum);
            //     });
            //     display(arry,1);
            // }
            /* 商品框架結束 */

            /* 商品內容及圖片開始 */
            // function display(arry,num){
            //
            //     var index= (num-1)*3
            //     $("#img1").attr("src", arry[index].photo);
            //     $("#t1").text(arry[index].productName);
            //     $("#d1").text(arry[index].description);
            //     $("#p1").text(arry[index].price);
            //     $("#h1").attr("href", "cart/buy/"+arry[index].id);
            //     $("#img2").attr("src", arry[index+1].photo);
            //     $("#t2").text(arry[index+1].productName);
            //     $("#d2").text(arry[index+1].description);
            //     $("#p2").text(arry[index+1].price);
            //     $("#h2").attr("href", "cart/buy/"+arry[index+1].id);
            //     $("#img3").attr("src", arry[index+2].photo);
            //     $("#t3").text(arry[index+2].productName);
            //     $("#d3").text(arry[index+2].description);
            //     $("#p3").text(arry[index+2].price);
            //     $("#h3").attr("href", "cart/buy/"+arry[index+2].id);
            // }
            // function start(){
            //     $.ajax({
            //         url: "hbpicture",
            //         cache:false ,
            //         type: "GET",
            //         dataType: 'json',
            //         success: function (objArry) {
            //             show(objArry);
            //         },
            //         error: function (xhr, ajaxOptions, thrownError) {
            //             alert(xhr.status);
            //             alert(thrownError);
            //         }
            //     });
            // }
            // $(document).ready(start);
            /* 商品內容及圖片結束 */
// var pts=[ ];
// function add(){
//     var obj=new Object();
//     obj.id=$("#inputId").val();
//     obj.name=$("#inputName").val();
//     obj.photo=$("#inputPhoto").val();
//     obj.price=$("#inputPrice").val();
//     pts.push(obj);
//     var str=JSON.stringify(obj);
//     alert(str);
// }
// function send(){
//     var str=JSON.stringify(pts);
//     $.ajax({
//         url: "pts",
//         cache:false ,
//         contentType:"application/json",
//         data: JSON.stringify(pts),
//         type: "POST",
//         dataType: 'html',
//         success: function (msg) {
//             alert(msg);
//         },
//         error: function (xhr, ajaxOptions, thrownError) {
//             alert(xhr.status);
//             alert(thrownError);
//         }
//     });
// }
// function start(){
//     //alert('jQuery start');
// }
// $(document).ready(start);


