# TwigCode Discovery - Central Service for Discovery, Configuration and Monitoring

[![CircleCI](https://circleci.com/gh/TwigCodes/discovery.svg?style=svg)](https://circleci.com/gh/TwigCodes/discovery)

The project is powered by Spring Cloud Config, Spring Cloud Netfilx Eureka and Spring Boot Admin. It acts as the central config server, discovery registry and service monitoring. The purpose of the project is to eliminate the efforts to set up individual config server, service discovery registry and monitoring services, which are commonly used in micro-service architecture.

Despite these tasks are relatively easy by using Spring Cloud stack, but sometimes you may not prefer individual servers for these tasks due to resource-limited issues or maintenance issues. It is very natural to have a central server to be use as all above roles. For your convenience, we published a docker image too.
