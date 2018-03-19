$(function(){
    // nav收缩展开
    $('.nav-item>a').on('click',function(){
            if ($(this).next().css('display') == "none") {
                //展开未展开
                $('.nav-item').children('ul').slideUp(300);
                $(this).next('ul').slideDown(300);
                $(this).parent('li').addClass('nav-show').siblings('li').removeClass('nav-show');
            }else{
                //收缩已展开
                $(this).next('ul').slideUp(300);
                $('.nav-item.nav-show').removeClass('nav-show');
            }
    });
	$(".innerli").on("click",function(){
			/**
			window.open(""+valName+"?loginName="+loginName);
			 */
		var valName=$(this).attr('id');
		var title=$(this).find("span").text();
		var loginName=$("#loginName").text();
		var content = '<iframe scrolling="auto" frameborder="0"  src="'+valName+'?loginName='+loginName+'" style="width:100%;height:100%;"></iframe>'; 
		if($('#tb').tabs('exists', title)){
			 $('#tabs').tabs('select', title);//选中并刷新
	        }else{
	        	$('#tb').tabs('add',{   
	        		title:title,   
	        		content:content,
	        		closable:true,   
	        	});  
	        }
	})
});