# Lab: 04 - Bitmap

## What this project do:
In this project we read from bitmap file and modify them in 4 ways (the methods are in this file [Bitmap](app/src/main/java/lab4/Bitmap.java)):
1. reverseBlackAndGreen: this method is looking for the black and white colors and change the black to green and the white to black
2. random: this method is to change any color to a random color by dividing the rgb value by 2
3. stretchVertically: this method stretch the width twice by duplicating each pixel twice
4. stretchHorizontally: this method stretch the height twice by duplicating each pixel twice

## Tests
1. In this [folder](app/src/test) I have a test for every method and it is done by creating a dummy bitImage of 4px width and height half white and half black
2. the tests are [here](app/src/test/java/bitmap/transformer/AppTest.java)
3. the test results are [here](app/src/test/resources)

## How it works:

1. from the terminal enter this command ./gradlew run --args
2. after that enter a space then 'inputFile outputFile transform':
    - inputFile: the name of the required image, and it must be in the [resources](app/src/main/resources) folder
    - outputFile: the name of the edited image (enter any name), and it must be in the [resources](app/src/main/resources) folder
    - transform: what do you want to do with that image you can choose only from:
        - blackgreen
        - random
        - stretchvertically
        - stretchvorizontally

## Contributors

1. Doa'a Daban
2. Rahaf Al-Jazzazi