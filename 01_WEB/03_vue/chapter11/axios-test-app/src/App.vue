<template>
  <div>
    <h2>서브웨이</h2>
  </div>
</template>
<script>
import axios from 'axios';
const requestAPI = () => {
  // const url = "http://localhost:3000/todos/1";
  const url = '/api/todos/1';
  axios.get(url).then((response) => {
    console.log('# 응답객체 : ', response);
  });
};
requestAPI();
</script>
