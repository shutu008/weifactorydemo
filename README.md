# weifactory-2.0
植物工厂2.0

## 端口：
zookeeper: 8366

网站端：8001

接口端：8852

tomcat：8080

mysql:3306

mqtt:1883

图片通信：8235

普通通信：8765

## 接口地址
http://api.weifactory.vastsum.net:8852/doc.html
## 项目地址
http://www.weifactory.vastsum.net/
## 图片服务器地址
http://img.weifactory.vastsum.net/
## 手机端访问地址
http://mobile.weifactory.vastsum.net/
## 支付网关
http://pay.weifactory.vastsum.net/
--------
## 本地包命令
mvn install:install-file -DgroupId=com.vastsum -DartifactId=taobao-sdk-java-1.0 -Dversion=1.0 -Dpackaging=jar -Dfile=taobao-1.0.jar

mvn install:install-file -DgroupId=com.alipay.api -DartifactId=alipay-sdk -Dversion=20180104135026 -Dpackaging=jar -Dfile=alipay-sdk-20180104135026.jar




