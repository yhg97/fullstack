import{i as o}from"./index-D2_ZHuhr.js";const a="/api/board",p={"Content-Type":"multipart/form-data"},r={async getList(t){const{data:e}=await o.get(a,{params:t});return console.log("BOARD GET LIST: ",e),e},async create(t){const e=new FormData;if(e.append("title",t.title),e.append("writer",t.writer),e.append("content",t.content),t.files)for(let n=0;n<t.files.length;n++)e.append("files",t.files[n]);const{data:s}=await o.post(a,e,{headers:p});return console.log("BOARD POST: ",s),s},async get(t){const{data:e}=await o.get(`${a}/${t}`);return console.log("BOARD GET",e),e},async delete(t){const{data:e}=await o.delete(`${a}/${t}`);return console.log("BOARD DELETE: ",e),e},async update(t){const e=new FormData;if(e.append("no",t.no),e.append("title",t.title),e.append("writer",t.writer),e.append("content",t.content),t.files)for(let n=0;n<t.files.length;n++)e.append("files",t.files[n]);const{data:s}=await o.put(`${a}/${t.no}`,t,{headers:p});return console.log("BOARD PUT: ",s),s},async deleteAttachment(t){const{data:e}=await o.delete(`${a}/deleteAttachment/${t}`);return console.log("ATTACHMENT DELETE: ",e),e}};export{r as b};
