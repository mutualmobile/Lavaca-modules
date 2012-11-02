X-Dust Template Support
==============

Uses the [x-dust templating library](https://github.com/dannichols/x-dust) along with two additional helpers to support translations and includes in a manner similar to the default Lavaca templating system. 


Syntax differences from default Lavaca template system
-------------
- Does not include any of the [LinkedIn dust-helpers](https://github.com/linkedin/dustjs-helpers)
- The Lavaca x-dust implementation does not support the custom `config` helper found in the default Lavaca templating library
- The syntax for Lavaca's custom `msg` helper differs in the x-dust implementation

		// Using the data {name: 'Susan'}
		// Assume that for the default language
		// the translation for `greeting` is "Hello, {0}!"
		// We want the template to render: <h1>Hello, Susan!</h1> 
		
		// Default Lavaca dust.js implementation
		<h1>{@msg key="greeting" p0=name /}</h1>
		
		// Lavaca x-dust.js implementation
		<h1>{#msg p0=name}greeting{/msg}
		
- The syntax for Lavaca's custom `include` helper differs in the x-dust implementation

		// To include another template registered with the name `person`
		
		// Default Lavaca dust.js implementation
		{@include name="person"/}
		
		// Lavaca x-dust.js implementation
		{#include name="person"/}
		
How to implement
-------------
Add the `XDustTemplate.js` file to your project, and in the script tags for your templates, use the type `text/x-dust-template`.

	<!--Lavaca:templates-->
	<script type="text/x-dust-template" data-name="example" data-src="templates/example.html"></script>
	<script type="text/x-dust-template" data-name="example2" data-src="templates/example2.html"></script>
	<!--/Lavaca:templates-->