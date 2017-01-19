<html>
<body>
<div style="margin: auto; width: 500px"></div>
<h2>Simple Calculator</h2>
<hr>
<input type="text" name="first-number" id="first-number">
<input type="text" name="second-number" id="second-number">
<input type="submit" value="Add 'em All" id="add">
<script src="js/jquery-3.1.1.min.js"></script>
<script>
    $('#add').click(function () {
        $.ajax({
            type: "GET",
            url: "MyServlet?first_number=1&second_number=2",
            success: function (response) {
                alert(response);
            }
        });
    });
</script>
</body>
</html>
