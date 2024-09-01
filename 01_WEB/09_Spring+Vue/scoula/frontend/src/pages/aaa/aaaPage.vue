<script setup>
import authApi from '@/api/authApi';
import { useAuthStore } from '@/stores/auth';
import { reactive } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter();
const auth = useAuthStore();
const member = reactive({
  username: auth.username  // 초기값을 빈 문자열로 설정
});

// 제출 처리 함수 (필요에 따라 구현)
const onSubmit = () => {
 router.push('/')
  console.log('Submitted username:', member.username);
};
</script>

<template>
  <h1>늙뮰맑 페이지</h1>
  <form @submit.prevent="onSubmit">
    <div class="mb-3 mt-3">
      아이디: {{ member.username }}
      <input
        type="text"
        class="form-control"
        v-model="member.username" 
      />
    </div>
    <button
      type="submit"
      class="btn btn-primary mt-4 me-3"
    >
      <i class="fa-solid fa-user-plus"></i>
      확인
    </button>
  </form>
</template>
