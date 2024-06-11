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
          <p v-if="item.isEditing">타입: <input v-model="item.editedType" /></p>
          <p v-else>타입: {{ item.type }}</p>
          <p v-if="item.isEditing">
            카테고리: <input v-model="item.editedCategory" />
          </p>
          <p v-else>카테고리: {{ item.category }}</p>
          <p v-if="item.isEditing">
            금액: <input v-model="item.editedAmount" />
          </p>
          <p v-else>금액: {{ item.amount }}</p>
          <button v-if="item.isEditing" @click="cancelEdit(item)">
            수정 취소
          </button>
          <button v-else @click="startEditing(item)">수정</button>
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
    initializeEditedItems();
  } catch (err) {
    error.value = err.message;
  } finally {
    isLoading.value = false;
  }
};

const initializeEditedItems = () => {
  store.items.forEach((item) => {
    item.isEditing = false;
    item.editedType = item.type;
    item.editedCategory = item.category;
    item.editedAmount = item.amount;
  });
};

const filteredItems = computed(() => {
  if (!selectedDate.value) return [];
  const selectedDateString = selectedDate.value.toISOString().split('T')[0];
  return store.items.filter((item) => item.date.startsWith(selectedDateString));
});

const startEditing = (item) => {
  item.isEditing = true;
};

const cancelEdit = (item) => {
  item.isEditing = false;
  item.editedType = item.type;
  item.editedCategory = item.category;
  item.editedAmount = item.amount;
};

onMounted(() => {
  fetchItems();
});
</script>
