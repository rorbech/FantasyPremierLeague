
buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven(url = "http://oss.jfrog.org/artifactory/oss-snapshot-local")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0-beta03")
        classpath("com.android.tools.build:gradle:4.2.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}")
        classpath("io.realm.kotlin:gradle-plugin:${Versions.realm}")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven(url = "https://kotlin.bintray.com/kotlinx/")
        maven(url = "http://oss.jfrog.org/artifactory/oss-snapshot-local")
    }
}


