const serverUrl = `http://localhost:8080`;
module.exports = {
  devServer: {
    proxy: {
      "/api": {
        target: serverUrl,
        changeOrigin: true,
        pathRewrite: {
          "^/api": "",
        },
      },
    },
  },
};
