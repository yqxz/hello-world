$(document).ready(function(){
		$(".lo").on("click",function(){
			var valName=$(this).attr('id');
			$("#load").load(valName);
		})
	})