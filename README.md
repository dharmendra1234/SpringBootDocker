
# SpringBootDocker

# Please follow the below steps to run Springboot application on Docker

1) Install Docker Toolbox

2) Download the project

3) Start the Docker Quick Start Terminal

4) Navigate the project Ex. C:\dharm\projectsspringboot\SpringBootDocker

5) Use the below command mvn clean mvn build docker build -f Dockerfile -t app . docker run -p 8787:8787 -t app

6) Navigate the URL http://192.168.99.100::8787/ (Note :check the virtual machin address)

If you have any questions, please email @dharmendra.pawar@gmail.com
