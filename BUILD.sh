#!/bin/bash

kotlinc ./src/application/main/input/*.kt ./src/application/main/userdata/*.kt ./src/application/main/userdata/storage/*.kt ./src/application/main/services/*.kt ./src/application/main/providers/exitcodes/*.kt ./src/application/main/providers/*.kt ./src/application/main/*.kt  -cp ./lib/kotlinx-cli-0.2.1.jar -include-runtime -d ./out/artifacts/main.jar