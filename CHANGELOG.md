Change Log
==========

Version 1.0.6 *(2022-08-05)*
----------------------------

* Return JSON string without converting into an object from LD client


Version 1.0.5 *(2022-07-21)*
----------------------------

* Gradle 7.5
* Revert io.micrometer:micrometer-registry-prometheus to 1.8.4


Version 1.0.4 *(2022-07-21)*
----------------------------

* Upgrade dependencies and fix test for the library change

Dependency changes:

* org.assertj:assertj-core:3.20.2 -> 3.23.1
* software.amazon.awssdk:regions:2.17.198 -> 2.17.234
* org.bouncycastle:bcprov-jdk15on:1.69 -> 1.70
* com.sksamuel.hoplite:hoplite-\*:2.1.5 -> 2.3.3
* com.github.jnr:jnr-unixsocket:0.38.8 -> 0.38.17
* org.jetbrains.kotlinx:binary-compatibility-validator:0.10.1 -> 0.11.0
* org.jetbrains.kotlin:kotlin-bom:1.7.0 -> 1.7.10
* org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0 -> 1.7.10
* org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.3 -> 1.6.4
* ch.qos.logback:logback-classic:1.2.3 -> 1.2.11
* io.micrometer:micrometer-registry-prometheus:1.8.4 -> 1.9.2
* org.mockito:mockito-core:3.11.2 -> 4.6.1
* io.netty:netty-bom:4.1.74.Final -> 4.1.79.Final
* com.squareup.okhttp3:okhttp:4.10.0-RC1 -> 4.10.0
* com.squareup.okio:okio:3.1.0 -> 3.2.0"
* com.google.protobuf:protobuf-gradle-plugin:0.8.17 -> 0.8.19
* org.slf4j:slf4j-api:1.7.32 -> 1.7.36"


Version 1.0.3 *(2022-07-19)*
----------------------------

* Drop versions from kotlin BOM-listed artifacts
* Stop exporting the kotlinBom as an api dependency
* Remove unused dependencies

Version 1.0.2 *(2022-07-13)*
----------------------------

* fix: init file system watcher lazily
* fix: kotlin1.7 support for the build


Version 1.0.1 *(2022-07-08)*
----------------------------

* feature: Upgrade to kotlin 1.7
* fix: cashapp not squareup for urls


Version 1.0.0 *(2022-06-22)*
----------------------------

Initial release.

Ready for Production use.


Version 0.0.1-alpha *(2022-06-17)*
----------------------------------

Initial publishing test release.

Not for Production use.
