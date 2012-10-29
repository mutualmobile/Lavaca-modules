X-Dust Template Support
==============

Uses the [x-dust templating library](https://github.com/dannichols/x-dust) along with two additional helpers to support translations and includes in a manner similar to the default Lavaca templating system. 


Syntax differences from default Lavaca template system
-------------
- Does not include any of the [LinkedIn dust-helpers](https://github.com/linkedin/dustjs-helpers)
- To support translations, wrap the key in `{#msg}` tags. You can also include additional parameters to substitute into the string in a manner identical to the default templating system.

		// For reference, here is the default syntax
		// <h1>{@msg key="greeting" p0="{name}"/}</h1>
		
		// Using the data {name: 'Susan'}
		// Assume that for the default language `greeting` is "Hello, {0}!"
		// the following code will output "Hello, Susan!"
		<h1>{#msg p0=name}greeting{/msg}</h1>
- To include another template, use an `{#import}` tag

		// Includes the template named 'person'
		{#include name="person"/}

How to implement
-------------
Add the `XDustTemplate.js` file to your project, and in the script tags for your templates, use the type `text/x-dust-template`.

	<!--Lavaca:templates-->
	<script type="text/x-dust-template" data-name="example" data-src="templates/example.html"></script>
	<script type="text/x-dust-template" data-name="example2" data-src="templates/example2.html"></script>
	<!--/Lavaca:templates-->