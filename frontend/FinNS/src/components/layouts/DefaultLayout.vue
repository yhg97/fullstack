<script setup>
import Footer from './Footer.vue';
import Header from './Header.vue';
import NavBar from './NavBar.vue';
</script>

<template>
  <div class="container">
    <Header/>
    <NavBar />
    <div class="content my-5 px-3">
      <slot></slot>
    </div>
    <Footer />
  </div>
</template>
