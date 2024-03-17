# Documentation

Documentation for my api
* [Github repository for this](https://github.com/DamienRoussos/kotlin-springboot-api)

* Prerequisites

: Install Docker [Intructions on how to install Docker for your machine from the official Docker website](https://docs.docker.com/engine/install/)

## Get started

1. **Clone the Repository**:
```
   git clone <repository-link-found-above>
   cd <kotlin-api>
```

2. **Build the Docker Image** (pick your name):
```
   docker build -t <image-name> .
```

3. **Run the Docker Container** (use the name you used to build the image):
```
   docker run -p 8080:8080 <image-name>
```
4. **Access the Application**:  
   Open a web browser and navigate to [http://localhost:8080](http://localhost:8080) to access the application.  
   Or use the curl commands given below to access the application from your terminal if you have curl installed.

Example get request
```shell
curl 'localhost:8080/'
```

Example post request
```shell
curl -X POST 'localhost:8080/hello' --header 'Content-Type: application/json' --data '{
    "user": "<your_name_here>"
}'
```

Example login request
```shell
curl 'localhost:8080/login' --header 'username: <your_username>' --header 'password: <your_password>'
```