//package com.zzz.test.my_test.exam;
//
//import javafx.scene.chart.Chart;
//import javafx.scene.chart.ValueAxis;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xddf.usermodel.chart.AxisCrosses;
//import org.apache.poi.xddf.usermodel.chart.AxisPosition;
//import org.apache.poi.xddf.usermodel.chart.LegendPosition;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class MortgageCalculator {
//    public static void main(String[] args) {
//        double totalLoanAmount = 100000; // 房贷总额
//        double interestRate = 0.05; // 年利率
//        int loanTermInYears = 20; // 贷款期限（年）
//        int numberOfPayments = loanTermInYears * 12; // 还款期数
//
//        Workbook workbook = new XSSFWorkbook();
//        Sheet sheet = workbook.createSheet("Mortgage Payments");
//
//        // 创建表头
//        Row headerRow = sheet.createRow(0);
//        headerRow.createCell(0).setCellValue("Month");
//        headerRow.createCell(1).setCellValue("Principal");
//        headerRow.createCell(2).setCellValue("Interest");
//
//        // 计算每个月的还款情况
//        double monthlyInterestRate = interestRate / 12;
//        double monthlyPayment = totalLoanAmount * monthlyInterestRate /
//                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
//
//        double remainingPrincipal = totalLoanAmount;
//        for (int i = 0; i < numberOfPayments; i++) {
//            Row row = sheet.createRow(i + 1);
//            row.createCell(0).setCellValue(i + 1);
//
//            double interestPayment = remainingPrincipal * monthlyInterestRate;
//            double principalPayment = monthlyPayment - interestPayment;
//            remainingPrincipal -= principalPayment;
//
//            row.createCell(1).setCellValue(principalPayment);
//            row.createCell(2).setCellValue(interestPayment);
//        }
//
//        // 创建图表
//        Drawing<?> drawing = sheet.createDrawingPatriarch();
//        ClientAnchor anchor = drawing.createAnchor(0, 0, 0, 0, 4, 1, 15, 20);
//        Chart chart = drawing.createChart(anchor);
//        ChartLegend legend = chart.getOrCreateLegend();
//        legend.setPosition(LegendPosition.RIGHT);
//
//        LineChartData data = chart.getChartDataFactory().createLineChartData();
//
//        ChartAxis bottomAxis = chart.getChartAxisFactory().createCategoryAxis(AxisPosition.BOTTOM);
//        ValueAxis leftAxis = chart.getChartAxisFactory().createValueAxis(AxisPosition.LEFT);
//        leftAxis.setCrosses(AxisCrosses.AUTO_ZERO);
//
//        LineChartSeries principalSeries = data.addSeries(
//                chart.getChartAxisFactory().createCategoryAxis(AxisPosition.BOTTOM),
//                chart.getChartAxisFactory().createValueAxis(AxisPosition.LEFT));
//        principalSeries.setTitle(sheet.getRow(0).getCell(1).getStringCellValue());
//        principalSeries.setSmooth(true);
//
//        LineChartSeries interestSeries = data.addSeries(
//                chart.getChartAxisFactory().createCategoryAxis(AxisPosition.BOTTOM),
//                chart.getChartAxisFactory().createValueAxis(AxisPosition.LEFT));
//        interestSeries.setTitle(sheet.getRow(0).getCell(2).getStringCellValue());
//        interestSeries.setSmooth(true);
//
//        for (int i = 0; i < numberOfPayments; i++) {
//            principalSeries.addCategory(sheet.getRow(i + 1).getCell(0));
//            principalSeries.addPoint(new DoubleDataSource(sheet.getRow(i + 1).getCell(1)));
//
//            interestSeries.addCategory(sheet.getRow(i + 1).getCell(0));
//            interestSeries.addPoint(new DoubleDataSource(sheet.getRow(i + 1).getCell(2)));
//        }
//
//        chart.plot(data, bottomAxis, leftAxis);
//
//        // 保存 Excel 文件
//        try (FileOutputStream fos = new FileOutputStream("MortgagePayments.xlsx")) {
//            workbook.write(fos);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Excel 文件已创建并保存成功！");
//    }
//}