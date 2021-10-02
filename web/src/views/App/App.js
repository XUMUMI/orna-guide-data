import Search from "@/components/Search/Search.vue";
import Header from "@/components/Header/Header.vue";
import { search } from "@/api/class";

export default {
  name: "App",
  components: { Search, Header },
  methods: {
    async getClass(keyword) {
      console.log(keyword);
      return await search(keyword);
    },
  },
};
