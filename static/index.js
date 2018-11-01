const urls = ["http://78.media.tumblr.com/tumblr_mc0l1cFJSo1r4chwro1_1280.jpg","https://i.pinimg.com/736x/eb/4f/db/eb4fdb08acc7ee728f312c477e2fd02a---girls-weed-girls.jpg", "http://blog.getnugg.com/wp-content/uploads/2015/11/Snoop-Dogg-Smoking-Weed.jpg", "http://www.spliffseeds.nl/images/stories/spliffseeds/en/blog/spliff-to-dab/cannabis-extraction-in-spliff.jpg", "https://www.thefamouspeople.com/profiles/images/lil-dicky-3.jpg","http://www.killerhiphop.com/wp-content/uploads/2012/10/kanye-west.jpg"];

configueNavBar()

function Spam() {
	document.getElementById("weedy").src =urls[Math.floor(Math.random()*urls.length)];
}

function configueNavBar(){
    document.addEventListener('DOMContentLoaded', () => {

      // Get all "navbar-burger" elements
      const $navbarBurgers = Array.prototype.slice.call(document.querySelectorAll('.navbar-burger'), 0);

      // Check if there are any navbar burgers
      if ($navbarBurgers.length > 0) {

        // Add a click event on each of them
        $navbarBurgers.forEach( el => {
          el.addEventListener('click', () => {

            // Get the target from the "data-target" attribute
            const target = el.dataset.target;
            const $target = document.getElementById(target);

            // Toggle the "is-active" class on both the "navbar-burger" and the "navbar-menu"
            el.classList.toggle('is-active');
            $target.classList.toggle('is-active');

          });
        });
      }

    });
}
