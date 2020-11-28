FROM  swr.cn-north-4.myhuaweicloud.com/devops-devteam/myopenjdk:8
MAINTAINER zhaohu
ADD  ./target/junit_test-1.0.0.jar /opt/junit_test-1.0.0.jar
ENTRYPOINT ["java","-Xmx512m","-Xms512m","-jar","/opt/junit_test-1.0.0.jar"]
