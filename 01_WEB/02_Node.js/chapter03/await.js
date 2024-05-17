async function init() {
  try {
    const reponse = await fetch('https://jsonplaceholder.typicode.com/users');
    const users = await reponse.json();
    console.log(users);
  } catch (err) {
    console.error(err);
  }
}

init();
