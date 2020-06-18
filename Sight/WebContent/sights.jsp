<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Sight"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>觀光景點</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body onload="load()">
	<style type="text/css">
body {
	background-color: black;
}

a {
	text-decoration: none;
	color: gray;
}

#topbar-container {
	background-color: navy;
}

#topbar {
	hover: white;
}

#logo {
	color: #F6F062;
	text-decoration: none;
}

#logo:hover {
	background-color: rgba(255, 255, 255, 0.3);
}

.s-ent {
	margin: 1ex 0;
	padding: 0.5ex 0;
	background-color: #111;
}

.s-ent hover {
	color: gray;
}

.s-ent:hover {
	background-color: rgba(255, 255, 255, 0.6);
}

.s-ent>* {
	color: gray;
	font-size: 20px;
}

.sight-name {
    overflow: hidden;
    width:300px;
	margin: 0 5ex;
}




.s-ent .sight-class {
	margin: 0 0 0 5ex;
}
</style>
	<div id="topbar-container">
		<div id="topbar" class="bbs-content">
			<a id="logo" href="/">台灣旅遊景點>><%=request.getParameter("city") %></a>
		</div>
	</div>

	<div class="list-group" id="list">
		<%
			try {
				ArrayList<Sight> list = (ArrayList<Sight>) request.getAttribute("sightList");
				int i = 0;
				for (Sight s : list) {

					String name = s.getSightName();
					String zone = s.getZone();
					String category = s.getCategory();
					i++;
		%>
		<div class="s-ent" id="" +<%=i%>+" " data-toggle="modal"
			data-target="#GSCCModal<%=i%>">

			<div class="sight-name">
				[<%=zone%>]<%=name%>
			</div>
			<div class="sight-class"><%=category%></div>
			</a>
		</div>
		<div id="GSCCModal<%=i%>" class="modal fade" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="myModalLabel"><%=name%></h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body"></div>
					<img src=<%=s.getPhotoURL()%>>
					<div class="des"><%=s.getDescription()%></div>
					<div class="address">
						地址:<%=s.getAddress()%></div>
					<div class="modal-footer"></div>
				</div>
			</div>
		</div>

		<%
			i++;
				}
			} catch (NullPointerException npe) {
				System.out.println(npe.toString());
				// It's fine if findUser throws a NPE
			}
		%>

	</div>
	
	<script>
		
	</script>
</body>
</html>