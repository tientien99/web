/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$("#signup").click(function () {
      $("#first").fadeOut("fast", function () {
            $("#second").fadeIn("fast");
      });
});

$("#signin").click(function () {
      $("#second").fadeOut("fast", function () {
            $("#first").fadeIn("fast");
      });
});



$(function () {
      $("form[name='login']").validate({
            rules: {

                  email: {
                        required: true,
                        email: true
                  },
                  password: {
                        required: true,

                  }
            },
            messages: {
                  email: "Please enter a valid email address",

                  password: {
                        required: "Please enter password",

                  }

            },
            submitHandler: function (form) {
                  form.submit();
            }
      });
});



$(function () {

      $("form[name='registration']").validate({
            rules: {
                  firstname: "required",
                  lastname: "required",
                  email: {
                        required: true,
                        email: true
                  },
                  password: {
                        required: true,
                        minlength: 5
                  }
            },

            messages: {
                  firstname: "Please enter your firstname",
                  lastname: "Please enter your lastname",
                  password: {
                        required: "Please provide a password",
                        minlength: "Your password must be at least 5 characters long"
                  },
                  email: "Please enter a valid email address"
            },

            submitHandler: function (form) {
                  form.submit();
            }
      });
});

$(document).ready(function () {
      // Add minus icon for collapse element which is open by default
      $(".collapse.show").each(function () {
            $(this).prev(".card-header").find(".fa").addClass("fa-minus").removeClass("fa-plus");
      });

      // Toggle plus minus icon on show hide of collapse element
      $(".collapse").on('show.bs.collapse', function () {
            $(this).prev(".card-header").find(".fa").removeClass("fa-plus").addClass("fa-minus");
      }).on('hide.bs.collapse', function () {
            $(this).prev(".card-header").find(".fa").removeClass("fa-minus").addClass("fa-plus");
      });
});


