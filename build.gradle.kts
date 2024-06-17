plugins {
    id("java")
}

group = "org.frc4079"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val lombokV = "1.18.32"
    val junitV = "5.10.2"
    val miglayoutV = "11.3"
    val mdlafV = "1.1.4"
    val gauthV = "1.23.0"
    testImplementation(platform("org.junit:junit-bom:$junitV"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.projectlombok:lombok:$lombokV")
    implementation("io.github.vincenzopalazzo:material-ui-swing:$mdlafV")
    implementation("com.miglayout:miglayout-swing:$miglayoutV")
    implementation("com.google.auth:google-auth-library-oauth2-http:$gauthV")
}

tasks.test {
    useJUnitPlatform()
}