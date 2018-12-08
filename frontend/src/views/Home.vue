<template>
  <div class="home">
    <Navbar />
    <Title />
    <Education />
  </div>
</template>

<script>
// @ is an alias to /src
import Navbar from '@/components/Navbar.vue'
import Title from '@/components/Title.vue'
import Education from '@/components/Education.vue'

export default {
  name: 'home',
  components: {
    Navbar,
    Education,
    Title
  }
}
</script>
