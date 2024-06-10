import { defineStore } from 'pinia';
import axios from 'axios';

export const useCategoryStore = defineStore('categoryStore', {
  state: () => ({
    incomeCategory: [],
    expenseCategory: [],
  }),
  actions: {
    async fetchCategories() {
      try {
        const response = await axios.get('/db.json');
        this.incomeCategory = response.data.incomeCategory;
        this.expenseCategory = response.data.expenseCategory;
      } catch (error) {
        console.error('Error fetching categories:', error);
      }
    },
  },
});
