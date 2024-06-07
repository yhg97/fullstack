import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import a from '@/pages/A.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/a',
      name: 'a',
      component: a,
    },
  ],
});

export default router;
