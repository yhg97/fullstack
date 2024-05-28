<template>
  <div>
    <InputName @nameChanged="onNameChangedHandler" />
    <br />
    <h3>App 데이터 :{{ parentName }}</h3>
  </div>
</template>

<script>
import InputName from './components/InputName.vue';
export default {
  name: 'App',
  components: { InputName },
  data() {
    return {
      parentName: '',
    };
  },
  methods: {
    onNameChangedHandler(e) {
      this.parentName = e.name;
    },
  },
};
</script>
