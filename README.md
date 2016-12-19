## Steps
### Prerequisites 
1. Install eb CLI http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/eb-cli3-install.html#eb-cli3-install-osx
2. Change application to listen on port 5000
3. eb init

## Create the AWS application (only needed if not already exists)
6. mvn clean install
5. eb create (needed only if the application is not yet created)

## Deploy to an already existing AWS application
6. mvn clean install
6. eb deploy (in all consecutive occurrences)

## Cleanup
To avoid being charged stop or delete all infrastructure components created, including :
- EC2 instances
- Load balancers
