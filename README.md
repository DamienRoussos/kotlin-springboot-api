# Documentation

Documentation for my api
* [Github repository for this](https://github.com/DamienRoussos/kotlin-springboot-api)

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