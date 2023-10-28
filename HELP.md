# Getting Started
Project run java/spring app with mongoDb and elasticsearch
using telegraf/InfluxDB/Grafana to monitor docker containers
also using nginx as reverse proxy


To start all containers just run docker compose up
If you need special permissions to access docker.sock file, run docker compose with 'sudo' command

Ff you see that you don't have permission to access the docker.sock file, run the following command:
try to adjust docker GUID in docker-compose yml
get GUID
Mac: stat -f ‘%g’ /var/run/docker.sock
LINUX: stat -c '%g' /var/run/docker.sock

Set GUID in docker-compose.yml:
services:
    telegraf:
        user: telegraf:<GUID>

If GUID is correct inside docker-compose.yml, run the following command:
docker exec -u root -it telegraf /bin/sh -c "chmod 666 /var/run/docker.sock"


To run loading test using siege: 
siege -c5 --content-type "application/json" -f siege/urls.txt
https://github.com/JoeDog/siege

grafana dashboard available on: http://localhost:80/grafana
java-spring application available on: http://localhost:80/app