<template>
<div style="display:flex;flex-direction: row">
  <center-low1 style="width: 33%;height: 100%"></center-low1>
  <center-low2 style="width: 33%;height: 100%"></center-low2>
  <center-low3 style="width: 33%;height: 100%"></center-low3>
</div>
</template>

<script>
import CenterLow1 from "@/components/center-low1";
import CenterLow3 from "@/components/center-low3";
import CenterLow2 from "@/components/center-low2";

export default {
  name: "center-low",
  components: {CenterLow2, CenterLow3, CenterLow1}
}
</script>

<style scoped>

</style>