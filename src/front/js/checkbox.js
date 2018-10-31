//利用JS函数实现复选框的全选/全不选/反选功能

var checkAll=false;
function allCheck() {
    checkAll=!checkAll;
    var inputs=document.getElementsByName("checkbox");
        for (var i = 0; i < inputs.length; i++) {
            inputs[i].checked = checkAll;
        }
    }

function reserveCheck() {
    var inputs=document.getElementsByName("checkbox");
    for(var i=0;i<inputs.length;i++) {
        inputs[i].checked = !inputs[i].checked;
    }
}