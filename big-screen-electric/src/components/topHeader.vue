<template>
  <div id="top-header">

    <div class="header-time">{{nowTime}}</div>
    <dv-decoration-8 class="header-left-decoration" />
    <dv-decoration-11 class="header-center-decoration">可视化大屏展示</dv-decoration-11>
    <dv-decoration-8 class="header-right-decoration" :reverse="true" />
    <dv-border-box10 style="position: absolute;
                     width: 100px;
                     height: 35px;
                     line-height: 35px;
                     margin-left: 78%;
                     text-align:center;
                     margin-top: 40px">
      设备监控
    </dv-border-box10>

    <!--这里用一个div覆盖边框可以实现点击事件，这里可以使用router实现局部页面跳转-->
    <dv-border-box10 style="position: absolute;
                     width: 100px;
                     height: 35px;
                     line-height: 35px;
                     margin-left: 68%;
                     text-align:center;
                     margin-top: 40px">
      综合数据
    </dv-border-box10>
    <div style="position: absolute;
                width: 100px;
                height: 35px;
                line-height: 35px;
                margin-left: 68%;
                text-align:center;
                margin-top: 40px;
                background-color: transparent"
                @click="turnPage('/mainBox')">
    </div>

    <dv-border-box12 style="position: absolute;
                     width: 100%;
                     height: 70%;
                     margin-top: 6.5%;"></dv-border-box12>
    <div style="position: absolute;
                width: 100%;
                height: 70%;
                margin-top: 6.5%;">
      <router-view style="position: absolute; width: 100%; height: 100%;"></router-view>
    </div>

  </div>
</template>

<script>

export default {
  name: 'TopHeader',
  data() {
    return{
      nowTime:"",
    }
  },
  mounted() {
    this.nowTimes()
  },

  methods:{
    turnPage(path){
      this.$router.push(path);
    },
    timeFormate(timeStamp) {
      let year = new Date(timeStamp).getFullYear();
      let month =new Date(timeStamp).getMonth() + 1 < 10? "0" + (new Date(timeStamp).getMonth() + 1): new Date(timeStamp).getMonth() + 1;
      let date =new Date(timeStamp).getDate() < 10? "0" + new Date(timeStamp).getDate(): new Date(timeStamp).getDate();
      let hh =new Date(timeStamp).getHours() < 10? "0" + new Date(timeStamp).getHours(): new Date(timeStamp).getHours();
      let mm =new Date(timeStamp).getMinutes() < 10? "0" + new Date(timeStamp).getMinutes(): new Date(timeStamp).getMinutes();
      let ss =new Date(timeStamp).getSeconds() < 10? "0" + new Date(timeStamp).getSeconds(): new Date(timeStamp).getSeconds();
      var d = new Date(timeStamp).getDay();
      let day;
      if (d == 0) {
        day = "日";
      } else if (d == 1) {
        day = "一";
      } else if (d == 2) {
        day = "二";
      } else if (d == 3) {
        day = "三";
      } else if (d == 4) {
        day = "四";
      } else if (d == 5) {
        day = "五";
      } else if (d == 6) {
        day = "六";
      }
      this.nowTime = hh+":"+mm+':'+ss+" "+year + "/" + month + "/" + date+" "+ "星期"+day;
    },
    nowTimes(){
      this.timeFormate(new Date());
      setInterval(this.nowTimes,1000);
      this.clear()
    },
    clear(){
      clearInterval(this.nowTimes)
      this.nowTimes = null;
    },}
}
</script>

<style lang="less">
#top-header {
  position: relative;
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: space-between;
  flex-shrink: 0;
  .header-center-decoration {
    width: 30%;
    height: 60px;
    margin-top: 20px;
    font-size: x-large;
    font-family: 宋体;
  }
  .header-time {
    width: 25%;
    height: 60px;
    font-family: 宋体;
    font-size: large;
    position: absolute;
    top: 10px;
    left: 6%;
  }
  .header-left-decoration, .header-right-decoration {
    width: 25%;
    height: 60px;
  }
  .center-title {
    position: absolute;
    font-size: 30px;
    font-weight: bold;
    left: 50%;
    top: 15px;
    transform: translateX(-50%);
  }
  .right-label {
    width: 120px;
    height: 50px;
    line-height: 50px;
    text-align: center;
    margin-left:200px;
    font-family: 宋体;
  }
}
</style>