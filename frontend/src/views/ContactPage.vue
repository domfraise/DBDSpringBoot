<template>
  <div class="contact">
    <Navbar />
    <Contact />
    <Footer />
  </div>
</template>

<script>
  import Navbar from "../components/Navbar"
  import Contact from "../components/Contact"
  import Footer from "../components/Footer"
  export default {
    name: "contact",
    components: {
      Navbar,
      Contact,
      Footer
    }
  }
</script>