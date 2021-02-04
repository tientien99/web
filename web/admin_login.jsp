<%-- 
    Document   : admin_login
    Created on : Feb 3, 2021, 2:39:32 PM
    Author     : tienm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Admin Login</title>
            <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
            <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
            <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
      </head>
      <body>
            <!--<form method="POST" action="loginAdmin">-->
                  <div class="container">    
                        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
                              <div class="panel panel-info" >
                                    <div class="panel-heading">
                                          <div class="panel-title">Sign In</div>
                                          <!--<div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div>-->
                                    </div>     

                                    <div style="padding-top:30px" class="panel-body" >

                                          <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>

                                          <form id="loginform" class="form-horizontal" role="form" action="logiAdmin" method="POST">

                                                <div style="margin-bottom: 25px" class="input-group">
                                                      <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                      <input id="login-username" type="text" class="form-control" name="usernameLogin" value="" placeholder="username">                                        
                                                </div>

                                                <div style="margin-bottom: 25px" class="input-group">
                                                      <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                                      <input id="login-password" type="password" class="form-control" name="passwordLogin" placeholder="password">
                                                </div>
<!--                                                <div class="input-group">
                                                      <div class="checkbox">
                                                            <label>
                                                                  <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                                            </label>
                                                      </div>
                                                </div> -->
                                                <div style="margin-top:10px" class="form-group">
                                                      <!-- Button -->

                                                      <div class="col-sm-12 controls">
                                                            <button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">Login</button>
<!--                                                            <a id="btn-login" class="btn btn-success">Login  </a>
                                                            <a id="btn-fblogin" class="btn btn-primary">Login with Facebook</a>-->

                                                      </div>
                                                </div>
                                                <div class="form-group">
                                                      <div class="col-md-12 control">
                                                            <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                                                  Don't have an account! 
                                                                  <a href="#" onClick="$('#loginbox').hide(); $('#signupbox').show()">
                                                                        Sign Up
                                                                  </a>
                                                            </div>
                                                      </div>
                                                </div>    
                                          </form>     
                                    </div>                     
                              </div>  
                        </div>
                        <div id="signupbox" style="display:none; margin-top:50px" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                              <div class="panel panel-info">
                                    <div class="panel-heading">
                                          <div class="panel-title">Sign Up</div>
                                          <div style="float:right; font-size: 85%; position: relative; top:-10px"><a id="signinlink" href="#" onclick="$('#signupbox').hide(); $('#loginbox').show()">Sign In</a></div>
                                    </div>  
                                    <div class="panel-body" >
                                          <form id="signupform" class="form-horizontal" role="form" action="registerAdmin" method="POST">

                                                <div id="signupalert" style="display:none" class="alert alert-danger">
                                                      <p>Error:</p>
                                                      <span></span>
                                                </div>
                                                <div class="form-group">
                                                      <label for="username" class="col-md-3 control-label">Username</label>
                                                      <div class="col-md-9">
                                                            <input type="text" class="form-control" name="usernameRegister" placeholder="UserName">
                                                      </div>
                                                </div>

                                                <div class="form-group">
                                                      <label for="password" class="col-md-3 control-label">Password</label>
                                                      <div class="col-md-9">
                                                            <input type="password" class="form-control" name="passwordRegister" placeholder="Password">
                                                      </div>
                                                </div>
<!--                                                <div class="form-group">
                                                      <label for="lastname" class="col-md-3 control-label">Last Name</label>
                                                      <div class="col-md-9">
                                                            <input type="text" class="form-control" name="lastname" placeholder="Last Name">
                                                      </div>
                                                </div>
                                                <div class="form-group">
                                                      <label for="password" class="col-md-3 control-label">Password</label>
                                                      <div class="col-md-9">
                                                            <input type="password" class="form-control" name="passwd" placeholder="Password">
                                                      </div>
                                                </div>

                                                <div class="form-group">
                                                      <label for="icode" class="col-md-3 control-label">Invitation Code</label>
                                                      <div class="col-md-9">
                                                            <input type="text" class="form-control" name="icode" placeholder="">
                                                      </div>
                                                </div>-->

                                                <div class="form-group">
                                                      <!-- Button -->                                        
                                                      <div class="col-md-offset-3 col-md-9">
                                                            <button id="btn-signup" type="button" class="btn btn-info"><i class="icon-hand-right"></i> &nbsp Sign Up</button>
                                                      </div>
                                                </div>

<!--                                                <div style="border-top: 1px solid #999; padding-top:20px"  class="form-group">

                                                      <div class="col-md-offset-3 col-md-9">
                                                            <button id="btn-fbsignup" type="button" class="btn btn-primary"><i class="icon-facebook"></i>   Sign Up with Facebook</button>
                                                      </div>                                           

                                                </div>-->
                                          </form>
                                    </div>
                              </div>
                        </div> 
                  </div>
            <!--</form>-->
      </body>
</html>
