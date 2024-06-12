<script setup>
import { RouterLink, RouterView } from 'vue-router';
import Header from './components/Header.vue';
import { useRouter } from 'vue-router';

const router = useRouter();

// 경로가 '/' 인 경우에만 padding-left: 0 으로 설정
const isHomePage = router.currentRoute.value.path === '/';
</script>

<template>
  <div class="wrapper">
    <Header />
    <div class="abc" :style="{ 'padding-left': isHomePage ? '0' : '300px' }">
      <router-view />
    </div>
  </div>
</template>

<style scoped>
@media (min-width: 1199px) {
  .wrapper {
    display: flex;
    padding-left: 300px;
    padding-top: 40px;
    background: linear-gradient(
      to right,
      #ff7e5f,
      #feb47b
    ); /* 예시 그라데이션 색상 */
  }

  .abc {
    /* '/경로' 에서는 padding-left: 0; */
    padding-left: var(--padding-left, 300px);
  }
}
</style>
