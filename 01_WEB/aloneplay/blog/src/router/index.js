import { createRouter, createWebHistory } from 'vue-router';
import Home from '../views/Home.vue';
import ge from '../views/ge.vue';
import login from '../views/login.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home,
    },
    {
      path: '/login',
      name: 'login',
      component: login,
    },
    // {
    //   path: '/ge',
    //   name: 'ge',
    //   component: ge,
    // },
  ],
});

export default router;
