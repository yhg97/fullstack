<script setup>
import { RouterLink, RouterView } from 'vue-router';
import Header from './components/Header.vue'
import Footer from './components/Footer.vue'

</script>

<template>
  <header>
    <div class="wrapper">
      <Header/>
      <router-view />
    </div>
  </header>
  <Footer/>
</template>

<style scoped>

</style>
