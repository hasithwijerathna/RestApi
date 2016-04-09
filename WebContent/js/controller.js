var count = 0;

$(document).ready(function(){
    $("#tabs").tabs();

    $("#addTab").click(function(){
        addMoreTabs(count,"tabs");
        count++;
    })

    $("#jqgrid1").jqGrid({
        datatype: "local",
        colNames: ["Name", "Criteria"],
        colModel: [
            { name: "Name", index: "Name" },
            { name: "Criteria", index: "Criteria" }
        ],
        multiselect: true,
        shrinkToFit: false,
        caption: "Student List - Loading via Array"
    });


    var partial = $("#dev-partial").clone();
    var a = partial.attr('id','abc');
    //alert(a.html());
    for (var x = 0; x <= students.length; x++) {
        $("#jqgrid1").addRowData(x, students[x]);
        $("#s"+x).append(partial.attr('id','dev-partial'+x).html())
    }
    $("#div").select2({
        placeholder: "Select a state",
        allowClear: true,
        width:"100px"
    })


    /*for (var x = 0; x <= students.length; x++) {
        $("#jqgrid1").addRowData(x, students[x]);
    }*/
    $("#container-port").append($("#dev-partial").html())

})


//class="ui-state-default ui-corner-top ui-tabs-active ui-state-active"
function addMoreTabs(count, id){
    //$("#"+id+" ul").append($("<li>").append($("<a>").attr('href', '#tab-'+count).append($("<span>").text("Tab "+count))));
    var innerDiv = $('<li>').attr('class','ui-state-default ui-corner-top ui-tabs-active ui-state-active').append($('<a>').attr('href','#tabs-'+count).append($('<span>').text("Hell Span is this "+count)))

    /*append($('<span>').text("Hell Span is this"))*/
    $("#"+id+" ul").append(innerDiv)

}

var students = [
    { Name: "Saman" , Criteria: "<span id='s0'></span>"},
    { Name: "Shane Foster", Criteria: "<span id='s1'></span>"},
    { Name: "Kellan Kher", Criteria: "<span id='s2'></span>"},
    { Name: "Patrick Shirazi", Criteria: "<span id='s3'></span>"}
];













