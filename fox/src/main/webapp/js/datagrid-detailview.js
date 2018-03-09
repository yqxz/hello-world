$('#dg').datagrid({
	view: detailview,
	detailFormatter:function(index,row){
		return '<div style="padding:2px"><table class="ddv"></table></div>';
	},
	onExpandRow: function(index,row){
		var ddv = $(this).datagrid('getRowDetail',index).find('table.ddv');
		ddv.datagrid({
			url:'datagrid22_getdetail.php?itemid='+row.itemid,
			fitColumns:true,
			singleSelect:true,
			rownumbers:true,
			loadMsg:'',
			height:'auto',
			columns:[[
				{field:'orderid',title:'Order ID',width:100},
				{field:'quantity',title:'Quantity',width:100},
				{field:'unitprice',title:'Unit Price',width:100}
			]],
			onResize:function(){
				$('#dg').datagrid('fixDetailRowHeight',index);
			},
			onLoadSuccess:function(){
				setTimeout(function(){
					$('#dg').datagrid('fixDetailRowHeight',index);
				},0);
			}
		});
		$('#dg').datagrid('fixDetailRowHeight',index);
	}
});