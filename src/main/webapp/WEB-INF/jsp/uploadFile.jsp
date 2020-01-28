<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
 <head>
 <title>File Upload</title>
 </head>
 <body>


<form:form name ="form" method="post" action="uploadFile" enctype="multipart/form-data">
<p><label for="file">Choose Image</label></p>
<p><input name="uploadFile" id="fileToUpload" type="file" /></p>
<p><input type="submit" value="Upload" onclick = "submit();"></p>
</form:form>
<a href="/">Back</a>


<script type = "text/javascript">

function submit() {
document.form.buttonName.value = "button";
form.submit();
}
</script>

</body>
</html>