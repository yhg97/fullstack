<template>
  <footer class="bg-dark text-center text-lg-start text-white fixed-bottom">
    <!-- Copyright -->
    <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2)">
      조 이름 :
      <a class="text-white" href="#">순다르 피차이</a>

      <div>
        <a
          class="text-white"
          href="https://github.com/jhchoi1104/Account_book_KB"
          target="_blank"
          style="font-size: 24px"
        >
          <i class="fab fa-github"></i>
        </a>
      </div>
    </div>
    <!-- Copyright -->
  </footer>
</template>

<script setup>
import '@fortawesome/fontawesome-free/css/all.css';
</script>

<style scoped>
footer {
  position: fixed;
  bottom: 0;
  width: 100%;
}
</style>
