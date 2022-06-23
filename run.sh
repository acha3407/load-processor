export APP_VERSION=0.03

./gradlew bootJar

echo "start building docker image"
docker build -t ashan97/aws-load-processor:v${APP_VERSION} .
echo "finished building docker image"

echo "start pushing image to docker hub"
docker push ashan97/aws-load-processor:v${APP_VERSION}
echo "finished pushing image to docker hub"

sleep 5

