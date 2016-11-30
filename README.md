# Joke Telling App

####In this project, I created an app with multiple flavors that uses multiple libraries and Google Cloud Endpoints. The finished app consist of four modules:

1. A Java library that provides jokes
2. A Google Cloud Endpoints (GCE) project that serves those jokes
3. An Android Library containing an activity for displaying jokes
4. An Android app that fetches jokes from the GCE module and passes them to the Android Library for display

<img src="https://lh3.googleusercontent.com/cJQtO_A08shKWZ1NEJxpvdYcfXxoHH87HYldIx_gOoGcoqnnZDTP3ycVqAnZSUMYzHygxhb-nEE_Yv_QmZY=s0#w=1920&h=1080" />

#### Also, I added optional tasks:

1. Added an interstitial ad to the free version. Displayed the ad after the user hits the button, and before the joke is shown.

2. Added Loading Indicator that is shown while the joke is being retrieved, and disappears when the joke is ready.

3. Configured Test Task to tie it all together, created a Gradle task that:

    + Launches the GCE local development server (in Daemon mode, so it doesn't block further execution).
    + Runs all tests.
    + Shuts the server down again.
    
## License
```
Copyright 2016 Julia Kozhukhovskaya

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
