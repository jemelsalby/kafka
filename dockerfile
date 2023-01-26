# define base docker image
FROM openjdk:19
LABEL maintainer="Redbull_Group"
ADD target/kafkaToKafka-0.0.1-SNAPSHOT.jar kafkatokafka
ENTRYPOINT ["java","-jar","kafkatokafka"]