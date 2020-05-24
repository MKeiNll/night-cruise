# nightcruise

A personal website.
Made on Spring Boot.
Uses Thymeleaf, Sass & Gradle.

## Features

+ Internationalization - 100% of the text is translated to 3 languages: English, Estonian & Russian.
+ 3 visual themes - light, dark & vivid. Each theme completely changes the look of the website, without changing the interface layout.
+ Date entries - all projects have creation/updation dates, which are also being visually represented by moon phase icons - the more time has passed since then, the closer the icon is to the new moon.

## Code features

+ Developed on Java 11.
+ Redirect to home page happens on any error / unexisting page query.
+ Theme & language preferences are stored in cookies, which are being set via POST requests.

## Running the app

`bootRun` - runs this project as a Spring Boot application.\
`bootWar` - assembles an executable war archive.\
`sassCompile` - compiles SCSS into CSS. Automatically runs before `bootRun` & `bootWar` tasks.
