[![Build Status](https://travis-ci.org/ExampleDriven/spring-boot-aws-elasticbeanstalk-example.svg?branch=master)](https://travis-ci.org/ExampleDriven/spring-boot-aws-elasticbeanstalk-example)

This is the source code for the blog post

https://exampledriven.wordpress.com/2017/01/09/spring-boot-aws-elastic-beanstalk-example/


## Steps
### Prerequisites 
1. Install eb CLI http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/eb-cli3-install.html
2. Change application to listen on port 5000
3. eb init
4. To make EB deploy artifact instead of source code add the following

```bash
deploy:
     artifact: target/spring-boot-aws-example-0.0.1-SNAPSHOT.jar
```

## Create the EB application and environment (only needed if not already exists)
5. mvn clean install (this is needed so the environment can be created and artifacts deployed immediately)
6. eb create or eb create -s to create without loadbalancer

## Deploy to an already existing AWS application
7. mvn clean install
8. eb deploy



## Using the beanstalker maven plugin
Create environment
 
    mvn beanstalk:upload-source-bundle beanstalk:create-application-version beanstalk:create-environment

Update application

    mvn beanstalk:upload-source-bundle beanstalk:create-application-version beanstalk:update-environment

## Cleanup
To avoid being charged, stop or delete all infrastructure components created, including :
- EC2 instances
- Load balancers

The easiest and safest way to do it is to use the command line

```bash
# list all eb environments
eb list

# terminate an environment
eb terminate <<env name>>
```


