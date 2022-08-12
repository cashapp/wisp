plugins {
    `gradle-enterprise`
}

dependencyResolutionManagement {
    versionCatalogs {
        create("testLibs") {
            from(files("${rootDir}/gradle/test-libs.versions.toml"))
        }
    }
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

include(":wisp-aws-environment")
include(":wisp-bom")
include(":wisp-client")
include(":wisp-config")
include(":wisp-containers-testing")
include(":wisp-deployment")
include(":wisp-deployment-testing")
include(":wisp-feature")
include(":wisp-feature-testing")
include(":wisp-launchdarkly")
include(":wisp-lease")
include(":wisp-lease-testing")
include(":wisp-logging")
include(":wisp-logging-testing")
include(":wisp-moshi")
include(":wisp-resource-loader")
include(":wisp-resource-loader-testing")
include(":wisp-ssl")
include(":wisp-task")
include(":wisp-time-testing")
include(":wisp-token")
include(":wisp-token-testing")
include(":wisp-tracing")
