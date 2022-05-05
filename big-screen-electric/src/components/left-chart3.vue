<template>
<div style="height: 100%;width: 100%;">
  <div style="background: linear-gradient(to right,#0066CC,#000,#000);margin-top: 10px;margin-left: 10px;color: #030409">每日气象</div>

  <div style="flex-direction: row;height: 80%;width: 100%;">
    <div style="float: left;width: 50%;height: 100%">
      <div style="height: 50%;width: 100%;">

        <div>
          <i class="el-icon-monitor" style="width: 30px;height: 30px;margin-left: 45%"></i>
          <p style="margin-left: 35%">温度 40</p>
        </div>
      </div>

      <div style="height: 50%;width: 100%">
        <template><i class="el-icon-top-right" style="width: 30px;height: 30px;margin-left: 45%"></i></template>
        <p  style="margin-left: 35%"><i>风向 西南</i></p>
      </div>
    </div>

    <div style="float: right;width: 50%;height: 100%">
      <div style="height: 50%;width: 100%">
        <template><i class="el-icon-sunny" style="width: 30px;height: 30px;margin-left: 45%"></i></template>
        <p  style="margin-left: 35%"><i>天气 晴</i></p>
      </div>

      <div style="height: 50%;width: 100%">
        <template><i class="el-icon-light-rain" style="width: 30px;height: 30px;margin-left: 45%"></i></template>
        <p  style="margin-left: 35%"><i>湿度 0%</i></p>
      </div>
    </div>
  </div>
</div>
</template>

<script>
export default {
  name: "left-chart3"
}
</script>

<style scoped>

</style>