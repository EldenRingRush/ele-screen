<template>
  <div>
    <div id="leftChart" style="height: 100%;width: 100%"></div>
    <div  style="height: 20%;width: 100%;display:flex;flex-direction: row">

    </div>
  </div>

</template>

<script>
export default {
  name: "center-low1",
  methods:{
    leftChart(){
      var leftChart = this.$echarts.init(document.getElementById("leftChart"))
      var option = {
        title: {
          text: '仪表负荷1',
          left:'center',
          textStyle:{
            fontsize:5,
            color: '#CC00FF',

          }
        },
        tooltip: {
          formatter: '{a} <br/>{b} : {c}%'
        },
        series: [
          {
            type: 'gauge',
            progress: {
              show: true,
              width: 2
            },
            axisLine: {
              lineStyle: {
                width: 6
              }
            },
            axisTick: {
              show: false
            },
            splitLine: {
              length: 15,
              lineStyle: {
                width: 2,
                color: '#999'
              }
            },
            axisLabel: {
              distance: 25,
              color: '#999',
              fontSize: 2
            },
            anchor: {
              show: true,
              showAbove: true,
              size: 2,
              itemStyle: {
                borderWidth: 2
              }
            },
            title: {
              show: false
            },
            detail: {
              valueAnimation: true,
              fontSize: 10,
              offsetCenter: [0, '70%']
            },
            data: [
              {
                value: 70
              }
            ]
          }
        ]
      };
      leftChart.setOption(option);
    }
  },
  mounted() {
    this.leftChart();
  }
}
</script>

<style scoped>

</style>