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
          <div v-if="editIndex === index">
            <input v-model="editItem.date" placeholder="날짜" />
            <input v-model="editItem.type" placeholder="타입" />
            <input v-model="editItem.category" placeholder="카테고리" />
            <input v-model="editItem.amount" placeholder="금액" type="number" />
            <button @click="saveEdit(index)">저장</button>
            <button @click="cancelEdit">취소</button>
          </div>
          <div v-else>
            <p>날짜: {{ item.date }}</p>
            <p>타입: {{ item.type }}</p>
            <p>카테고리: {{ item.category }}</p>
            <p>금액: {{ item.amount }}</p>
            <button @click="startEdit(item, index)">수정</button>
          </div>
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

const editIndex = ref(null);
const editItem = ref({});

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

const startEdit = (item, index) => {
  editIndex.value = index;
  editItem.value = { ...item };
};

const saveEdit = async (index) => {
  // 항목을 스토어에 저장
  await store.updateItem(index, editItem.value);
  // 항목 목록을 갱신
  await fetchItems();
  editIndex.value = null;
};

const cancelEdit = () => {
  editIndex.value = null;
};

onMounted(() => {
  fetchItems();
});
</script>
