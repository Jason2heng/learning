$(function () {
    $.post({
        url:'user/getAll',
        success:function (data) {
            for (var i=0;i<data.length;i++){
                var test="<tr>\n" +
                    "            <td>1</td>\n" +
                    "            <td>+data[i].username+</td>\n" +
                    "            <td>admin</td>\n" +
                    "            <td>2020年9月28日</td>\n" +
                    "            <td>正常</td>\n" +
                    "            <td>\n" +
                    "                <a href=\"#\" class=\"btn btn-danger\">删除</a>\n" +
                    "                <a href=\"#\" class=\"btn btn-success\">修改</a>\n" +
                    "            </td>\n" +
                    "\n" +
                    "        </tr>"
                var obj=$(".pool");
                obj.append(text);
            }
        }
    });

});