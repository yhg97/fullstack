<template>
  <div>
    <VueDatePicker
      v-model="selectedDate"
      @update:model-value="handleDateChange"
    />
    <div v-if="isLoading">로딩 중...</div>
    <div v-else>
      <div v-if="error">에러: {{ error }}</div>
      <div v-else>
        <div v-for="(item, index) in filteredItems" :key="index">
          <p>날짜: {{ item.date }}</p>
          <p>타입: {{ item.type }}</p>
          <p>카테고리: {{ item.category }}</p>
          <p>금액: {{ item.amount }}</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, computed, onMounted } from 'vue';
import { useInfoDateStore } from '@/stores/DateInfoStore';
import VueDatePicker from '@vuepic/vue-datepicker';
import '@vuepic/vue-datepicker/dist/main.css';

const store = useInfoDateStore();
const selectedDate = ref(null);
const isLoading = ref(false);
const error = ref(null);

const handleDateChange = async (date) => {
  selectedDate.value = date;
  await fetchItems();
};

const fetchItems = async () => {
  try {
    isLoading.value = true;
    await store.fetchData();
  } catch (err) {
    error.value = err.message;
  } finally {
    isLoading.value = false;
  }
};

const filteredItems = computed(() => {
  if (!selectedDate.value) return [];
  const selectedDateString = selectedDate.value.toISOString().split('T')[0];
  return store.items.filter((item) => item.date.startsWith(selectedDateString));
});

onMounted(() => {
  fetchItems();
});
</script>
