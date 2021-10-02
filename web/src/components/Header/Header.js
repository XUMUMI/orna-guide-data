import images from "@/api/images";

export default {
  name: "Header",
  props: {
    title: String,
  },
  data() {
    return {
      background: images.header,
    };
  },
};
