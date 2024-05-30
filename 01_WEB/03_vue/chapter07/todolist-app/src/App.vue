<template>
  <div class="container">
    <div class="card card-body bg-light">
      <div class="title">:: TodoList App</div>
    </div>
    <div class="card card-default card-borderless">
      <div class="card-body">
        <InputTodo
          :todoList="state.todoList"
          @delete-todo="deleteTodo"
          @toggle-completed="toggleCompleted"
        ></InputTodo>
      </div>
    </div>
  </div>
</template>

<script>
import TodoList from './components/TodoList.vue';
import InputTodo from './components/InputTodo.vue';
import { reactive, onMounted } from 'vue';

export default {
  name: 'App',
  components: { InputTodo, TodoList },
  setup() {
    const ts = new Date().getTime();
    const state = reactive({ todoList: [] });

    onMounted(() => {
      state.todoList.push({ id: ts, todo: '자전거 타기', completd: faslse });
      state.todoList.push({
        id: ts + 1,
        todo: '딸과 공원 산책',
        completd: true,
      });
      state.todoList.push({
        id: ts + 2,
        todo: '일요일 애견 카페',
        completd: faslse,
      });
      state.todoList.push({
        id: ts + 3,
        todo: 'Vue 원고 집필',
        completd: faslse,
      });
    });

    const addTodo = (todo) => {
      if (todo.length >= 2) {
        state.todoList.push({
          id: new Date().getTime(),
          todo: todo,
          completed: false,
        });
      }
    };
    const deleteTodo = (id) => {
      let index = state.todoList.findIndex((item) => id === item.id);
      state.todoList.splice(index, 1);
    };
    const toggleCompleted = (id) => {
      let index = state.todoList.findIndex((item) => id === item.id);
      state.todoList[index].completd = !state.todoList[index].completd;
    };
    return { state, addTodo, deleteTodo, toggleCompleted };
  },
};
</script>
