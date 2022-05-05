<template>
  <div id="data-view">
    <dv-full-screen-container>
      <top-header />
    </dv-full-screen-container>
  </div>
</template>


<script>
import topHeader from "@/components/topHeader";

export default {
  name:'DataView',
  components:{
    topHeader
  },
  data(){
    return {

    }
  }
}
</script>

<style lang="less">
#data-view {
  width: 1536px;
  height: 721px;
  background-color: #030409;
  color: #fff;
  background-image: url('./img/pageBg.png');
  background-size: 1580px 750px;
  background-attachment: fixed;
  #dv-full-screen-container {
    box-shadow: 0 0 3px blue;
    display: flex;
    flex-direction: column;
  }
  .main-content {
    flex: 1;
    display: flex;
    flex-direction: column;
  }
  .block-left-right-content {
    flex: 1;
    display: flex;
    margin-top: 20px;
  }
  .block-top-bottom-content {
    flex: 1;
    display: flex;
    flex-direction: column;
    box-sizing: border-box;
    padding-left: 20px;
  }
  .block-top-content {
    height: 55%;
    display: flex;
    flex-grow: 0;
    box-sizing: border-box;
    padding-bottom: 20px;
  }
}
</style>