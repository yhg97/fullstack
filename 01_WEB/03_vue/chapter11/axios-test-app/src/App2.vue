<template>
  <div>
    <h2>서브웨이</h2>
  </div>
</template>
<script>
import axios from 'axios';
const listUrl = '/api/todos';
const todoUrlPrefix = '/api/todos/';

const requestAPI = async () => {
  let response = await axios.get(listUrl);
  // let todoList;

  let todoList = response.data;
  console.log('# TodoList:', todoList);
  for (let i = 0; i < todoList.length; i++) {
    response = await axios.get(todoUrlPrefix + todoList[i].id);
    console.log(`# ${i + 1}번째 Todo :`, response.data);
  }
};
requestAPI();
</script>
