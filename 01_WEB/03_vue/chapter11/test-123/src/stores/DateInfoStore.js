// store.js
import { defineStore } from 'pinia';
import axios from 'axios';

export const useInfoDateStore = defineStore('infoDateStore', {
  state: () => ({
    items: [],
  }),
  actions: {
    async fetchData() {
      try {
        const response = await axios.get('/db.json');
        this.items = response.data.budget.map((item) => ({
          date: item.date,
          type: item.type,
          category: item.category,
          amount: item.amount,
        }));
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    },
  },
});
