<%-- 
    Document   : home_student
    Created on : Feb 1, 2021, 9:15:29 PM
    Author     : tienm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Student Page</title>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
            <link rel="stylesheet" href="style/home_student.css"/>
            <% String userName = (String) request.getAttribute("username");%>
      </head>
      <body>
            <div>
                  <div class="header-blue">
                        <nav class="navbar navbar-light navbar-expand-md navigation-clean-search">
                              <div class="container-fluid"><a class="navbar-brand" href="#">BBBOOTSTAP</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
                                    <div class="collapse navbar-collapse" id="navcol-1">
                                          <ul class="nav navbar-nav">
                                                <li class="nav-item" role="presentation"><a class="nav-link" href="#">Contact</a></li>
                                                <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#">Services</a>
                                                      <div class="dropdown-menu" role="menu"><a class="dropdown-item" role="presentation" href="change_pass_student.jsp">Change Password</a><a class="dropdown-item" role="presentation" href="#">Mark Report</a><a class="dropdown-item" role="presentation" href="#">Attendance report</a></div>
                                                </li>
                                          </ul>
                                          
                                          <form class="form-inline mr-auto" target="_self">
                                                <div class="form-group"><label for="search-field"><i class="fa fa-search text-white"></i></label><input class="form-control search-field" type="search" id="search-field" name="search"></div>
                                          </form>
                                          <span>Wellcome  <%=userName%> </span><span style="color: #EE5C42">,./</span>
                                          <a  href="index.html">Logout</a>
                                    </div>
                              </div>
                        </nav>
                        <div id="demo" class="carousel slide" data-ride="carousel">

                              <!-- Indicators -->
                              <ul class="carousel-indicators">
                                    <li data-target="#demo" data-slide-to="0" class="active"></li>
                                    <li data-target="#demo" data-slide-to="1"></li>
                                    <li data-target="#demo" data-slide-to="2"></li>
                              </ul>

                              <!-- The slideshow -->
                              <div class="carousel-inner">
                                    <div class="carousel-item active">
                                          <img src="images/first.jpg" alt="Los Angeles" width="110" height="500"><a href="https://laodong.vn/y-te/mot-chuyen-gia-dau-khi-nguoi-nga-mac-covid-19-821011.ldo"/>
                                    </div>
                                    <div class="carousel-item">
                                          <img src="images/second.jpg" alt="Chicago" width="110" height="500">
                                    </div>
                                    <div class="carousel-item">
                                          <img src="images/thrith.jpg" alt="New York" width="110" height="500">
                                    </div>
                              </div>

                              <!-- Left and right controls -->
                              <a class="carousel-control-prev" href="#demo" data-slide="prev">
                                    <span class="carousel-control-prev-icon"></span>
                              </a>
                              <a class="carousel-control-next" href="#demo" data-slide="next">
                                    <span class="carousel-control-next-icon"></span>
                              </a>
                        </div> 

                        <nav aria-label="breadcrumb">
                              <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                                    <li class="breadcrumb-item"><a href="#">Library</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Data</li>
                              </ol>
                        </nav>
                  </div>
            </div>
      </body>
</html>
