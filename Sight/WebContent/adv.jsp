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
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
 
</head>
<body style="background-color: black;" >
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
    color: gray;
	float: right;
	font-size: small;
}


.list-container{
	color:gray;
}
.s-ent {
	margin: 1ex 0;
	padding: 0.5ex 0;
	background-color: #111;
}

.s-ent hover {	
	color: gray;
}
#doit{
     color: #F6F062;
	text-decoration: none;
}
#doit:hover {
	background-color: rgba(255, 255, 255, 0.6);
}

.select {
	color: gray;
	font-size: 20px;
}

.sight-name {
    overflow: hidden;
    width:300px;
	margin: 0 5ex;
}
</style>
	<div id="topbar-container">
		<div id="topbar" class="bbs-content">
			<a id="logo" href="home.jsp">台灣旅遊景點</a><!-- <a class="rightsmall" href="/Sight/adventure">DO!!IT!!</a>-->

		</div>
	</div>
				
		
						<div class="select">
							<form action="adv">
							
							<label>北部</label><br>
							<input type="checkbox" id="taipei" value="taipei" name="city">台北
							<input type="checkbox" id="newtaipei" value="newtaipei" name="city">新北
							<input type="checkbox" id="keelung" value="keelung" name="city">基隆
							<input type="checkbox" id="taoyuan" value="taoyuan" name="city">桃園
							<input type="checkbox" id="hsinchucity" value="hsinchucity" name="city">新竹市
							<input type="checkbox" id="hsinchucounty" value="hsinchucounty" name="city">新竹縣
							<input type="checkbox" id="yilancounty" value="yilancounty" name="city">宜蘭縣
							<br>
							<label>中部</label><br>
							<input type="checkbox" id="taichung" value="taichung" name="city">台中
							<input type="checkbox" id="miaolicounty" value="miaolicounty" name="city">苗栗縣
							<input type="checkbox" id="changhuacounty" value="changhuacounty" name="city">彰化縣
							<input type="checkbox" id="nantoucounty" value="nantoucounty" name="city">南投縣
							<input type="checkbox" id="yunlincounty" value="yunlincounty" name="city">雲林縣
							<br><label>南部</label><br>
							<input type="checkbox" id="tainan" value="tainan" name="city">台南
							<input type="checkbox" id="kaohsiung" value="kaohsiung" name="city">高雄
							<input type="checkbox" id="chiayicity" value="chiayicity" name="city">嘉義市
							<input type="checkbox" id="chiayicounty" value="chiayicounty" name="city">嘉義縣
							<input type="checkbox" id="pingtungcounty"  value="pingtungcounty" name="city">屏東
							<br><label>東部</label><br>
							<input type="checkbox" id="hualiencounty" value="hualiencounty" name="city">花蓮縣
							<input type="checkbox" id="taitungcounty" value="taitungcounty" name="city">台東縣
							
							
							<br><label>離島</label><br>
							<input type="checkbox" id="lienchiangcounty" value="lienchiangcounty" name="city">連江縣
							<input type="checkbox" id="penghucounty" value="penghucounty" name="city">澎湖縣
							<input type="checkbox" id ="kinmencounty"value="kinmencounty" name="city">金門縣
							<br><input type="submit" value="DO!!IT!!!">
							</form>
						</div>
						<%
			try {
				String[] cityList = ServletSListener.getCityList();
				
				for (String c : cityList) {
					%>
					<script>
					document.getElementById("<%=c%>").checked = true;
					</script>
					<%
				}
			} catch (NullPointerException npe) {
				System.out.println(npe.toString());
				// It's fine if findUser throws a NPE
			} %>
	<div class="list-container">
	<% try{ 
	ArrayList<Sight>list=ServletSListener.getList();
	int i=0;
	for(Sight l:list){
		String name=l.getSightName();
		String address=l.getAddress();
		if(address.isEmpty())address="ORA ORA ORA ORA ORA ORA";
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