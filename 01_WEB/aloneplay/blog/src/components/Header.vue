<script setup>
import { useRoute } from 'vue-router';
</script>

<template>
  <header>
    <div class="nav">
      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/login">About</RouterLink>
      </nav>
    </div>
  </header>
</template>
