<script setup>
import { RouterView } from 'vue-router';
import DefaultLayout from './components/layouts/DefaultLayout.vue';
</script>
<template>
  <DefaultLayout>
    <RouterView />
  </DefaultLayout>
</template>
<style scoped>.body{
cursor: pointer;
cursor: auto;
cursor: url(/src/assets/images/cursor.jpg) 20 30, url(cursor2.png) 20 30, auto;
}
</style>
