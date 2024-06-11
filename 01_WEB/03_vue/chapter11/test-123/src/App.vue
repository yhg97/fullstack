<script setup>
import { RouterLink, RouterView } from 'vue-router';
import Header from './components/Header.vue';
</script>

<template>
  <header>
    <div class="wrapper">
      <Header />
    </div>
  </header>
  <div class="abc">
    <router-view />
  </div>
</template>

<style scoped>
 @media (min-width: 1199px){
  .wrepper{
    display: flex;
  }

  .abc{
    padding-left:  300px;
  }}
</style>
