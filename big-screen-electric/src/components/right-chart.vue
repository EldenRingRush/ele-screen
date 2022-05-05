<template>
  <div style="height: 100%;width: 100%">
    <dv-border-box5 style="height: 50%;width: 60%;position: absolute;margin-left: 1%">
      <div style="font-weight: bold;font-size: 30px;padding-left: 20%;padding-top: 5%"><span style="font-size: 50px;
      color: #00c0ff;
      margin-right: 15px;">0</span>件</div>
      <div  style="font-weight: bold;font-size: 20px;padding-left: 20%"><span>同比</span>  81</div>
      <div  style="font-weight: bold;font-size: 20px;padding-left: 20%"><span>环比</span>  15</div>
    </dv-border-box5>
    <div style="margin-left: 60%;height: 30px;width: 38%;position: absolute;margin-top: 12.5%">
      <span style="padding-left: 15px">运维人均工作量</span>
      <dv-decoration-3 style="height: 20px;width: 100%" />
    </div>

    <div style="margin-left: 1%;height: 30px;width: 38%;position: absolute;margin-top: 55%">
      <span style="padding-left: 15px">当月维修任务量</span>
      <dv-decoration-3 style="height: 20px;width: 100%" />
    </div>
    <dv-border-box5  :reverse="true" style="height: 50%;width: 60%;position: absolute;margin-top: 35%;margin-left: 40%">
      <div style="font-weight: bold;font-size: 25px;padding-left: 26%;padding-top: 10%"><span style="font-size: 50px;
      color: #00c0ff;
      margin-right: 15px;">0.1</span>件/日</div>
      <div  style="font-weight: bold;font-size: 20px;padding-left: 26%"><span>同比</span>  66</div>
      <div  style="font-weight: bold;font-size: 20px;padding-left: 26%"><span>环比</span>  9</div>
    </dv-border-box5>
  </div>
</template>

<script>
export default {
  name: "right-chart"
}
</script>

<style lang="less">

</style>