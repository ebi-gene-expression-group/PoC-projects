<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title><tiles:insertAttribute name="title" /></title>

</head>
<body style="background-color: grey">

<p style="color: whitesmoke"><i><tiles:insertAttribute name="header" /></i></p>
<br />
<p><tiles:insertAttribute name="body" /></p>
<br />
<p style="color: coral"><i><tiles:insertAttribute name="footer" /></i></p>
<br />
<p style="color: darkgreen">Go back to the <a href="${pageContext.request.contextPath}/">Home page</a>.</p>

</body>
</html>