<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>



<head>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="./playSong.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<script type="text/javascript"
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js">
	
</script>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.5/css/bootstrap-select.css"
	rel="stylesheet" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.5/js/bootstrap-select.js"
	type="text/javascript"></script>

<title>Arvind</title>
</head>

<style>
body {
	background: url('http://hddesktopwallpapers.in/wp-content/uploads/2015/06/Metallica-Wallpaper-A13.png') no-repeat fixed center
		center;
	background-size: cover;
	font-family: Montserrat;
}
</style>
<body>
	<font color="white" size="10">Welcome!</font>
	<br />
	<font color="white" size="3">Select Song!</font>
	<div>
		<s:form action="PlaySong">
			<s:select class="selectpicker" id="songsDDL" name="SongSelected"
				list="SongList" />
			<%-- <s:submit label="Play" /> --%>

		</s:form>
		<audio controls>
			<source id="songSrc" src="" type="audio/mpeg">
			
			
		</audio>

	</div>
	<form action="PlaySong" method="post" enctype="multipart/form-data">
		<font color="white" size="3">Upload Your Song </font> <input
			type="file" name="myFile" /> <input type="submit" value="Upload" />
	</form>

	<font color="white" size="3">Please Upvote here!</font>
	<s:form action="PlaySong">
		<s:select class="selectpicker" name="SongSelected" list="SongList" />

		<s:select name="score"
			list="#{'NO OP':'', 'Upvote':'Upvote',
                    'Downvote':'Downvote'}" />
		<!-- <input type="submit" value="Vote"/> -->
		<s:submit label="Submit" />
	</s:form>
		<%-- <TABLE id="songTable" style="width:350px border:1" >
		 <tr>
		 <th>Song Name</th><th>Play</th><th>Upvote</th><th>Downvote</th>
		 </tr>
		 
		 <TR>
		 <td>
		 Bus Number : <s:textfield name="ticket.busNo" label="Bus Number"/>
		 </td>
		 <td>
		 Bus Name : <s:textfield name="ticket.busName" label="Bus Name"/>
		</td>
		</TR>
		 <TR>
		 <td>
		 From Number : <s:textfield name="ticket.fromStation" label="From Station"/>
		</td>
		<td>
		 To Station : <s:textfield name="ticket.toStation" label="To Station"/>
		</td>
		</TR>
		 
		<TR>
		 <td>
		Fare : <s:textfield name="ticket.fare" label="Fare (to be displayed Automatically)"/>
		 </td>
		 <td>
		Journey Date : <s:textfield name="ticket.journeyDate" label="Journey Date"/>
		</td>
		</TR>
		 
		</TABLE> --%>


</body>
</html>
