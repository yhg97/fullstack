<template>
  <div id="aaa">
    <Header v-if="showHeader" />
    <div class="wrapper wrapper--w780">
      <div class="card card-3">
        <div class="card-heading"></div>
        <div class="card-body" style="width: 800px">
          <h2 class="title">간단 프로필 설정</h2>
          <form @submit.prevent="handleSubmit">
            <div class="input-group">
              <input
                class="input--style-3"
                type="text"
                placeholder="이름"
                v-model="profile.name"
              />
            </div>
            <div class="input-group">
              <input
                class="input--style-3 js-datepicker"
                type="text"
                placeholder="생일"
                v-model="profile.date"
              />
              <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
            </div>
            <div class="input-group">
              <input
                class="input--style-3"
                type="text"
                placeholder="휴대폰 번호"
                v-model="profile.phone"
              />
            </div>
            <div class="input-group">
              <input
                class="input--style-3"
                type="text"
                placeholder="닉네임"
                v-model="profile.nickname"
              />
            </div>

            <div class="p-t-10">
              <button class="btn btn--pill btn--green" type="submit">
                저장
              </button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { reactive } from 'vue';
import Header from '../components/Header.vue';
import { useRouter } from 'vue-router';
import { useprofileStore } from '../stores/profileStore';
import '../assets/css/main.css';

const router = useRouter();
const profileStore = useprofileStore(); // profileStore 인스턴스 생성

const profile = reactive({
  id: '1', // 업데이트하려는 리소스의 ID
  name: '',
  date: '',
  phone: '',
  nickname: '',
});

const showHeader = router.currentRoute.value.path !== '/';

const handleSubmit = async () => {
  const profileItem = {
    date: profile.date,
    name: profile.name,
    phone: profile.phone,
    nickname: profile.nickname,
  };
  await profileStore.addProfile(profile.id, profileItem);
  router.push('/home');
};
</script>

<style scoped>
.aaa {
  background: linear-gradient(
    to right,
    #ff7e5f,
    #feb47b
  ); /* 예시 그라데이션 색상 */
  padding: 20px;
}
</style>
