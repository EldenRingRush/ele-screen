<template>
  <div>
    <div style="width: 25%;height: 95%;padding: 5px; position: absolute;margin-top: 10px;margin-left: 1%;">
      <!--左框-->
      <left-chart></left-chart>
    </div>
    <div style="width: 25%;height: 40%; margin-left: 74%;margin-top: 350px;position: absolute;">
      <!--最新资讯-->
        <div style="background: linear-gradient(to right,#0066CC,#000,#000);margin-top: 10px;margin-left: 10px;color: #030409">最新资讯</div>
        <dv-scroll-board :config="config" style="margin-left:1rem;width:95%;height:69%; padding-top: 1%" />
    </div>
    <div style="position: absolute;width: 25%;height: 55%; margin-left: 74%; margin-top: 1%">
      <!--右上-->
      <div style="background: linear-gradient(to right,#0066CC,#000,#000);margin-top: 10px;margin-left: 10px;color: #030409">设备运维</div>
      <right-chart></right-chart>
    </div>
    <div ref="openingChart" style="width:35%;height: 59%; margin-left: 35%;margin-top: 1%"></div>

    <dv-border-box6 style="position: absolute;width: 45%;height: 36.5%; margin-left: 28%;">
      <div style="background: linear-gradient(to right,#0066CC,#000,#000);margin-top: 10px;margin-left: 10px;color: #030409">设备监视</div>
      <!--中下-->
      <center-low style="height: 100%"></center-low>
    </dv-border-box6>
  </div>
</template>

<script>

import jiangsu from "@/assets/jiangsu.json"
import CenterLow from "@/components/center-low";
import RightChart from "@/components/right-chart";
import LeftChart from "@/components/left-chart";
import Axios from "axios";

export default {
  name: "MainBox",
  components: {LeftChart, RightChart, CenterLow},
  data(){
    return {
      //轮播表
      config:{
        data: [
          [1],[2],[3],[4],[5],[6],[7],[8]
        ],
        rowNum: 7, // 表行数
        waitTime: 2000, // 轮播时间间隔(ms)
        //align: ['center'],
        oddRowBGC: 'transparent', // 奇数行背景色
        evenRowBGC: 'transparent', // 偶数行背景色

      },

      seriesData:[
      {
        name:'南京市',
        value:'100',
      },
      {
        name: '扬州市',
        value: '80'
      },
      {
        name: '镇江市',
        value: '90'
      },
      {
        name: '泰州市',
        value: '70'
      },
      {
        name: '南通市',
        value: '100'
      },
      {
        name: '连云港市',
        value: '150'
      },
      {
        name: '苏州市',
        value: '120'
      },
      {
        name: '徐州市',
        value: '95'
      },
      {
        name: '宿迁市',
        value: '85'
      },
      {
        name: '淮安市',
        value: '75'
      },
      {
        name: '盐城市',
        value: '190'
      },
      {
        name: '常州市',
        value: '20'
      },{
        name: '无锡市',
        value: '120'
      }
    ]

    }
  },
  created() {
    const _this = this
    Axios.get('http://localhost:8010/jsoup').then(function (resp){
      _this.config = resp.data
    })

    Axios.get('http://localhost:8011/find').then(function (resp){
      console.log(resp.data['geoData'])
      _this.seriesData=resp.data['geoData']
      console.log(_this.seriesData)
      _this.initChart();
    })

  },


  watch:{
    seriesData:function (newVal,oldVal){
      console.log(newVal)
      console.log(oldVal)
      this.initChart()
      }
      ,deep: true,
    },
  methods:{
    //map
    initChart(){
      this.$echarts.registerMap("jiangsu",jiangsu)
      let openingChart = this.$echarts.init(this.$refs.openingChart)

      const option={
        title:{
          text:'江苏省可再生能源产能',
          left:'center',
          textStyle:{
            color: '#CC00FF',
            textAlign: 'center'
          }
        },

        text:'江苏省',
        geo:{
          map:'jiangsu',

        },
        tooltip: {
          trigger:'item',
        },
        geoIndex:1,
        visualMap: {
          min: 0,
          max: 200,
          text: ['High', 'Low'],
          textStyle: {
            color: '#CC00FF',
          },
          realtime: false,
          calculable: true,
          inRange: {
            color: ['#66ccff', '#6666cc', '#330099']
          }
        },

        series:[
          {
            name:'江苏省可再生能源产能',
            type:'map',
            map:'jiangsu',
            geoIndex: 1,
            label: {
              normal: {
                show: true
              },
              emphasis: {
                show: false
              }
            },
            roam: false,
            data: this.seriesData
          }
        ]
      }
      openingChart.setOption(
          (option)
      )

      },

    jsoup(){
      const _this = this
      Axios.get('http://localhost:8010/jsoup').then(function (resp){
        _this.config = resp.data
      })
    },

    jsoupByDay(){
      this.jsoup();
      setInterval(this.jsoupByDay,86400000);
      this.clear()
    },
    clear(){
      clearInterval(this.jsoupByDay)
      this.jsoupByDay = null;
    }
    },

  mounted() {
    this.initChart()
    this.jsoupByDay()
  }
}
</script>

<style lang="less">
</style>