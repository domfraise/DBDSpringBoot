<template>
  <div class="project">
    <Navbar />
    <Flutter />
    <Footer />
  </div>
</template>

<script>
  import Navbar from "../components/Navbar"
  import Flutter from "../components/Flutter"
  import Footer from "../components/Footer"
  export default {
    name: "contact",
    components: {
      Navbar,
      Flutter,
      Footer
    }
  }
</script>