<template>
<div style="height: 100%;width: 100%">
  <div style="background: linear-gradient(to right,#0066CC,#000,#000);margin-top: 10px;margin-left: 10px;color: #030409">设备种类</div>
  <div id="left1" style="height: 100%;width: 100%">

  </div>
</div>
</template>

<script>
export default {
  name: "left-chart1",
  methods:{
    leftChart1(){
      var leftChart1 = this.$echarts.init(document.getElementById('left1'))
      var option = {
        legend:{
          top:'top',

        },
        series: [
          {
            name: 'Nightingale Chart',
            type: 'pie',
            radius: [10, 40],
            center: ['50%', '50%'],
            roseType: 'area',
            itemStyle: {
              borderRadius: 8
            },
            data: [
              { value: 40, name: 'rose 1' },
              { value: 38, name: 'rose 2' },
              { value: 32, name: 'rose 3' },
              { value: 30, name: 'rose 4' },
              { value: 28, name: 'rose 5' },
              { value: 26, name: 'rose 6' },
              { value: 22, name: 'rose 7' },
              { value: 18, name: 'rose 8' }
            ]
          }
        ]
      }
      leftChart1.setOption(option)
    },
  },
  mounted(){
    this.leftChart1()
  }
}
</script>

<style scoped>

</style>