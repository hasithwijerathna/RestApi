$(document).ready(function(){
	$(function () {
	    $("#list").jqGrid({
	        url: "http://localhost:8080/SampleDemo/rest/resource/all",
	        datatype: "json",
	        mtype: "GET",
	        colNames: ["Id", "Name"],
	        colModel: [
	            { name: "id", width: 55 },
	            { name: "name", width: 90 }
	        ],
	        pager: "#pager",
	        rowNum: 10,
	        rowList: [10, 20, 30],
	        sortname: "invid",
	        sortorder: "desc",
	        viewrecords: true,
	        gridview: true,
	        autoencode: true,
	        caption: "My first grid"
	    }); 
	});
})