## Muse app

- This application requires the Muse Headband hardware to function properly
- Can be purchased here http://www.choosemuse.com/
- The Muse Headband comes with an application which reads and detects eeg, alpha waves, and accelerometer data collected from the headband
- This application is similar in that we will primarily be detecting alpha wave presence and strength
- The primary difference is that this application will attempt to lower alpha wave presence and strength (rather than attempting to increase them, as the default Muse app does)
- The idea is based off of studies which correlate lower alpha wave presence during learning activites (reading, studying, etc)
- This application will provide feedback to the user regarding their alpha wave status in an attempt to encourage active learning and retention during the aforementioned activites

## Getting started

- install latest version of Android Studio
- connect Android phone (apk 23 or later) to pc via usb
- ensure developer mode is enabled on mobile android device

To run the app on your android device :

- clone museApp repo onto your pc
- open Android Studio, select 'open existing project'
- navigate to and select '/museApp'
- from the 'build' tab, select 'make project'
- after build success, from the 'run' tab, select 'run app'
- application will be deployed to your mobile device

## To Do:

- The first iteration of this project will simply have a menu screen, settings screen, and action screen
- The menu screen will provide buttons to the settings and action screens
- Settings will only include "timer duration" at the moment
- Action screen will display a real-time graph of alpha and beta waves
- The action screen will function for the duration of the timer