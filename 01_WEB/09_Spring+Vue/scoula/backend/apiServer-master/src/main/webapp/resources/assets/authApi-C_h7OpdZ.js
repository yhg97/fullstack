import{l as u,a as o,m as i}from"./index-DlP7mT3c.js";const r=u.create({timeout:1e3});r.interceptors.request.use(a=>{const{getToken:t}=o(),e=t();return e&&(a.headers.Authorization=`Bearer ${e}`,console.log(a.headers.Authorization)),a},a=>Promise.reject(a));r.interceptors.response.use(a=>a.status===200?a:a.status===404?Promise.reject("404: 페이지 없음 "+a.request):a,async a=>{var t;if(((t=a.response)==null?void 0:t.status)===401){const{logout:e}=o();return e(),i.push("/auth/login?error=login_required"),Promise.reject({error:"로그인이 필요한 서비스입니다."})}return Promise.reject(a)});const s="/api/member",n={"Content-Type":"multipart/form-data"},c={async checkUsername(a){const{data:t}=await r.get(`${s}/checkusername/${a}`);return console.log("AUTH GET CHECKUSERNAME",t),t},async create(a){const t=new FormData;t.append("username",a.username),t.append("email",a.email),t.append("password",a.password),t.append("mbti",a.mbti),a.avatar&&t.append("avatar",a.avatar);const{data:e}=await r.post(s,t,n);return console.log("AUTH POST: ",e),e},async update(a){const t=new FormData;t.append("username",a.username),t.append("password",a.password),t.append("email",a.email),a.avatar&&t.append("avatar",a.avatar);const{data:e}=await r.put(`${s}/${a.username}`,t,n);return console.log("AUTH PUT: ",e),e}};export{c as a};
