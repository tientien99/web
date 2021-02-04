<%-- 
    Document   : change_pass_student
    Created on : Feb 2, 2021, 10:20:52 AM
    Author     : tienm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Student Change Password</title>
            <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
            <link href="style/change_pass_student.css" type="text/javascript" rel="stylesheet"/>
            <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
            <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
            <script src="js/change_pass_student.js"></script>
      </head>
      <body>
            <form action="changePassStudent" method="POST">
                  <div class="container">
                        <div class="row">
                              <div class="col-sm-4">
                                    <label>Current Password</label>
                                    <div class="form-group pass_show"> 
                                          <input type="password" name="oldPass" value="" class="form-control" placeholder="Current Password">
                                    </div> 
                                    <label>New Password</label>
                                    <div class="form-group pass_show"> 
                                          <input type="password" name="newPass" value="" class="form-control" placeholder="New Password">
                                    </div> 
                                    <label>Confirm Password</label>
                                    <div class="form-group pass_show"> 
                                          <input type="password" name="cfPass" value="" class="form-control" placeholder="Confirm Password"/>
                                    </div>
                                    <input type="submit" name="Change" value="Change" />
                                    <div> <a href="home_student.jsp">Back</a>
                                    </div>
                              </div>
                        </div>
            </form>
      </body>
</html>
