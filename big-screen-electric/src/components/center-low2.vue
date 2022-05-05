<template>
  <div>
    <div id="centerChart" style="height: 100%;width: 100%"></div>

  </div>

</template>

<script>
export default {
  name: "center-low1",
  methods:{
    centerChart(){
      var centerChart = this.$echarts.init(document.getElementById("centerChart"))
      var option = {
        title: {
          text: '仪表负荷2',
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
                value: 50
              }
            ]
          }
        ]
      };
      centerChart.setOption(option);
    }
  },
  mounted() {
    this.centerChart();
  }
}
</script>

<style scoped>

</style>