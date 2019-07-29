package com.test.rabbitmq.pakage.config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * Created by xulei on 2019/6/6.
 */
public class CodeGenerator {
    //数据库配置
    public static String dbUrl = "jdbc:mysql://172.16.9.226:3306/crm_test";
    public static String userName = "wzz";
    public static String password = "student";

    //命名方式配置
    public static String serviceName = "Mgr";
    public static String ServiceImplName = "MgrImpl";
    public static String controllerName = "Controller";
    public static String daoName = "Dao";
    public static String xmlName = "Mapper";

    public static String packageName = "com.test.rabbitmq";
    //	public static String[] tables = {"branch_center_info"};
//	public static String[] tables = {"customer_assign_config", "customer_automatic_assign_strategy"};
//	public static String[] tables = {"student_info", "student_info_attr", "student_move_info", "student_call_info", "student_tracking_info",
//			"student_sign_info", "branch_center_assign_strategy", "branch_center_divided_info", "sale_operation_statistical"};
//	public static String[] tables = {"task_deal_data_info", "task_deal_info"};
    public static String[] tables = {"student_info"};

    public static String outputDir = "E:\\CodeGenerator";


    // @Test
    public static void main(String[] args) {
        CodeGenerator g = new CodeGenerator();
        g.generateCode();
    }

    public void generateCode() {
        String packageName = CodeGenerator.packageName;
        boolean serviceNameStartWithI = false;
        String[] tables = CodeGenerator.tables;
        generateByTables(serviceNameStartWithI, packageName, tables);
    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = CodeGenerator.dbUrl;
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL).setUrl(dbUrl).setUsername(userName).setPassword(password)
                .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true).setEntityLombokModel(false).setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel).setInclude(tableNames);// 修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false).setAuthor("crm")
                .setOutputDir(outputDir).setFileOverride(true);
        if (!serviceNameStartWithI) {
            config.setServiceName("%s"+serviceName);
            config.setControllerName("%s"+controllerName);
            config.setMapperName("%s"+daoName);
            config.setEnableCache(false);
            config.setServiceImplName("%s"+ServiceImplName);
            config.setXmlName("%s"+xmlName);
        }
        new AutoGenerator().setGlobalConfig(config).setDataSource(dataSourceConfig).setStrategy(strategyConfig)
                .setPackageInfo(new PackageConfig().setParent(packageName).setController("controller").setEntity("po")
                        .setMapper("dao").setService("mgr").setXml("mapper").setServiceImpl("mgrImpl"))
                .execute();
    }

    private void generateByTables(String packageName, String... tableNames) {
        generateByTables(true, packageName, tableNames);
    }
}
