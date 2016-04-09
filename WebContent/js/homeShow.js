$(document).ready(function(){
	difNameSelector();
})

function difNameSelector(){
	$("#e1").select2({
		 placeholder: "Select a state",
		 allowClear: true,
		 width:"400px"
	});
}