# springBootDocker

- Docker build image
docker build -t spring-boot-docker .

- Docker run image
docker run -p 8085:8085 spring-boot-docker

- Docker show running container
docker ps

- Docker stop the container
docker container stop 4ce687c61ac7

- Docker list all build images
docker image ls