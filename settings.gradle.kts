pluginManagement {
  includeBuild("gradle/plugins")
}
plugins {
  id("com.gradle.enterprise") version "3.16.2"
  id("com.gradle.common-custom-user-data-gradle-plugin") version "1.12.2"
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}

apply(from = "$rootDir/gradle/gradle-enterprise.gradle")

rootProject.name = "caffeine"
include("caffeine", "guava", "jcache", "simulator")
