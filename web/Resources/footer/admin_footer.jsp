</div>
</div>
</div>
<!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../Resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../Resources/js/bootstrap.min.js"></script>

    <!--editor-->
    <script type="text/javascript" src="../Resources/js/admin/froala/froala_editor.min.js" ></script>
    <script type="text/javascript" src="../Resources/js/admin/froala/plugins/align.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/char_counter.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/code_beautifier.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/code_view.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/colors.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/draggable.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/emoticons.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/entities.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/file.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/font_size.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/font_family.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/fullscreen.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/image.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/image_manager.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/line_breaker.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/inline_style.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/link.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/lists.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/paragraph_format.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/paragraph_style.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/quick_insert.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/quote.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/table.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/save.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/url.min.js"></script>
  <script type="text/javascript" src="../Resources/js/admin/froala/plugins/video.min.js"></script>

  <script>
    $(function(){
      $('#edit').froalaEditor()
      $("#btnTest").click(function () {
          var data = $('#edit').froalaEditor('html.get');
          $("#test").html(data);
      }

      );
      
      
    });
    
    function sendLesson() {
        var body = $('#edit').froalaEditor("html.get");
        $("#LessonBody").attr("value", body);
        alert($("#LessonBody").val());
        $("#lessonForm").submit();
    }
  </script>
</body>

</html>
