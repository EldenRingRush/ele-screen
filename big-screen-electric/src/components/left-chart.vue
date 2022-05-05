<template>
<div style="display: flex;flex-direction: column">
  <left-chart1 style="width: 100%;height: 33%;margin-top: 0%;position: absolute"></left-chart1>
  <left-chart2 style="width: 100%;height: 33%;margin-top: 50%;position: absolute"></left-chart2>
  <left-chart3 style="width: 100%;height: 33%;margin-top: 100%;position: absolute"></left-chart3>
</div>
</template>

<script>
import LeftChart1 from "@/components/left-chart1";
import LeftChart2 from "@/components/left-chart2";
import LeftChart3 from "@/components/left-chart3";
export default {
  name: "left-chart",
  components: {LeftChart3, LeftChart2, LeftChart1}
}
</script>

<style scoped>

</style>