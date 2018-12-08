<template>
    <section class="section">
      <nav class="navbar is-link is-size-5">
        <div class="navbar-brand">
          <router-link class="nav-item" to="/" title="Logo">
            <img src="images/DF.png" alt="DF" width="50" height="50">
          </router-link>

          <div class="navbar-burger burger" data-target="navMenu">
            <span></span>
            <span></span>
            <span></span>
          </div>
        </div>
        <div id="navMenu" class="navbar-menu">
          <div class="navbar-start">

          </div>
          <div class="navbar-end has-text-centered">
            <router-link class="navbar-item" to='/'>Home</router-link>
            <a class="navbar-item disabled-nav">Projects</a>
            <a class="navbar-item disabled-nav">Experience</a>
            <a class="navbar-item disabled-nav">Contact</a>
            <a class="navbar-item" href='http://www.github.com/domfraise' target="">
              <span class="icon"><i class="fab fa-github fa-lg"></i></span>
            </a>

          </div>
        </div>
      </nav>
    </section>
</template>


