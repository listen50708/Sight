<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="listener.ServletSListener"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>台灣旅遊景點</title>
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

.city-name {
	float: left;
	width: 100px;
	display: inline-block;
}

.city-tittle {
	display: inline-block;
}

.logo {
	float: left;
}

.rightsmall {
	float: right;
}

.small {
	font-size: small;
}

.b-list-container {
	display: block;
}
</style>
	<div id="topbar-container">
		<div id="topbar" class="bbs-content">
			<a id="logo" href="/">台灣旅遊景點</a>
		    <a class="rightsmall" href="/adventure">來去__玩</a>
		</div>
	</div>



	<div class="b-list-container action-bar-margin bbs-screen">

		<div class="b-ent">
			<a class="city" href="/Sight/sight?city=taipei">
				<div class="city-name" onclick="go('臺北')">臺北</div>

				<div class="city-title">百年難得一見~2020夏至日，全民來看日環食！</div>
			</a>
		</div>

		<div class="b-ent">
			<a class="city" href="/sight?city=newtaipei">
				<div class="city-name" onclick="go('新北')">新北</div>

				<div class="city-title">瑞芳區金字碑古道接近市道102線出口處崩塌地修復完成，步道現已開放通行</div>
			</a>
		</div>

		<div class="b-ent">
			<a class="city" href="/sight?city=taoyuan">
				<div class="city-name" onclick="go('桃園')">桃園</div>

				<div class="city-title">歡慶端午佳節 桃園自在遊6月特惠遊程好康大放送</div>
			</a>
		</div>

		<div class="b-ent">
			<a class="city" href="/sight?city=taichung">
				<div class="city-name" onclick="go('臺中')">臺中</div>

				<div class="city-title">「一沙一世界」 6/27臺中大安沙雕音樂季登場 到大安旅遊賞沙雕環遊世界</div>
			</a>
		</div>

		<div class="b-ent">
			<a class="city" href="/sight?city=tainan">
				<div class="city-name" onclick="go('臺南')">臺南</div>

				<div class="city-title">來臺南也可追日環食！錯過再等二個世紀 黃偉哲推薦臺南旅遊景點觀測一次滿足</div>
			</a>
		</div>

		<div class="b-ent">
			<a class="city" href="/sight?city=kaohsiung">
				<div class="city-name" onclick="go('高雄')">高雄</div>

				<div class="city-title">2020台灣斯巴達障礙跑競賽即將於7/4、7/5舉辦，相揪全民挑戰極限，把握機會、報名從速！</div>
			</a>
		</div>
		<div class="b-ent">
			<a class="city" href="/sight?city=keelung">
				<div class="city-name" onclick="go('基隆')">基隆</div>

				<div class="city-title">百年難得一見~2020夏至日，全民來看日環食！</div>
			</a>
		</div>

		<div class="b-ent">
			<a class="city" href="/sight?city=hsinchucity">
				<div class="city-name" onclick="go('新竹市')">新竹市</div>

				<div class="city-title">來盪鞦韆吧！民族公園設環狀鞦韆打造搖曳樂園 全區無障礙設計好親民</div>
			</a>
		</div>

		<div class="b-ent">
			<a class="city" href="/sight?city=chiayicity">
				<div class="city-name" onclick="go('嘉義市')">嘉義市</div>

				<div class="city-title">「發現嘉義 行銷國際」 日本市場Inbound旅行業嘉義市踩線</div>
			</a>
		</div>

		<div class="b-ent">
			<a class="city" href="/sight?city=hsinchucounty">
				<div class="city-name" onclick="go('新竹縣')">新竹縣</div>

				<div class="city-title">「來竹縣約會吧!」 六月玩竹縣加碼1400元喲</div>
			</a>
		</div>

		<div class="b-ent">
			<a class="city" href="/sight?city=miaolicounty">
				<div class="city-name" onclick="go('苗栗)">苗栗</div>

				<div class="city-title">2020貓裏表演藝術節 自7月3日起熱鬧開演!</div>
			</a>
		</div>

		<div class="b-ent">
			<a class="city" href="/sight?city=changhuacounty">
				<div class="city-name" onclick="go('彰化')">彰化</div>

				<div class="city-title">彰化埔心羅厝天主堂百年文物歷史館開展 從文物展看見埔心地方發展史</div>
			</a>
		</div>
		<div class="b-ent">
			<a class="city" href="/sight?city=nantoucounty">
				<div class="city-name" onclick="go('南投')">南投</div>

				<div class="city-title">【雙龍瀑布七彩吊橋旅】確定6/20開幕! 門票現正熱賣中!</div>
			</a>
		</div>
		<div class="b-ent">
			<a class="city" href="/sight?city=yunlincounty">
				<div class="city-name" onclick="go(''雲林')">雲林</div>

				<div class="city-title">2020防疫安心之旅雲西路線</div>
			</a>
		</div>
		<div class="b-ent">
			<a class="city" href="/sight?city=chiayicounty">
				<div class="city-name" onclick="go('嘉義縣')">嘉義縣</div>

				<div class="city-title">與螢共舞</div>
			</a>
		</div>
		<div class="b-ent">
			<a class="city" href="/sight?city=pingtungcounty">
				<div class="city-name" onclick="go('屏東')">屏東</div>

				<div class="city-title">黑鮪魚觀光文化祭</div>
			</a>
		</div>

		<div class="b-ent">
			<a class="city" href="/sight?city=yilancounty">
				<div class="city-name" onclick="go('宜蘭')">宜蘭</div>

				<div class="city-title">2020宜蘭童玩星光樂園</div>
			</a>
		</div>
		<div class="b-ent">
			<a class="city" href="/sight?city=hualiencounty">
				<div class="city-name" onclick="go('花蓮')">花蓮</div>

				<div class="city-title">FUN暑假新生活運動 郵輪式列車 仲夏出遊嚴選</div>
			</a>
		</div>
		<div class="b-ent">
			<a class="city" href="/sight?city=taitungcounty">
				<div class="city-name" onclick="go('臺東')">臺東</div>

				<div class="city-title">綠島窺探銀河 台東最美星空音樂會 首場次離島辦理 開啟暑假活動熱潮</div>
			</a>
		</div>
		<div class="b-ent">
			<a class="city" href="/sight?city=lienchiangcounty">
				<div class="city-name" onclick="go('連江')">連江</div>

				<div class="city-title">夢幻藍眼淚登陸 點亮2020微光馬祖 精彩活動卡蹓一夏越夜越美麗</div>
			</a>
		</div>
		<div class="b-ent">
			<a class="city" href="/sight?city=penghucounty">
				<div class="city-name" onclick="go('澎湖')">澎湖</div>

				<div class="city-title">2020澎湖國際海上花火節即將精彩呈現!</div>
			</a>
		</div>
		<div class="b-ent">
			<a class="city" href="/sight?city=kinmencounty">
				<div class="city-name" onclick="go('金門')">金門</div>

				<div class="city-title">拚疫後觀光 金門親子嘉年華7/1登場</div>
			</a>
		</div>
	</div>

	<script>
    function go(city)
	{
		
		sessionStorage.setItem('city', city);
		window.location.href = 'PatientSearch.html';
	}
    </script>
</body>

</html>