<template>
  <div class="search">
    <div class="cont">
      <Item
        v-for="result in results"
        :key="result"
        :src="result.image"
        :name="result.name"
      />
    </div>
    <div class="searcher">
      <input type="text" v-model="keyword" class="input" />
      <button @click="getResults" class="submit">→</button>
    </div>
  </div>
</template>

<script src="./Search.js" />

<style scoped lang="scss" src="./Search.scss" />
