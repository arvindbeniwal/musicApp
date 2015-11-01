$(document).ready(function(){
	$('#songsDDL').selectpicker();
	$('#songsDDL').selectpicker('val', 'All');
	 
	 
	$('#songsDDL').on('change',function(){
		var val = $('#songsDDL').selectpicker('val');
		$('#songSrc').attr('src','././'+val+'.mp3');
		$('audio').load();
	});
});

