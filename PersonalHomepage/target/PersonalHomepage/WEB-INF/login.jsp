<%--
  Created by IntelliJ IDEA.
  User: dongmengyuan
  Date: 17-8-14
  Time: 上午8:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta content="initial-scale=1.0,user-scalable=no,maximum-scale=1,width=device-width" name="viewport" />
    <meta content="initial-scale=1.0,user-scalable=no,maximum-scale=1" media="(device-height: 568px)" name="viewport">
    <meta content="yes" name="apple-mobile-web-app-capable" />
    <meta content="black" name="apple-mobile-web-app-status-bar-style" />
    <meta content="telephone=no" name="format-detection" />
    <title>登录页面</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            color: #666;
            background: #c1d2fe;
            font-family: Verdana, sans-serif
        }

        .form_login {
            max-width: 640px;
            margin: auto;
            text-align: center;
            padding-top: 100px;
        }

        .form-group {
            width: 355px;
            margin: 0 auto;
            height: 50px;
            margin-bottom: 20px;
        }

        .form-group .fa {
            display: block;
            width: 50px;
            height: 50px;
            float: left;
        }

        .form-group .form-control {
            display: block;
            width: 300px;
            height: 48px;
            float: left;
            border: 1px solid #ccc;
            padding: 0;
            margin-left: 0;
            text-indent: 1em;
            themeColor: #00a988;
        }

        .form-group .form-control:hover {
            border: 1px solid #0160A0;
        }

        .form-group .checkfont {
            color: #666;
        }

        .form-group .btn {
            width: 350px;
            height: 50px;
            background-color: #0160A0;
            border: 0px;
            color: #fff;
            font-size: 14px;
        }

        .fa-user {
            background: url(http://hovertree.com/texiao/mobile/10/images/user.png) no-repeat center;
        }

        .fa-key {
            background: url(http://hovertree.com/texiao/mobile/10/images/pw.png) no-repeat center;
        }

        .hovertree_form_footer {
            margin-top: 100px;
            font-size: 14px;
            color: #5B809A;
        }
        }
    </style>
</head>

<body>
<form action="index.do" method="post">
<div class="form_login">
    <div class="form_logo">
        <br />
        个人主页
    </div>
    <form method="post" role="form" id="form_login">

        <div class="form-group">
            <i class="fa fa-user"></i>
            <input type="text" class="form-control" name="username" id="username" placeholder="Username" autocomplete="off">
        </div>

        <div class="form-group">
            <i class="fa fa-key"></i>
            <input type="password" class="form-control" name="password" id="password" placeholder="Password" autocomplete="off">
        </div>


        <div class="form-group" style="height:25px; line-height:25px; text-align:left;">
            <input type="checkbox" class="" name="checkbox" id="checkbox" placeholder="checkbox" autocomplete="off">
            <label class="checkfont" for="checkbox" >记住我的帐号</label>
        </div>

        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block btn-login">登录</button>

        </div>

    </form>
    <div class="hovertree_form_footer">&copy; dongmengyaun</div>
</div>
</form>
</body>
</html>