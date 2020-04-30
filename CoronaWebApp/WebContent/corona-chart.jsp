<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CORONA CHART</title>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">
    // Load the Visualization API and the piechart package.
    google.load('visualization', '1.0', {
        'packages' : [ 'corechart' ]
    });
    
    google.setOnLoadCallback(drawChart);
  
    function drawChart() {
      
        var data = google.visualization.arrayToDataTable([
                                                            ['Location', 'Total Cases'],
                                                              <c:forEach items="${chartDataList}" var="entry">
                                                                  [ '${entry.key}', ${entry.value} ],
                                                              </c:forEach>
                                                        ]);
        // Set chart options
        var options = {
            'title' : 'Top 7 most infected country in World Server', //title which will be shown right above the Google Pie Chart
            is3D : true, //render Google Pie Chart as 3D
            pieSliceText: 'label', //on mouse hover show label or name of the Country
            tooltip :  {showColorCode: true}, // whether to display color code for a Country on mouse hover
            'width' : 900, //width of the Google Pie Chart
            'height' : 500 //height of the Google Pie Chart
        };
        // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
        chart.draw(data, options);
       } 
</script>
</head>
<body>
    <div style="width: 600px;">
        <div id="chart_div"></div>
    </div>
</body>
</html>