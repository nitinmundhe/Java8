/*
 * 
 *
print("Hello World");
C:\Program Files\Java\jdk1.8.0_121\bin


C:\Program Files>jjs C:\Users\Admin\Desktop\sample.js
Hello World

C:\Program Files>jjs
jjs> print("Hello World")
Hello World
jjs> quit()


C:\Program Files>jjs -- a b c
jjs> print('Letters:'+arguments.join(","))
Letters:a,b,c
jjs>

 */

var fun1 =function(name){
	print("Hi There from JavaScript "+name);
	return "greeting from JavaScript Function 1";
}

var fun2 = function(object){
	print("JS Class Definition: "+ Object.prototype.toString.call(object));
	return object;
}