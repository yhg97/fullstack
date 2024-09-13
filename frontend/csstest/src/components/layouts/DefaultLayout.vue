<script setup>
// import Header from './Header.vue';
// import NavBar from './NavBar.vue';
import Aside from './Aside.vue';
</script>

<template>
  <div class="container">
    <!-- <Header /> -->
    <!-- <NavBar /> -->
    <div class="content my-5 px-3">
      <slot></slot>
    </div>
    <Aside />
  </div>
</template>
