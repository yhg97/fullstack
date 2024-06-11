<template>
  <header id="header">
    <div class="d-flex flex-column">
      <div class="profile">
        <img src="../image/pig.png" alt="" class="img-fluid rounded-circle" />
        <h1 class="text-light"><router-link to="/">Alex Smith</router-link></h1>
        <div class="social-links mt-3 text-center">
          <div>
            <a
              class="text-white"
              href="https://github.com/jhchoi1104/Account_book_KB"
              target="_blank"
              style="font-size: 24px"
            >
              <i class="fab fa-github"></i>
            </a>
          </div>
        </div>
      </div>

      <nav id="navbar" class="nav-menu navbar">
        <ul>
          <li>
            <router-link to="/" class="nav-link scrollto active"
              ><i class="bx bx-home"></i> <span>Home</span></router-link
            >
          </li>
          <li>
            <router-link to="/history" class="nav-link scrollto"
              ><i class="bx bx-user"></i> <span>내역</span></router-link
            >
          </li>
          <li>
            <router-link to="/Modification" class="nav-link scrollto"
              ><i class="bx bx-file-blank"></i> <span>입력</span></router-link
            >
          </li>
          <li>
            <router-link to="/setting" class="nav-link scrollto"
              ><i class="bx bx-book-content"></i>
              <span>프로필설정</span></router-link
            >
          </li>
        </ul>
      </nav>
      <!-- .nav-menu -->
    </div>
  </header>
  <!-- End Header -->
</template>

<script>
export default {
  name: 'Header',
};
</script>

<style scoped>
/* 스타일 추가 (기본적으로 필요한 경우) */
</style>
