import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import History from '@/pages/history.vue';
import Setting from '@/pages/Setting.vue'
import Modification from '@/pages/Modification.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/history',
      name: 'history',
      component: History,
    },
    {
      path: '/modification',
      name: 'modification',
      component: Modification,
    },
    {
      path: '/setting',
      name: 'Setting',
      component: Setting,
    },
  ],
});

export default router;
