FROM openjdk:21

COPY target/nimsara_portfolio_bot.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","nimsara_portfolio_bot.jar"]