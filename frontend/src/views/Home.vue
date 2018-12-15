<template>
  <div class="home">
    <Navbar />
    <Title />
    <Education />
    <Languages />
    <Footer />
  </div>
</template>

<script>
// @ is an alias to /src
import Navbar from '@/components/Navbar.vue'
import Title from '@/components/Title.vue'
import Education from '@/components/Education.vue'
import Languages from '@/components/Languages.vue'
import Footer from '@/components/Footer.vue'

export default {
  name: 'home',
  components: {
    Navbar,
    Title,
    Education,
    Languages,
    Footer

  }
}
</script>
