import{u as _,b as d,r as h,o as w,d as y,e as s,g as o,n as g,t as k,w as r,v as n,h as x}from"./index-B3bZLvt3.js";import{a as u}from"./authApi-C4fq2-WP.js";const D={class:"mt-5 mx-auto",style:{width:"500px"}},I=s("h1",{class:"my-5"},[s("i",{class:"fa-solid fa-user-plus"}),o(" 회원 가입 ")],-1),U={class:"mb-3 mt-3"},V={for:"username",class:"form-label"},B=s("i",{class:"fa-solid fa-user"},null,-1),E=s("label",{for:"avatar",class:"form-label"},[s("i",{class:"fa-solid fa-user-astronaut"}),o(" 아바타 이미지: ")],-1),S={class:"mb-3 mt-3"},j=s("label",{for:"email",class:"form-label"},[s("i",{class:"fa-solid fa-envelope"}),o(" email ")],-1),C={class:"mb-3"},M=s("label",{for:"password",class:"form-label"},[s("i",{class:"fa-solid fa-lock"}),o(" 비밀번호: ")],-1),N={class:"mb-3"},T=s("label",{for:"password",class:"form-label"},[s("i",{class:"fa-solid fa-lock"}),o(" 비밀번호 확인: ")],-1),z={class:"mb-3 mt-3"},A=s("label",{for:"mbti",class:"form-label"},[s("i",{class:"fa-solid fa-envelope"}),o(" mbti ")],-1),J=["disabled"],P=s("i",{class:"fa-solid fa-user-plus"},null,-1),G={__name:"JoinPage",setup(R){const p=_(),c=d(null),i=d(""),e=h({username:"hong",email:"hong@gmail.com",password:"12",password2:"12",mbti:"eeee",avatar:null}),t=d(!0),f=async()=>{if(!e.username)return alert("사용자 ID를 입력하세요.");t.value=await u.checkUsername(e.username),console.log(t.value,typeof t.value),i.value=t.value?"이미 사용중인 ID입니다.":"사용가능한 ID입니다."},b=()=>{t.value=!0,e.username?i.value="ID 중복 체크를 하셔야 합니다.":i.value=""},v=async()=>{if(e.password!=e.password2)return alert("비밀번호가 일치하지 않습니다.");c.value.files.length>0&&(e.avatar=c.value.files[0]);try{await u.create(e),p.push({name:"home"})}catch(m){console.error(m)}};return(m,a)=>(w(),y("div",D,[I,s("form",{onSubmit:x(v,["prevent"])},[s("div",U,[s("label",V,[B,o(" 사용자 ID : "),s("button",{type:"button",class:"btn btn-success btn-sm py-0 me-2",onClick:f}," ID 중복 확인 "),s("span",{class:g(t.value.value?"text-primary":"text-danger")},k(i.value),3)]),r(s("input",{type:"text",class:"form-control",placeholder:"사용자 ID",id:"username",onInput:b,"onUpdate:modelValue":a[0]||(a[0]=l=>e.username=l)},null,544),[[n,e.username]])]),s("div",null,[E,s("input",{type:"file",class:"form-control",ref_key:"avatar",ref:c,id:"avatar",accept:"image/png, image/jpeg"},null,512)]),s("div",S,[j,r(s("input",{type:"email",class:"form-control",placeholder:"Email",id:"email","onUpdate:modelValue":a[1]||(a[1]=l=>e.email=l)},null,512),[[n,e.email]])]),s("div",C,[M,r(s("input",{type:"password",class:"form-control",placeholder:"비밀번호",id:"password","onUpdate:modelValue":a[2]||(a[2]=l=>e.password=l)},null,512),[[n,e.password]])]),s("div",N,[T,r(s("input",{type:"password",class:"form-control",placeholder:"비밀번호 확인",id:"password2","onUpdate:modelValue":a[3]||(a[3]=l=>e.password2=l)},null,512),[[n,e.password2]])]),s("div",z,[A,r(s("input",{type:"mbti",class:"form-control",placeholder:"eeee",id:"mbti","onUpdate:modelValue":a[4]||(a[4]=l=>e.mbti=l)},null,512),[[n,e.mbti]])]),s("button",{type:"submit",class:"btn btn-primary mt-4",disabled:t.value},[P,o(" 확인 ")],8,J)],32)]))}};export{G as default};
