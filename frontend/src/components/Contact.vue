<template>
  <section class="section has-text-centered ">
    <h2 class="title is-2">Contact</h2>
    <div class="container is-outlined">
      <div class="columns">
        <div class="column is-8">
          <h3 class="subtitle is-3">Leave Feedback</h3>
          <form>
            <div class="field is-horizontal">
              <div class="field-body">
                <div class="field">
                  <p class="control is-expanded has-icons-left">
                    <input class="input" v-model="name" title="name" placeholder="John Doe"/>
                    <span class="icon is-small is-left">
                      <i class="fas fa-user"></i>
                    </span>
                  </p>
                </div>
                <div class="field">
                  <p class="control is-expanded has-icons-left">
                    <input class="input" v-model="email" title="email" placeholder="email@domain.com"/>
                    <span class="icon is-small is-left">
                      <i class="fas fa-envelope"></i>
                    </span>
                  </p>
                </div>
              </div>
            </div>
            <div class="field">
              <textarea title="Message" class="textarea" v-model="feedback" placeholder="Leave your thoughts..."></textarea>
            </div>
            <div class="field">
              <button class="button is-primary" type="button" @click="submitFeedback()">Submit</button>
            </div>
          </form>
        </div>
        <div class="column">
          <h4 class="subtitle is-4"><i class="fas fa-envelope"></i> domfraise@gmail.com</h4>
        </div>

      </div>
    </div>


  </section>
</template>

<script>
  export default {
    name: "Contact",
    data: () => ({
      name: "",
      email: "",
      feedback:  "",
    }),
    methods: {
      submitFeedback: function () {
        console.log(this.name);
        console.log(this.email);
        console.log(this.feedback);
      }
    }
  }
</script>

<style scoped>

</style>