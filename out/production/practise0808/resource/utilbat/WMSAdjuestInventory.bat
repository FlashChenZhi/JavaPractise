@echo off

set JAVAHOME=C:\Program Files\Java\jdk1.8.0_161
set YILIPATH=D:\wcs_home\tomcat\webapps\wms\WEB-INF

set CLASSPATH2=D:\wcs_home\tomcat\webapps\wms\WEB-INF\classes

set JARPATH="%JAVAHOME%\jre\lib\charsets.jar;%JAVAHOME%\jre\lib\deploy.jar;%JAVAHOME%\jre\lib\ext\access-bridge-64.jar;%JAVAHOME%\jre\lib\ext\cldrdata.jar;%JAVAHOME%\jre\lib\ext\dnsns.jar;%JAVAHOME%\jre\lib\ext\jaccess.jar;%JAVAHOME%\jre\lib\ext\jfxrt.jar;%JAVAHOME%\jre\lib\ext\localedata.jar;%JAVAHOME%\jre\lib\ext\nashorn.jar;%JAVAHOME%\jre\lib\ext\sunec.jar;%JAVAHOME%\jre\lib\ext\sunjce_provider.jar;%JAVAHOME%\jre\lib\ext\sunmscapi.jar;%JAVAHOME%\jre\lib\ext\sunpkcs11.jar;%JAVAHOME%\jre\lib\ext\zipfs.jar;%JAVAHOME%\jre\lib\javaws.jar;%JAVAHOME%\jre\lib\jce.jar;%JAVAHOME%\jre\lib\jfr.jar;%JAVAHOME%\jre\lib\jfxswt.jar;%JAVAHOME%\jre\lib\jsse.jar;%JAVAHOME%\jre\lib\management-agent.jar;%JAVAHOME%\jre\lib\plugin.jar;%JAVAHOME%\jre\lib\resources.jar;%JAVAHOME%\jre\lib\rt.jar;%CLASSPATH2%;%YILIPATH%\lib\comm.jar;%YILIPATH%\lib\ojdbc14.jar;%YILIPATH%\lib\jdom-1.1.jar;%YILIPATH%\lib\poi-3.14.jar;%YILIPATH%\lib\sqljdbc42.jar;%YILIPATH%\lib\hibernate3.jar;%YILIPATH%\lib\antlr-2.7.7.jar;%YILIPATH%\lib\dom4j-1.6.1.jar;%YILIPATH%\lib\jedis-2.5.2.jar;%YILIPATH%\lib\c3p0-0.9.2.1.jar;%YILIPATH%\lib\log4j-1.2.15.jar;%YILIPATH%\lib\ezmorph-1.0.6.jar;%YILIPATH%\lib\joda-time-1.6.jar;%YILIPATH%\lib\jpinyin-1.1.6.jar;%YILIPATH%\lib\xstream-1.4.4.jar;%YILIPATH%\lib\commons-io-1.4.jar;%YILIPATH%\lib\commons-io-2.5.jar;%YILIPATH%\lib\httpcore-4.4.1.jar;%YILIPATH%\lib\aopalliance-1.0.jar;%YILIPATH%\lib\commons-logging.jar;%YILIPATH%\lib\servlet-api-2.5.jar;%YILIPATH%\lib\slf4j-api-1.6.1.jar;%YILIPATH%\lib\xml-apis-1.0.b2.jar;%YILIPATH%\lib\commons-dbcp-1.1.jar;%YILIPATH%\lib\commons-digester.jar;%YILIPATH%\lib\commons-lang-2.0.jar;%YILIPATH%\lib\commons-lang-2.5.jar;%YILIPATH%\lib\commons-pool-1.1.jar;%YILIPATH%\lib\commons-pool-1.2.jar;%YILIPATH%\lib\httpclient-4.4.1.jar;%YILIPATH%\lib\commons-beanutils.jar;%YILIPATH%\lib\commons-lang3-3.4.jar;%YILIPATH%\lib\commons-pool2-2.3.jar;%YILIPATH%\lib\commons-codec-1.10.jar;%YILIPATH%\lib\commons-dbcp-1.2.2.jar;%YILIPATH%\lib\jackson-core-2.4.2.jar;%YILIPATH%\lib\jandex-1.1.0.Final.jar;%YILIPATH%\lib\json-lib-2.4-jdk15.jar;%YILIPATH%\lib\aspectjweaver-1.8.2.jar;%YILIPATH%\lib\commons-collections.jar;%YILIPATH%\lib\commons-dbutils-1.1.jar;%YILIPATH%\lib\javassist-3.18.1-GA.jar;%YILIPATH%\lib\slf4j-log4j12-1.6.1.jar;%YILIPATH%\lib\commons-logging-1.0.4.jar;%YILIPATH%\lib\commons-logging-1.1.1.jar;%YILIPATH%\lib\joda-time-1.6-javadoc.jar;%YILIPATH%\lib\commons-fileupload-1.0.jar;%YILIPATH%\lib\jackson-databind-2.4.2.jar;%YILIPATH%\lib\jboss-logging-3.1.3.GA.jar;%YILIPATH%\lib\commons-beanutils-1.9.2.jar;%YILIPATH%\lib\commons-collections-3.2.jar;%YILIPATH%\lib\javax.servlet-api-3.0.1.jar;%YILIPATH%\lib\spring-tx-4.1.0.RELEASE.jar;%YILIPATH%\lib\commons-fileupload-1.3.2.jar;%YILIPATH%\lib\poi-2.5.1-final-20040804.jar;%YILIPATH%\lib\spring-aop-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-jms-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-orm-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-oxm-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-web-4.1.0.RELEASE.jar;%YILIPATH%\lib\commons-collections-3.2.1.jar;%YILIPATH%\lib\jackson-annotations-2.4.2.jar;%YILIPATH%\lib\spring-core-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-jdbc-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-test-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-beans-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-webmvc-4.1.0.RELEASE.jar;%YILIPATH%\lib\mchange-commons-java-0.2.3.4.jar;%YILIPATH%\lib\spring-aspects-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-context-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-messaging-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-websocket-4.1.0.RELEASE.jar;%YILIPATH%\lib\mysql-connector-java-5.1.40-bin.jar;%YILIPATH%\lib\spring-expression-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-instrument-4.1.0.RELEASE.jar;%YILIPATH%\lib\hibernate-jpa-2.0-api-1.0.0.Final.jar;%YILIPATH%\lib\spring-webmvc-portlet-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-context-support-4.1.0.RELEASE.jar;%YILIPATH%\lib\jboss-logging-annotations-1.2.0.Beta1.jar;%YILIPATH%\lib\spring-instrument-tomcat-4.1.0.RELEASE.jar;%YILIPATH%\lib\spring-boot-starter-tomcat-1.4.1.RELEASE.jar;%YILIPATH%\lib\jboss-transaction-api_1.2_spec-1.0.0.Final.jar;" 



set CLASSPATH=com.yili.AdjuestInventory


java -classpath %JARPATH% %CLASSPATH%