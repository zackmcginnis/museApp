## Score predictor for NCAA football

- Gives predicted score total (both teams combined)
- Utilizes stats relating to: points scored/game, points allowed/game, yards per play, yards per play allowed, offensive pace, offensive pace against, etc
- Compares with Vegas projected game total
- Uses a modified starter template from https://github.com/loicknuchel/ionic-starter
- Thanks to loicknuchel for providing a robust and clean template to work with

## Getting started

- install nodejs, npm, gulp, bower, cordova, ionic & sass (if not already done)
- `git clone git@github.com:loicknuchel/ionic-starter.git` : clone this repo
- `cd ionic-starter` : go to folder
- `bower install` : install app dependencies
- `npm install` : install build dependencies
- `ionic setup sass` : use sass
- `ionic serve` : start the app on your browser

For the impatients, you can run all these commands in one time : `git clone git@github.com:loicknuchel/ionic-starter.git && cd ionic-starter && bower install && npm install && ionic setup sass && ionic serve`

To run the app on your android device :

- `ionic platform add android` : add android platform to the project
- `ionic resources` : generate icon & splash-screen for project platforms
- `ionic run android` : run your app !

Once again, in one command : `ionic platform add android && ionic resources && ionic run android`

## Personnalize

As it's only a template project, you may want to change its name. For that, you just have to open :

- `config.xml` (widget id, name, description & author)
- `www/index.html` (title)
- `bower.json` (name, homepage, author & description)
- `package.json` (name & description)
- `ionic.project` (name)

## Used versions

- Node v4.2.2 (`node -v`)
- Cordova 5.4.0 (`cordova -version`)
- Bower 1.7.0 (`bower -v`)
- Angular 1.4.3 (see bower.json)
- Ionic 1.2.0 (see bower.json)

## Infos

### Browser development

- Chrome cordova : https://chrome.google.com/webstore/detail/cordova-mocks/iigcccneenmnplhhfhaeahiofeeeifpn (https://github.com/pbernasconi/chrome-cordova)

### Android debug

- android remote debug : https://developer.chrome.com/devtools/docs/remote-debugging
- activate developer mode on android

### Specific urls

Use these custom urls to open other apps using inappbrowser (org.apache.cordova.inappbrowser)

- "tel:0123456789" => call this number
- "sms:0123456789?body=coucou" => send sms to this number
- "geo:lat,lon" => open google map to this geoloc
- "mailto:toto@example.com" => send an email
- "market:???"

see http://stackoverflow.com/questions/26271313/tel-sms-and-mailto-no-longer-working-in-android-after-upgrading-to-cordo

### Other links

- Push
    - https://github.com/hollyschinsky/PushNotificationSample
- Unit test
    - https://bradb.net/unit-testing-with-the-ionic-framework/
    - http://forum.ionicframework.com/t/ionic-and-karma-unittest/8799
- Data
    - PouchDB (http://devgirl.org/2014/12/30/sync-data-using-pouchdb-in-your-ionic-framework-app/)
