# 

## Model
www.msaez.io/#/storming/complainment

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- receipt
- payment
- user
- search
- 통계
- 연계
- complaint


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- receipt
```
 http :8088/complainments id="id" complainId="complainId" userId="userId" complainDetail="ComplainDetail" 
```
- payment
```
 http :8088/fees id="id" 접수번호="접수번호" 수수료="수수료" 
```
- user
```
 http :8088/users id="id" residentNumber="residentNumber" 
```
- search
```
 http :8088/searchEngines id="id" 
```
- 통계
```
 http :8088/starSchemes id="id" 
```
- 연계
```
 http :8088/연계 id="id" 
```
- complaint
```
 http :8088/complaints complainId="complainId" result="result" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

