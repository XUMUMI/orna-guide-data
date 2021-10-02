import Item from "@/components/Item/Item.vue";

export default {
  name: "search",
  components: {
    Item,
  },
  props: {
    submit: Function,
  },
  data() {
    return {
      keyword: "",
      results: {},
    };
  },
  created() {
    this.getResults().then();
  },
  methods: {
    async getResults() {
      this.results = await this.submit(this.keyword);
    },
  },
};
