# springboot-postgres-dockerized

# Run the application in docker mode

mvn verify jib:dockerBuild
docker-compose -f src/main/docker/app.yml up -d --build
