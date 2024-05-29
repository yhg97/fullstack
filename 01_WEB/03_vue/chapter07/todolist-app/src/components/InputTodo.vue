<template>
  <div class="input-todo">
    <input
      v-model="newTodo"
      @keyup.enter="submitTodo"
      placeholder="새 할 일을 입력하세요"
    />
    <button @click="submitTodo">추가</button>
  </div>
</template>

<script>
export default {
  name: 'InputTodo',
  data() {
    return {
      newTodo: '',
    };
  },
  methods: {
    submitTodo() {
      if (this.newTodo.trim() !== '') {
        this.$emit('add-todo', this.newTodo);
        this.newTodo = '';
      }
    },
  },
};
</script>

<style scoped>
.input-todo {
  display: flex;
  gap: 10px;
}

.input-todo input {
  flex: 1;
  padding: 8px;
  font-size: 16px;
}

.input-todo button {
  padding: 8px 12px;
  font-size: 16px;
  cursor: pointer;
}
</style>
