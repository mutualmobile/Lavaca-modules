Spring integration
==============
Integrate your Lavaca app with Spring

Note about templates
-------------
Lavaca uses the [LinkedIn fork of dust.js](https://github.com/linkedin/dustjs) with the [LinkedIn dust-helpers](https://github.com/linkedin/dustjs-helpers) as the default template system. However, the compiler here is from the [x-dust templating library](https://github.com/dannichols/x-dust), which supports the same syntax as regular dust.js without the LinkedIn helpers. If you wish to render templates in Spring, you must use a templating syntax supported by the x-dust library. You can use the javascript version of the x-dust library directly in your Lavaca app with the [x-dust Lavaca module](https://github.com/mutualmobile/Lavaca-modules/tree/master/x-dust).