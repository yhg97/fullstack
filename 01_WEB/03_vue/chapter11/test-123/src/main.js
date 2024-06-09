import { createApp } from 'vue';
import { createPinia } from 'pinia';
import 'bootstrap/dist/css/bootstrap.css';
import App from './App.vue';
import router from './router';
import './assets/main.css';
import '@fortawesome/fontawesome-free/js/all.js'
import VueDatePicker from '@vuepic/vue-datepicker';
import '@vuepic/vue-datepicker/dist/main.css'

const app = createApp(App);
app.component('VueDatePicker', VueDatePicker);
app.use(createPinia());
app.use(router);

app.mount('#app');
