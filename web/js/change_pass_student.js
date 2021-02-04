/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
      $('.pass_show').append('<span class="ptxt">Show</span>');
});


$(document).on('click', '.pass_show .ptxt', function () {

      $(this).text($(this).text() == "Show" ? "Hide" : "Show");

      $(this).prev().attr('type', function (index, attr) {
            return attr == 'password' ? 'text' : 'password';
      });

});


