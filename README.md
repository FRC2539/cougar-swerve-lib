# Cougar Swerve Library

This is a fork of the original SDS Swerve Library. It implements features that we find useful such as:

- CANivore support
- Direct access to motor controllers
- Optional drive motor direction inversion
- Access to motor temperatures

# Usage

To use this library, add the following to your `build.gradle`:

```
repositories {
    mavenCentral()
}
```

This allows the project to fetch modules from the Maven Central Repository.

Next, add the following to the end of the `dependencies` list:

```
implementation 'com.team2539:cougar-swerve-lib:1.1.0'
```

**Replace 1.1.0 with the most recent version available.**

You may have to build once, but now you can import any files you need from the library.

Example:

```
import com.team2539.cougarswervelib.SwerveModule;
```
