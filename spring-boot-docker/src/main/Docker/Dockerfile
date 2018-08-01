# base image
FROM java:openjdk-8-jre-alpine

LABEL PROJECT="spring-boot-docker" \
      AUTHOR="ygltzx@sina.com"

# developer info
MAINTAINER  "creativeworkes" <ygltzx@sina.com>

# current workspace
WORKDIR /opt

# log dir
VOLUME /var/log/spring-boot-docker

# appliction resources
ADD deamon/start.sh start.sh

# 修改为阿里云Alpine镜像库
RUN echo "http://mirrors.aliyun.com/alpine/v3.4/main/" > /etc/apk/repositories

# runtimes setting
ENV LANG en_US.UTF-8
RUN /sbin/apk --no-cache add bash tzdata && \
    /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    /bin/echo "Asia/Shanghai" > /etc/timezone && \
    /sbin/apk del tzdata && \
    /bin/rm -rf /var/cache/* && \
    /bin/chmod +x start.sh && \
    /bin/mkdir config

# Environment Args
ARG WAR_FILE
ADD ${WAR_FILE} spring-boot-docker.war

# open image port
EXPOSE 8080

# exec command
ENTRYPOINT ["/bin/bash"]
CMD ["start.sh"]