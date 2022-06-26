# Cougar Swerve Library

This is a fork of the original SDS Swerve Library. It implements features that we find useful such as:

- CANivore support
- Direct access to motor controllers
- Optional drive motor direction inversion

## Usage

Begin by adding this project as a git submodule.

Run (**in the root directory of your project**):

`git submodule add https://github.com/FRC2539/cougar-swerve-lib.git cougar-swerve-lib`

### Importing The Library

In `build.gradle` add the following at the end of the dependencies list:

```
implementation project(':cougar-swerve-lib')
```

In `settings.gradle` add the following to the end of the file:

```
include ':cougar-swerve-lib'
project(':cougar-swerve-lib').projectDir = new File('../cougar-swerve-lib')
```

### Preventing Formatting Errors

If your project uses spotless or another formatter that runs checks during a build, you'll need to ignore the submodule folder.

For spotless, change your configuration from something like this:

```
spotless {
   java {
      target fileTree('.') {
            include '**/*.java'
            exclude '**/build/**', '**/build-*/**'
      }
      toggleOffOn()
      palantirJavaFormat()
      removeUnusedImports()
      trimTrailingWhitespace()
      endWithNewline()
   }
}
```

to something like this (exclusion added):

```
spotless {
   java {
      target fileTree('.') {
            include '**/*.java'
            exclude '**/build/**', '**/build-*/**'
            exclude 'cougar-swerve-lib'
      }
      toggleOffOn()
      palantirJavaFormat()
      removeUnusedImports()
      trimTrailingWhitespace()
      endWithNewline()
   }
}
```