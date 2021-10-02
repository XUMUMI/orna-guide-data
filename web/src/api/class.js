import axios from "axios";

export const search = async function (name) {
  const response = await axios.get("/api/class/search", { params: { name } });
  return response.data;
};
