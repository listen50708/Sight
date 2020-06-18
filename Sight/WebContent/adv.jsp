<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Sight"%>
<%@page import="listener.ServletSListener"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>久久的奇妙冒險</title>
</head>
<body style="background-color: black;">
	<style type="text/css">
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

.b-ent:hover {
	background-color: rgba(255, 255, 255, 0.6);
}

.sight-name {
	float: left;
	overflow: hidden;
    width:300px;
	display: inline-block;
}

.sight-address {
	display: inline-block;
}

.logo {
	float: left;
}

.rightsmall {
	float: right;
	font-size: small;
}


.list-container{
	color:gray;
}
</style>
	<div id="topbar-container">
		<div id="topbar" class="bbs-content">
			<a id="logo" href="/Sight">台灣旅遊景點</a><a class="rightsmall" href="/Sight/adventure">DO!!IT!!</a>
		</div>
	</div>



	<div class="list-container">
	<% try{ 
	ArrayList<Sight>list=ServletSListener.getList();
	int i=0;
	for(Sight l:list){
		String name=l.getSightName();
		String address=l.getAddress();
		if(address.isEmpty())address="ORA ORA ORA ORA ORA ORA ORA";
	%>
		<div class="b-ent">
			<div class="sight-name"><%=name%></div>
			<div class="sight-address"><%=address%></div>
			<a class="rightsmall" href="/Sight/deleteSession?key=<%=i%>">刪除</a>
		</div>
		<%i++;
		//deletSession
	}
} catch (NullPointerException npe) {
	System.out.println(npe.toString());
	// It's fine if findUser throws a NPE
} %>
	</div>

	<script>

    </script>
</body>

</html>