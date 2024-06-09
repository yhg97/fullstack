<template>
  <div>
    <form @submit.prevent="submitForm">
      <VueDatePicker
        v-model="date"
        :enable-time-picker="false"
        locale="ko"
        :autoclose="false"
      />
      <div class="input-group mb-3">
        <select v-model="type" class="form-select" id="inputGroupSelect02">
          <option value="" disabled>수입,지출</option>
          <option value="수입">수입</option>
          <option value="지출">지출</option>
        </select>
      </div>
      <div class="input-group mb-3">
        <select v-model="category" class="form-select" id="inputGroupSelect02">
          <option value="" disabled>카테고리</option>
          <option value="금융">금융</option>
          <option value="병원">병원</option>
        </select>
      </div>
      <input class="input-group mb-3" v-model="detailCategory" placeholder="자세한 내용" />
      <input class="input-group mb-3" v-model="amount" type="number" placeholder="Amount" />
      <input class="input-group mb-3" v-model="memo" type="text" placeholder="메모" />
      <button type="submit">저장</button>
    </form>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import VueDatePicker from '@vuepic/vue-datepicker';
import '@vuepic/vue-datepicker/dist/main.css';
import { useDateStore } from '@/stores/dateStore';

const dateStore = useDateStore();

const date = ref(new Date());
const type = ref('');
const category = ref('');
const detailCategory = ref('');
const amount = ref(0);
const memo = ref('');

const submitForm = () => {
  const budgetItem = {
    date: date.value,
    type: type.value,
    category: category.value,
    detailCategory: detailCategory.value,
    amount: amount.value,
    memo: memo.value,
  };
  dateStore.addBudgetItem(budgetItem);
};
</script>

<style scoped>


</style>
