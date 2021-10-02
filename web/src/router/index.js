import { createRouter, createWebHistory } from "vue-router";

const routes = [
  // {
  //   path: "/",
  //   name: "Home",
  //   // component: Home,
  // },
  {
    path: "/search",
    name: "Search",
    component: () => import("../components/Search/Search.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
