<template>
  <div>
    <form @submit.prevent="submitForm">
      <VueDatePicker
        v-model="date"
        :enable-time-picker="false"
        locale="ko"
        :autoclose="false"
      />
      <div class="input-group mb-3">
        <select
          v-model="type"
          class="form-select"
          id="inputGroupSelect02"
          required
        >
          <option value="" disabled>수입, 지출</option>
          <option value="수입">수입</option>
          <option value="지출">지출</option>
        </select>
      </div>
      <div class="input-group mb-3">
        <select
          v-model="category"
          class="form-select"
          id="inputGroupSelect02"
          required
        >
          <option value="" disabled>카테고리</option>
          <option
            v-for="item in filteredCategories"
            :key="item.id"
            :value="item.category"
          >
            {{ item.category }}
          </option>
        </select>
      </div>
      <input
        class="input-group mb-3"
        v-model="detailCategory"
        placeholder="자세한 내용"
      />
      <div class="input-group mb-3">
        <input
          v-model="formattedAmount"
          @input="formatAmount"
          @focus="unformatAmount"
          @blur="formatAmount"
          class="form-control"
          type="text"
          placeholder="금액"
          required
        />
        <span class="input-group-text">원</span>
      </div>
      <input
        class="input-group mb-3"
        v-model="memo"
        type="text"
        placeholder="메모"
        @keyup.enter="checkMemoField"
      />
      <button type="submit">저장</button>
      <button type="button" @click="cancelForm">취소</button>
    </form>

    <!-- 저장 완료 알림 메시지 -->
    <div v-if="isSaved" class="alert alert-success" role="alert">
      저장이 완료되었습니다.
      <button @click="goToHomePage" type="button" class="btn btn-primary">
        확인
      </button>
    </div>
  </div>
</template>

<script setup>
import { ref, computed, onMounted, watch } from 'vue';
import VueDatePicker from '@vuepic/vue-datepicker';
import '@vuepic/vue-datepicker/dist/main.css';
import { useRouter } from 'vue-router';
import { useDateStore } from '@/stores/dateStore';
import { useCategoryStore } from '@/stores/categoryStore';

const router = useRouter();
const dateStore = useDateStore();
const categoryStore = useCategoryStore();

const date = ref(new Date());
const type = ref('');
const category = ref('');
const detailCategory = ref('');
const amount = ref(0);
const memo = ref('');
const formattedAmount = ref('');
const isSaved = ref(false);

const filteredCategories = computed(() => {
  return categoryStore.filteredCategories;
});

onMounted(() => {
  categoryStore.fetchCategories();
});

const formatAmount = () => {
  if (!formattedAmount.value) return;
  const numberValue = parseFloat(formattedAmount.value.replace(/,/g, ''));
  formattedAmount.value = numberValue.toLocaleString('ko-KR');
  amount.value = numberValue;
};

const unformatAmount = () => {
  formattedAmount.value = formattedAmount.value.replace(/,/g, '');
};

const submitForm = () => {
  const budgetItem = {
    date: date.value,
    type: type.value,
    category: category.value,
    detailCategory: detailCategory.value,
    amount: amount.value,
    memo: memo.value,
  };
  dateStore.addBudgetItem(budgetItem);
  isSaved.value = true;
};

const cancelForm = () => {
  date.value = new Date();
  type.value = '';
  category.value = '';
  detailCategory.value = '';
  formattedAmount.value = '';
  amount.value = 0;
  memo.value = '';
  isSaved.value = false;
};

const checkMemoField = (event) => {
  if (event.target.value.trim() !== '') {
    submitForm();
  }
};

const goToHomePage = () => {
  router.push('/');
};

watch(type, (newValue) => {
  if (newValue === '수입') {
    const defaultIncomeCategory = categoryStore.incomeCategory.find(
      (item) => item.category === '월급'
    );
    if (defaultIncomeCategory) {
      category.value = defaultIncomeCategory.category;
    }
  } else if (newValue === '지출') {
    const defaultExpenseCategory = categoryStore.expenseCategory.find(
      (item) => item.category === '세금'
    );
    if (defaultExpenseCategory) {
      category.value = defaultExpenseCategory.category;
    }
  }
});
</script>

<style scoped>
.input-group-text {
  background-color: #f8f9fa;
  border: 1px solid #ced4da;
  border-left: 0;
}

.input-group.mb-3 {
  position: relative;
}

.input-group.mb-3 input.form-control {
  text-align: right;
  padding-right: 3rem;
}

.input-group.mb-3 .input-group-text {
  position: absolute;
  right: 0;
  top: 0;
  bottom: 0;
  display: flex;
  align-items: center;
}
</style>
