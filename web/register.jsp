<%-- 
    Document   : register
    Created on : Feb 1, 2021, 5:05:14 PM
    Author     : tienm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Student Register</title>
            <link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
            <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
            <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
            <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
            <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
      </head>
      <body>
            <div id="second">
                  <div class="myform form ">
                        <div class="logo mb-3">
                              <div class="col-md-12 text-center">
                                    <h1 >Signup</h1>
                              </div>
                        </div>
                        <form action="registerStudent" name="registration" method="POST">                              
                              
                              <div class="form-group">
                                    <label for="exampleInputEmail1">Tên Tài Khoản</label>
                                    <input type="text"  name="acc" class="form-control" id="lastname" aria-describedby="emailHelp" placeholder="Tên tài khoản">
                              </div>
                              <div class="form-group">
                                    <label for="exampleInputEmail1">Mật khẩu</label>
                                    <input type="password"  name="pass" class="form-control" id="lastname" aria-describedby="emailHelp" placeholder="Mật khẩu">
                              </div>
                              <div class="form-group">
                                    <label for="exampleInputEmail1">Trạng thái</label>
                                    <input type="text"  name="status" class="form-control" id="lastname" aria-describedby="emailHelp" value="1" readonly="true">
                              </div>
                              <div class="col-md-12 text-center mb-3">
                                    <button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">Đăng ký</button>
                              </div>
                              <div class="col-md-12 ">
                                    <div class="form-group">
                                          <p class="text-center"><a href="index.html" id="signin">Already have an account?</a></p>
                                    </div>
                              </div>
                  </div>
            </form>
      </div>
</body>
</html>
