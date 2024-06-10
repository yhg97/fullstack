<template>
  <div>
    <form @submit.prevent="submitForm">
      <div class="input-group mb-3">
        <select v-model="name" class="form-select" id="inputGroupSelect02">
          <option value="" disabled>수입,지출</option>
          <option value="수입">수입</option>
          <option value="지출">지출</option>
        </select>
      </div>
      <div class="input-group mb-3">
        <select v-model="category" class="form-select" id="inputGroupSelect02">
          <option value="" disabled>카테고리</option>
          <option value="금융">금융</option>
          <option value="병원">병원</option>
        </select>
      </div>
      <input
        class="input-group mb-3"
        v-model="detailCategory"
        placeholder="자세한 내용"
      />
      <input
        class="input-group mb-3"
        v-model="amount"
        type="number"
        placeholder="Amount"
      />
      <button type="submit">저장</button>
    </form>
  </div>
</template>
<script setup></script>
