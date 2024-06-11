import { defineStore } from 'pinia';
import axios from 'axios';
import { ref, computed } from 'vue';

export const useCategoryStore = defineStore('categoryStore', () => {
  // 반응형 상태
  const incomeCategory = ref([]);
  const expenseCategory = ref([]);

  // 액션
  const fetchCategories = async () => {
    try {
      const response = await axios.get('/db.json');
      incomeCategory.value = response.data.incomeCategory;
      expenseCategory.value = response.data.expenseCategory;
    } catch (error) {
      console.error('Error fetching categories:', error);
    }
  };

  // 게터
  const filteredCategories = computed(() => {
    return [...incomeCategory.value, ...expenseCategory.value];
  });

  return {
    incomeCategory,
    expenseCategory,
    filteredCategories,
    fetchCategories,
  };
});
