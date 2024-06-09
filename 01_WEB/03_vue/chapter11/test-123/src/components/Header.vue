<template>
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid d-flex">
      <!-- 왼쪽 네비게이션 바 토글 버튼 및 링크 -->
      <div class="d-flex flex-grow-1" style="flex-basis: 33%;">
        <button
          class="navbar-toggler"
          type="button"
          @click="isNavShow = !isNavShow"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div :class="['collapse', 'navbar-collapse', { show: isNavShow }]">
          <ul class="navbar-nav">
            <li class="nav-item">
              <router-link class="nav-link" to="/"> 홈 </router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="/history"> 거래내역 </router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="/modification"> 수정 </router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="/setting"> 프로필설정 </router-link>
            </li>
          </ul>
        </div>
      </div>
      <!-- 중앙 브랜드 이름 -->
      <div class="navbar-brand text-center flex-grow-1" style="flex-basis: 33%;">
        <router-link class="text-decoration-none" to="/" style="font-family: 'Arial', sans-serif; font-size: 18px; color: rgb(9, 155, 99);">
          순다르 피차이
        </router-link>
      </div>
      <!-- 오른쪽 빈칸 -->
      <div class="flex-grow-1" style="flex-basis: 33%;"></div>
    </div>
  </nav>
</template>

<script setup>
import { ref } from 'vue';

const isNavShow = ref(false);
</script>
