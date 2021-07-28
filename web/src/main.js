import { createApp } from "vue";
import App from "./views/App/App.vue";
import "./registerServiceWorker";
import router from "./router";

createApp(App).use(router).mount("#app");
