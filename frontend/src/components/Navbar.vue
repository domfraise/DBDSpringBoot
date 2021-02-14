<template>
    <section>
      <nav class="navbar is-link is-size-5 is-fixed-top">
        <div class="navbar-brand">
          <router-link class="navbar-item" to="/" title="Logo" >
            <img src="../assets/DF.png" alt="DF">
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
            <router-link class="navbar-item" to='/projects'>Projects</router-link>
            <router-link class="navbar-item" to="/contact">Contact</router-link>
            <a class="navbar-item" href='http://www.github.com/domfraise' target="">
              <span class="icon"><i class="fab fa-github fa-lg"></i></span>
            </a>

          </div>
        </div>
      </nav>
    </section>
</template>


