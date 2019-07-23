# Modularisation via Maven
This project demonstrates how to create multiple modules depending on one core module. Let's assume there are 3 modules Core, First and Second.
Both First and Second modules are dependent on Core to compile/run. Your consumers are gonna integrate with either First/Second or both and not
Core. Hence, you need to keep in mind that the functionality of core must not be exposed.

## Deployment process
1. Build the whole project using command ./gradlew clean build
2. Deploy the obfuscated release flavor of core, first and second in jCenter
3. In a sample app, try adding one of the following dependency in build.gradle or both
   - implementation 'com.sample.modular:sample-first:1.0.0'
   - implementation 'com.sample.modular:sample-second:1.0.0'
4. Observe in external dependencies folder in Android Studio, core is automatically fetched