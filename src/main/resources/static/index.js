const urls = ["http://78.media.tumblr.com/tumblr_mc0l1cFJSo1r4chwro1_1280.jpg","https://i.pinimg.com/736x/eb/4f/db/eb4fdb08acc7ee728f312c477e2fd02a---girls-weed-girls.jpg", "http://blog.getnugg.com/wp-content/uploads/2015/11/Snoop-Dogg-Smoking-Weed.jpg", "http://www.spliffseeds.nl/images/stories/spliffseeds/en/blog/spliff-to-dab/cannabis-extraction-in-spliff.jpg", "https://www.thefamouspeople.com/profiles/images/lil-dicky-3.jpg","http://www.killerhiphop.com/wp-content/uploads/2012/10/kanye-west.jpg"];

function Spam() {
	document.getElementById("weedy").src =urls[Math.floor(Math.random()*urls.length)];
}
