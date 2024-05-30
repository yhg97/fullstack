<template>
  <div class="row mb-3">
    <div class="col">
      <div class="input-group">
        <input
          id="msg"
          type="text"
          class="form-control"
          name="msg"
          placeholder="할일을 여기에 입력!"
          v-model.trim="todo"
          @keyup.enter="addTodoHandler"
        />
        <span class="btn btn-primary input-group-addon" @click="addTodoHandler"
          >추가</span
        >
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'InputTodo',
  setup() {
    const addTodoHandler = () => {
      if (state.todo.length >= 3) {
        state.emitter.emit('add-todo', state.todo);
        state.todo = '';
      }
    };
    // data() {
    //   return { todo: '' };
    // },
    return { addTodoHandler };
  },
};
</script>
