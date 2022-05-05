<template>
<div style="height: 100%;width: 100%">
  <div style="background: linear-gradient(to right,#0066CC,#000,#000);margin-top: 10px;margin-left: 10px;color: #030409">设备状态</div>
  <div id="left2" style="height: 100%;width: 100%"></div>
</div>
</template>

<script>
export default {
  name: "left-chart2",
  methods:{
    leftChart2(){
      var leftChart2 = this.$echarts.init(document.getElementById('left2'))
      var option = {
        legend: {
          data: ['Allocated Budget', 'Actual Spending']
        },
        radar: {
          // shape: 'circle',
          indicator: [
            { name: 'Sales', max: 6500 },
            { name: 'Administration', max: 16000 },
            { name: 'Information Technology', max: 30000 },
            { name: 'Customer Support', max: 38000 },
            { name: 'Development', max: 52000 },
            { name: 'Marketing', max: 25000 }
          ],
          radius:50
        },
        series: [
          {
            name: 'Budget vs spending',
            type: 'radar',
            data: [
              {
                value: [4200, 3000, 20000, 35000, 50000, 18000],
                name: 'Allocated Budget'
              },
              {
                value: [5000, 14000, 28000, 26000, 42000, 21000],
                name: 'Actual Spending'
              }
            ]
          }
        ]
      }
      leftChart2.setOption(option)
    }
  },
  mounted() {
    this.leftChart2();
  }
}
</script>

<style scoped>

</style>