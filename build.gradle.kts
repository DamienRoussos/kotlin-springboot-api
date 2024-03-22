import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.3"
	id("io.spring.dependency-management") version "1.1.4"
	kotlin("jvm") version "1.9.22"
	kotlin("plugin.spring") version "1.9.22"
	kotlin("plugin.jpa") version "1.9.22"
	id("org.liquibase.gradle") version "2.0.2"
}

group = "com.api"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
}

dependencies {

	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.17.0")
	implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.23")

	implementation("org.springframework.boot:spring-boot-starter-web:3.2.3")

	implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.4")

	implementation ("org.liquibase:liquibase-core:4.26.0")
	implementation("org.liquibase:liquibase-gradle-plugin:2.2.1")

	implementation("com.mysql:mysql-connector-j:8.3.0")

	developmentOnly("org.springframework.boot:spring-boot-devtools:3.2.4")
	testImplementation("org.springframework.boot:spring-boot-starter-test:3.2.4")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "21"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

