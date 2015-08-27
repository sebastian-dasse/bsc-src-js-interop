"use strict";

var FooJSFunction = function() {
  return {
    sayHello: function(arg) {
      return "Hello-hello from JavaScript!  -  You passed an argument: " + arg;
    }
  };
};

var FooJSObject = {
  sayHello: function(arg) {
    return "Hello-hello from JavaScript!  -  You passed an argument: " + arg;
  }
};