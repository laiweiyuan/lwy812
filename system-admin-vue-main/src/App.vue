<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
  export default {
    name: 'app'
  }
</script>

<style>
  html,
  body,
  #app {
    height: 100%;
    padding: 0;
    margin: 0;
    width: 100%;
  }
  a{
    text-decoration: none !important;
  }
</style>
