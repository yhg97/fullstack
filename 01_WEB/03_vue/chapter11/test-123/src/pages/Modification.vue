<template>
  <div class="container p-2">
    <div class="d-flex">
      <div class="p-2" style="flex: 1; text-align: center; border: 1px solid">
        <Playground />
        달력이 나오는 곳
      </div>
      <!-- <div
        class="p-2 flex-shrink-1"
        style="flex: 0.3; text-align: center; border: 1px solid"
      >
        <DateInfo />
        클릭시 나오는 정보 출력창
      </div> -->
    </div>
  </div>
</template>

<script setup>
import Playground from '@/components/Playground.vue';
// import DateInfo from '@/components/DateInfo.vue';
</script>

<style scoped></style>
