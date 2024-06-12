<template>
  <div class="outer-container">
    <h1 class="h1">입력</h1>
    <div
      class="container d-flex align-items-center justify-content-center col-lg-8 pt-4 pt-lg-0 content"
      data-aos="fade-left"
    >
      <div class="p-2 inner-content" style="">
        <Playground />
        달력이 나오는 곳
      </div>
    </div>
  </div>
</template>

<script setup>
import Playground from '@/components/Playground.vue';
// import DateInfo from '@/components/DateInfo.vue';
</script>

<style scoped>
.h1 {
  text-align: center;
}
.outer-container {
  /* 수평 가운데 정렬 */
  height: 100vh; /* 화면 전체 높이 */
}
.inner-content {
  /* 필요에 따라 크기 조정 */
  width: 100%;
  max-width: 600px;
}
</style>
