export default [
  {
    path: '/weather',
    name: 'weather',
    component: () => import('../pages/weather/WeatherPage.vue'),
  },
];
