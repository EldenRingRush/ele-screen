<template>
  <div id="'app">
    <datav />
  </div>
</template>

<script>
import datav from './components/index-datav'

export default {
  name:"app",
  components:{
    datav
  },
  data(){
    return{

    }
  }
}


</script>

<style lang="less">
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  width: 1920px;
  height: 1080px;
}
</style>