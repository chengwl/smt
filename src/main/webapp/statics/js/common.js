/** 去空格 .trim() */
String.prototype.trim=function() {
	    return this.replace(/(^\s*)|(\s*$)/g,'');
}