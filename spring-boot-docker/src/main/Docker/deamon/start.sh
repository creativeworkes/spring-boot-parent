#########################################################################
# File Name: start.sh
# Author: yeqinglan
# Mail: yeqinglan@hd123.com
# Created Time: 2017-07-31 09:30:00
#########################################################################
#!/bin/sh

APP_BIN="/opt/spring-boot-docker.war"

JAVA_OPTS="-ea \
           -server \
           -Xmx1024M -Xms1024M \
           -Dfile.encoding=UTF-8 \
           -Djava.awt.headless=true \
           -Djava.security.egd=file:/dev/./urandom"

APP_OPTS="--spring.config.location=/opt/config/bootstrap.yaml"

# start service
exec /usr/bin/java ${JAVA_OPTS} -jar ${APP_BIN} ${APP_OPTS}