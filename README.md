
### [![YouTube Play Icon](http://youtube.com/favicon.ico)](https://www.youtube.com/watch?v=v3PxKDMehvY&list=PLTcKayTjao6rOj02gtRdiVhvzB1SWGyhv&index=2) **on [YouTube](https://www.youtube.com/watch?v=v3PxKDMehvY&list=PLTcKayTjao6rOj02gtRdiVhvzB1SWGyhv&index=2)**

> **why?** calculate sum is used as a quick start template for [vangav backend](https://github.com/vangav/vos_backend) to help new users get to speed within the first 10 minutes; this template covers all the core basics to develop a fully functional backend service without a database

# calculate sum

+ calculate sum service is generated using [vangav backend](https://github.com/vangav/vos_backend)

## prerequisite

+ [vangav backend tutorials](https://github.com/vangav/vos_backend)

## functionality

+ this services takes two floating point numbers as a request and returns the summation of those numbers as a response

## overview

+ this service is based on vangav backend's [calculate sum template](https://github.com/vangav/vos_backend/tree/master/vangav_backend_templates/vos_calculate_sum)
+ this service has the 90+% of the vangav backend's generated code + the 10-% of the logic code needed to complete the service

## try this service

1. *for first timers* - follow the steps in the [system requirements tutorial](https://github.com/vangav/vos_backend#system-requirements)
2. *for first timers* - follow the steps in the [workspace initialization tutorial](https://github.com/vangav/vos_backend#init)
3. download this `vos_calculate_sum.zip` project (from the green `clone or download` button up there) inside the workspace directory created previously (`my_services`) and unzip it
4. **rename** unzipped `vos_calculate_sum-master` to `vos_calculate_sum`
5. in the terminal `cd` to `vos_calculate_sum`
6. start the service: `./_run.sh`
7. from your prefered client (*we recommned* [postman](https://www.getpostman.com/docs/postman/launching_postman/installation_and_updates)) start trying the service; refer to the **features** and **service references** sections for reference
+ at the end to stop the service: press `control + d` in the terminal session where the service was started in (6)

## eclipse

+ follow the following steps to import the downloaded backend service in eclipse

1. `cd` to the service's directory and execute the `./_eclipsify.sh` script
2. file **>** import **>** general **>** existing projects into workspace **>** next **>** set "select root directory" to my_services **>** under projects make sure that vos_calculate_sum is selected **>** finish
3. double check the java version used for compiling the project: right click the project **>** properties **>** java compiler **>** enable project specific settings **>** compiler compliance level **>** 1.7 or 1.8

## covered topics

+ generating a simple service

## features

| controller | feature |
| ---------- | ------- |
| [calculate sum](https://github.com/vangav/vos_calculate_sum/tree/master/app/com/vangav/vos_calculate_sum/controllers/calculate_sum) | adds up two floating point numbers |

## service references

| reference | explanation |
| --------- | ----------- |
| [routes](https://github.com/vangav/vos_calculate_sum/blob/master/conf/routes) | api routes |
| [controllers.json](https://github.com/vangav/vos_calculate_sum/blob/master/generator_config/controllers.json) | api request/response's elements |
| [controllers](https://github.com/vangav/vos_calculate_sum/tree/master/app/com/vangav/vos_calculate_sum/controllers) | api implementation |

## change log

+ this section lists the 10-% code added after vangav backend generated 90+% of the code

| file/dir | change |
| -------- | ------ |
| [controllers](https://github.com/vangav/vos_calculate_sum/tree/master/app/com/vangav/vos_calculate_sum/controllers) | added the implementation of request-to-response logic in `processRequest` methods under `controller_name/HandlerControllerName.java` classes |

# share

[![facebook share](https://www.prekindle.com/images/social/facebook.png)](https://www.facebook.com/sharer/sharer.php?u=https%3A//github.com/vangav/vos_backend)  [![twitter share](http://www.howickbaptist.org.nz/wordpress/media/twitter-64-black.png)](https://twitter.com/home?status=vangav%20backend%20%7C%20build%20big%20tech%2010x%20faster%20%7C%20https%3A//github.com/vangav/vos_backend)  [![pinterest share](http://d7ab823tjbf2qywyt3grgq63.wpengine.netdna-cdn.com/wp-content/themes/velominati/images/share_icons/pinterest-black.png)](https://pinterest.com/pin/create/button/?url=https%3A//github.com/vangav/vos_backend&media=https%3A//scontent-mad1-1.xx.fbcdn.net/v/t31.0-8/20645143_1969408006608176_5289565717021239224_o.png?oh=acf20113a3673409d238924cfec648d2%26oe=5A3414B5&description=)  [![google plus share](http://e-airllc.com/wp-content/themes/nebula/images/social_black/google.png)](https://plus.google.com/share?url=https%3A//github.com/vangav/vos_backend)  [![linkedin share](http://e-airllc.com/wp-content/themes/nebula/images/social_black/linkedin.png)](https://www.linkedin.com/shareArticle?mini=true&url=https%3A//github.com/vangav/vos_backend&title=vangav%20backend%20%7C%20build%20big%20tech%2010x%20faster&summary=&source=)

# free consulting

[![vangav's consultant](http://www.footballhighlights247.com/images/mobile-share/fb-messenger-64x64.png)](https://www.facebook.com/mustapha.abdallah)
