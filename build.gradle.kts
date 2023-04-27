plugins {
    idea
    `java-library`
}

group = "io.gourd"
version = "1.0"

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.26")
    annotationProcessor("org.projectlombok:lombok:1.18.26")
    implementation("org.slf4j:slf4j-api:2.0.7")
    implementation("ch.qos.logback:logback-core:1.4.7")
    implementation("ch.qos.logback:logback-classic:1.4.7")

    testCompileOnly("org.projectlombok:lombok:1.18.26")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.26")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}
